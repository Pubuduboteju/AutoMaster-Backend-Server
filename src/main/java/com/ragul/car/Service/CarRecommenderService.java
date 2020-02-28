package com.ragul.car.Service;

import com.ragul.car.Model.CarFeatures;
import com.ragul.car.Repository.CarFeaturesRepository;
import com.ragul.car.dto.CarRecommenderDto;
import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//import org.json.JSONArray;
//import org.json.JSONObject;


@Service
public class CarRecommenderService {
    @Autowired
    CarFeaturesRepository carFeaturesRepository;

    public CarRecommenderDto[] sendInputsForRecom(String carRecommender) {

        String output = "";
        CarRecommenderDto[] finalOutput = new CarRecommenderDto[5];
//        String uri = "https://ussouthcentral.services.azureml.net/workspaces/dd3c03f74fa44e9eb4d5f29c578d6253/services/814665a94ffd452eaae051ebdd9a0bb8/execute?api-version=2.0&details=true";
//        String key = "AspjGsqYCKGgr6Jcu4JKozhvfGGbQw12rcIc9ax73o26LA1Fj+IEYkSMsMuvzWW7F91DF/tAsxK7fKYzghDiZw==";
        String uri = "https://ussouthcentral.services.azureml.net/workspaces/dd3c03f74fa44e9eb4d5f29c578d6253/services/c5db095dcbb5474d83db069cd0bc3117/execute?api-version=2.0&details=true";
        String key = "Ay+HNofgUMyAAyGf4mIBCymWUkHhK+1innm8qECHLycoodhYhXXFk9x+g40Kgld3FvqTr1SXwR3HvjA+X9yYKQ==";
        try {

            Content content = Request.Post(uri)
                    .addHeader("Content-Type", "application/json")
                    // Only needed if using authentication
                    .addHeader("Authorization", "Bearer " + key)
                    // Set the JSON data as the body
                    .bodyString(carRecommender, ContentType.APPLICATION_JSON)
                    // Make the request and display the response.
                    .execute().returnContent();
            System.out.println(content);

            JSONObject jsonObject = new JSONObject(content.toString());
            JSONArray valuesArray = (JSONArray) jsonObject.getJSONObject("Results").getJSONObject("output1").getJSONObject("value").getJSONArray("Values").get(0);
            JSONArray carModelsArray = (JSONArray) jsonObject.getJSONObject("Results").getJSONObject("output1").getJSONObject("value").getJSONArray("ColumnNames");
//            output = valuesArray.get(13).toString();
            List<Double> valuesList = new ArrayList();
            for (int i=13;i<valuesArray.length()-1;i++){
               valuesList.add(Double.parseDouble(valuesArray.getString(i)));
            }
            List<String> carModelsList = new ArrayList();
            for (int i=13;i<carModelsArray.length();i++){
                carModelsList.add(carModelsArray.getString(i));
            }
            System.out.println(valuesList);
            System.out.println( carModelsList);

            ArrayList<CarRecommenderDto> a = new ArrayList<>();
//            for(int i=0; i<valuesList.size();i++){
//                for(int j=0; j< carModelsList.size();j++){
//
//                    if(i==j){
////                        x.setCarValue(Long.valueOf(valuesList.get(i));
//                        x.setCarValue(Double.valueOf(valuesList.get(i).toString()));
//                        x.setCareModel(carModelsList.get(j).toString());
//                    }
//
//                    a.add(x);
//                }
//
//            }
            for(int i=0; i<valuesList.size();i++){
                CarRecommenderDto x = new CarRecommenderDto();
                        x.setCarValue(Double.valueOf(valuesList.get(i).toString()));
                        x.setCareModel(carModelsList.get(i).toString());
                    a.add(x);
            }

            System.out.println(a);
            List<CarRecommenderDto> sortedCarValueList = new ArrayList<CarRecommenderDto>(a);
            sortedCarValueList.sort(Comparator.comparing(CarRecommenderDto::getCarValue).reversed());
            System.out.println(sortedCarValueList);

            finalOutput[0] = sortedCarValueList.get(0);
            finalOutput[1] = sortedCarValueList.get(1);
            finalOutput[2] = sortedCarValueList.get(2);
            finalOutput[3] = sortedCarValueList.get(3);
            finalOutput[4] = sortedCarValueList.get(4);
            finalOutput[0].setCareModel(finalOutput[0].getCareModel().substring(32, finalOutput[0].getCareModel().length()-1));
            finalOutput[1].setCareModel(finalOutput[1].getCareModel().substring(32, finalOutput[1].getCareModel().length()-1));
            finalOutput[2].setCareModel(finalOutput[2].getCareModel().substring(32, finalOutput[2].getCareModel().length()-1));
            finalOutput[3].setCareModel(finalOutput[3].getCareModel().substring(32, finalOutput[3].getCareModel().length()-1));
            finalOutput[4].setCareModel(finalOutput[4].getCareModel().substring(32, finalOutput[4].getCareModel().length()-1));


            ArrayList<CarFeatures> b = new ArrayList<>();
            b.add(carFeaturesRepository.findCarFeaturesByVehicleModel(finalOutput[0].getCareModel().toString()));

            List<CarFeatures> carFeaturesList = new ArrayList<CarFeatures>();
            carFeaturesList.add(carFeaturesRepository.findCarFeaturesByVehicleModel(finalOutput[0].getCareModel().toString()));
            carFeaturesList.add(carFeaturesRepository.findCarFeaturesByVehicleModel(finalOutput[1].getCareModel().toString()));
            carFeaturesList.add(carFeaturesRepository.findCarFeaturesByVehicleModel(finalOutput[2].getCareModel().toString()));
            carFeaturesList.add(carFeaturesRepository.findCarFeaturesByVehicleModel(finalOutput[3].getCareModel().toString()));
            carFeaturesList.add(carFeaturesRepository.findCarFeaturesByVehicleModel(finalOutput[4].getCareModel().toString()));

//            finalOutput[0].setBodyType(carFeaturesList.get(0).getBodyType());
            for(int i=0; i<finalOutput.length; i++){
                finalOutput[i].setVehicleModel(carFeaturesList.get(i).getVehicleModel());
                finalOutput[i].setMake(carFeaturesList.get(i).getMake());
                finalOutput[i].setBodyType(carFeaturesList.get(i).getBodyType());
                finalOutput[i].setFuelType(carFeaturesList.get(i).getFuelType());
                finalOutput[i].setDrivingPerformance(carFeaturesList.get(i).getDrivingPerformance());
                finalOutput[i].setSafety(carFeaturesList.get(i).getSafety());
                finalOutput[i].setSeatingCapacity(carFeaturesList.get(i).getSeatingCapacity());
                finalOutput[i].setComfortRide(carFeaturesList.get(i).getComfortRide());
                finalOutput[i].setFuelEconomy(carFeaturesList.get(i).getFuelEconomy());
                finalOutput[i].setLuxuryLook(carFeaturesList.get(i).getLuxuryLook());
                finalOutput[i].setSportyDesign(carFeaturesList.get(i).getSportyDesign());
                finalOutput[i].setPrestige(carFeaturesList.get(i).getPrestige());
                finalOutput[i].setMarketValue(carFeaturesList.get(i).getMarketValue());
            }

        }
        catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(finalOutput);

        return finalOutput;
    }

    public List<String> findBodyTypeWeights(String sedan, String saloon, String hatchback, String suv, String coupe) throws IOException {
        List<String> carBodyData = new ArrayList();
        carBodyData.add(this.getSentimentalAnalysis(sedan));
        carBodyData.add(this.getSentimentalAnalysis(saloon));
        carBodyData.add(this.getSentimentalAnalysis(hatchback));
        carBodyData.add(this.getSentimentalAnalysis(suv));
        carBodyData.add(this.getSentimentalAnalysis(coupe));

//        String sedanLike = this.getSentimentalAnalysis(sedan);
        System.out.println("Sedan body type like : "+carBodyData.get(0));

//        String saloonLike = this.getSentimentalAnalysis(saloon);
        System.out.println("Saloon body type like : "+carBodyData.get(1));

//        String hatchbackLike = this.getSentimentalAnalysis(hatchback);
        System.out.println("Hatchback body type like : "+carBodyData.get(2));

//        String suvLike = this.getSentimentalAnalysis(suv);
        System.out.println("SUV body type like: "+carBodyData.get(3));

//        String coupeLike = this.getSentimentalAnalysis(coupe);
        System.out.println("Coupe body type like : "+carBodyData.get(4));

        return carBodyData;
    }


    public String getSentimentalAnalysis(String review) throws IOException {
        try {
            String requestUrl = "http://127.0.0.1:8083/NLP?text="+review.replace(" ", "%20");
            URL url = new URL(requestUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setConnectTimeout(3000);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream())
            );
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null ){
                content.append(inputLine);
            }
            String response = content.toString();
            return response;
        }catch (Exception e){
            return null;
        }
    }

    public List<CarRecommenderDto> analyze(Object obj){

        List<CarRecommenderDto> carAttributesList = new ArrayList<>();
        ReflectionUtils.doWithFields(obj.getClass(), field -> {
            System.out.println("Field name: " + field.getName());
            field.setAccessible(true);
            System.out.println("Field value: "+ field.get(obj));

        });
        return carAttributesList;
    }
}
