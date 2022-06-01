import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * Reads json resources and converts them to strings.
 */
public class JsonReader {
    private static final Logger LOG = LoggerFactory.getLogger(JsonReader.class);

    private String formatString(String jsonStr) {
        if (!jsonStr.isEmpty()) {
            return jsonStr.replace("\n", "");
        }
        return "";
    }

    public String getJsonAsString(String fileName) {
        try (InputStream is = getClass().getResourceAsStream(fileName)) {
            if (is != null) {
                String string = IOUtils.toString(is, StandardCharsets.UTF_8);
                return formatString(string);
            }
        } catch (IOException e) {
            LOG.error("Failed to parse JSON as string");
        }
        return "";
    }
}
