package com.ragul.car.Service;

import com.ragul.car.dto.CarRecommenderDto;
import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//import org.json.JSONArray;
//import org.json.JSONObject;


@Service
public class CarRecommenderService {

    public static String sendInputsForRecom(String carRecommender) {

        String output = "";
        CarRecommenderDto[] finalOutput = new CarRecommenderDto[5];
        String uri = "https://ussouthcentral.services.azureml.net/workspaces/dd3c03f74fa44e9eb4d5f29c578d6253/services/814665a94ffd452eaae051ebdd9a0bb8/execute?api-version=2.0&details=true";
        String key = "AspjGsqYCKGgr6Jcu4JKozhvfGGbQw12rcIc9ax73o26LA1Fj+IEYkSMsMuvzWW7F91DF/tAsxK7fKYzghDiZw==";
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


        }
        catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(finalOutput);

        return finalOutput.toString();
    }
}
