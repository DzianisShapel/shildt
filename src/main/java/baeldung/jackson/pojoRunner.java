package baeldung.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class pojoRunner {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{\n" +
                "            \"clientId\": 1234567,\n" +
                "            \"activityType\": \"REGISTRATION\",\n" +
                "            \"date\": \"2020-11-23T12:40:42\"\n" +
                "        }";
        ObjectMapper mapper = new ObjectMapper();
        pojo mypojo = mapper.readValue(json, pojo.class);
        System.out.println(mypojo);
    }
}
