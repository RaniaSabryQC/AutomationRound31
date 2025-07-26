package Utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;

public class JsonReader {
    public static String getSearchTerm() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            InputStream inputStream = JsonReader.class.getClassLoader().getResourceAsStream("Data/searchData.json");
            if (inputStream == null) {
                throw new RuntimeException("searchData.json not found in resources!");
            }
            return mapper.readTree(inputStream).get("searchTerm").asText();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
