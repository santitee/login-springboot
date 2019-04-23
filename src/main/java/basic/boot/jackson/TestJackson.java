package basic.boot.jackson;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJackson {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = "{\"name\":\"Somchai\", \"age\":99}";
            Map<String, Object> map = new HashMap<>();
            map = mapper.readValue(json, new TypeReference<Map<String, String>>() {});
            System.out.println(map);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}