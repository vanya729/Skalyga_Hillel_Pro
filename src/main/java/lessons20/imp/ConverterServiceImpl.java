package lessons20.imp;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lessons20.service.ConverterService;
import lessons20.service.exception.ConvertationFault;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

public class ConverterServiceImpl implements ConverterService {

    private final ObjectMapper objectMapper;
    private final Yaml yaml;

    public ConverterServiceImpl() {
        this.objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        this.yaml = new Yaml();
    }

    @Override
    public String convertJsonToYaml(String jsonData) throws ConvertationFault {
        try {
            Object obj = objectMapper.readValue(jsonData, Object.class);
            return yaml.dump(obj);
        } catch (Exception e) {
            throw new ConvertationFault();
        }
    }

    @Override
    public String convertYamlToJson(String yamlData) throws ConvertationFault {
        try {
            DumperOptions options = new DumperOptions();
            options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
            Object obj = yaml.load(yamlData);
            return objectMapper.writeValueAsString(obj);
        } catch (Exception e) {
            throw new ConvertationFault();
        }
    }

}
