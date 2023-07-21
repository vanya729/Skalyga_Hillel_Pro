package lessons20.service;


import lessons20.service.exception.ConvertationFault;

public interface ConverterService {

        String convertJsonToYaml(String jsonData) throws ConvertationFault;
        String convertYamlToJson(String yamlData) throws ConvertationFault;

    }

