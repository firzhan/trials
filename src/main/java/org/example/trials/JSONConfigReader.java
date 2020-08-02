package org.example.trials;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class JSONConfigReader {

    public static void main(String[] args) {

        String configDirPath = "/Users/firzhannaqash/Desktop/test.json";


        JSONParser parser = new JSONParser();

        try (Reader reader = new FileReader(configDirPath)) {

            Optional<JSONObject> optionalJSONObject = Optional.ofNullable((JSONObject) parser.parse(reader));

            if (optionalJSONObject.isPresent()) {
                JSONObject jsonObject = optionalJSONObject.get();

                @SuppressWarnings("unchecked") Set<String> keys = jsonObject.keySet();

                Set<String> clientKeySet = keys.stream().filter(it -> it.matches("client_.*")).
                        collect(Collectors.toSet());


                for (String clientKey : clientKeySet) {

                    if (clientKey.equals("client_plan")) {
                        JSONArray clientPlanArray = (JSONArray) jsonObject.get("client_plan");
                        System.out.println("client-plan" + clientPlanArray.toString());
                    } else {
                        String value = (String) jsonObject.get(clientKey);
                        System.out.println(clientKey + ":" + value);
                    }
                }

            }

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
