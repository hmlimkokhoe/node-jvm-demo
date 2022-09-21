import edu.hm.hafner.renderer.EChartsSvgRenderer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Demo project showing the trireme-java dependency.
 */
public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        JsonReader jsonReader = new JsonReader();
        String configOptions = jsonReader.getJsonAsString("/pie-chart-config.json");
        String exportOptions = jsonReader.getJsonAsString("/export-config.json");

        EChartsSvgRenderer echartsSvgRenderer = new EChartsSvgRenderer();
        String result = echartsSvgRenderer.createSvgString(configOptions, exportOptions);
        LOG.info(result);
    }
}
