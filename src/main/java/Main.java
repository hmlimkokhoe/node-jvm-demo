import edu.hm.hafner.renderer.EChartsSvgRenderer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Demo project showing the trireme-java dependency.
 */
public class Main {

    private static final String FILE_PATH = "target/output.svg";

    public static void main(String[] args) throws IOException {
        JsonReader jsonReader = new JsonReader();
        String configOptions = jsonReader.getJsonAsString("/pie-chart-config.json");
        String exportOptions = jsonReader.getJsonAsString("/export-config.json");

        EChartsSvgRenderer echartsSvgRenderer = new EChartsSvgRenderer();
        String result = echartsSvgRenderer.createSvgString(configOptions, exportOptions);
        Path path = Paths.get(FILE_PATH);
        Files.write(path, result.getBytes());
    }
}
