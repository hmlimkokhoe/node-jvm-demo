import edu.hm.hafner.renderer.EchartsSvgRenderer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Demo project showing the trireme-java dependency.
 */
public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        JsonReader jsonReader = new JsonReader();
        String configOptions = jsonReader.getJsonAsString("/stacked-area-config.json");
        String exportOptions = jsonReader.getJsonAsString("/export-config.json");

        EchartsSvgRenderer echartsSvgRenderer = new EchartsSvgRenderer();
        String result = echartsSvgRenderer.render(configOptions, exportOptions);
        LOG.info(result);
        /*String exportOptions = toString("export-options/export-stack.json");
        String configOptions = toString("configuration-options/bar-basic.json");
        exportOptions = exportOptions.replace("\n", "");
        configOptions = configOptions.replace("\n", "");

        String result = echartsSvgRenderer.render(configOptions, exportOptions);
        result = formatStringOutput(result);

        String isExpectedResult = toString("screenshots/bar-basic.svg");
        isExpectedResult = formatStringOutput(isExpectedResult);*/

        //TODO: print svg string
    }
}
