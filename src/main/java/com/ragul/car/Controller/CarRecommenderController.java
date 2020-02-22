package com.ragul.car.Controller;


import com.ragul.car.Model.CarRecommender;
import com.ragul.car.Service.CarRecommenderService;
import com.ragul.car.payload.ApiResponse;
import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/carRecommender")
public class CarRecommenderController {
    @Autowired
    CarRecommenderService carRecommenderService;

    @PostMapping("/sendInputsForRecom")
    public ResponseEntity<ApiResponse<CarRecommender>> sendInputsForRecom(@RequestBody CarRecommender carRecommender){
        try{
            JSONArray carRecommenderArray = new JSONArray();
//          carRecommenderArray.add(carRecommender);
            carRecommenderArray.add("");
            carRecommenderArray.add(carRecommender.getGender());
            carRecommenderArray.add(carRecommender.getJob());
            carRecommenderArray.add(carRecommender.getAgeGroup());
            carRecommenderArray.add(carRecommender.getMonthlyIncome());
            carRecommenderArray.add(carRecommender.getNoOfFamMembers());
            carRecommenderArray.add(carRecommender.getBrandedPerson());
            carRecommenderArray.add("");
            carRecommenderArray.add("");
            carRecommenderArray.add(carRecommender.getHowLongUseVehicle());
            carRecommenderArray.add(carRecommender.getConsiderMoneySpendOnFuel());
            carRecommenderArray.add(carRecommender.getAvgKmsPerDriveMonth());
            carRecommenderArray.add(carRecommender.getBrandedPerson());
            carRecommenderArray.add(carRecommender.getConsiderResaleValue());
            carRecommenderArray.add("For my personal transportation, As a family car");

            carRecommenderService.sendInputsForRecom("{\"Inputs\": {\"input1\": {\"ColumnNames\": [\"Timestamp\",\"1. Gender\",\"2. Profession / Occupation\",\"3. Age group\",\"4. Monthly income\",\"5. How many members are there in your family\",\"6. I am a branded person/ going behind vehicle brands like Benz, BMW etc. And use vehicles to show prestige?\",\"7. What is the vehicle that you are currently owning?\",\"8. What are the vehicles that you have used during past 10 years?\",\"9. Generally, how long you use a vehicle?\",\"10. I consider about the money I spend on fuel\",\"11. Average kms you drive per month?\",\"12. Are you a person who really enjoy driving / expects driving pleasure / a Petrolhead?\",\"13. I consider about the resale value (Second hand market value) of the vehicle I buy\",\"14. Why you use a car?\"],\"Values\": ["+carRecommenderArray.toJSONString()+"]}},\"GlobalParameters\": {}}");
            return  new ResponseEntity<>(new ApiResponse<>(carRecommender), HttpStatus.OK);
        }catch (Exception ex){
            return  new ResponseEntity<>(new ApiResponse<>(carRecommender), HttpStatus.CONFLICT);
        }
    }
}
