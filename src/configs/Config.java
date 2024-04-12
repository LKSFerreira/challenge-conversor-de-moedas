package configs;

import exceptions.ApiKeyNotFoundException;
import org.yaml.snakeyaml.Yaml;
import java.io.InputStream;
import java.util.Map;

public class Config {

    public static String getApiKey() {
        // Carrega o arquivo YAML
        Yaml yaml = new Yaml();
        InputStream inputStream = Config.class.getClassLoader().getResourceAsStream("config.yaml");
        if (inputStream == null) {
            throw new ApiKeyNotFoundException("Não foi possível encontrar o arquivo config.yaml no classpath.");
        }

        Map<String, Object> obj = yaml.load(inputStream);

        // Verifica se o objeto carregado não é nulo e contém a chave 'apiKey'
        if (obj == null || !obj.containsKey("apiKey")) {
            throw new ApiKeyNotFoundException("API Key não encontrada no arquivo config.yaml.");
        }

        // Obtém a API key do arquivo YAML
        String apiKey = (String) obj.get("apiKey");
        if (apiKey == null || apiKey.isEmpty()) {
            throw new ApiKeyNotFoundException("API Key está vazia no arquivo config.yaml.");
        }

        return apiKey; // Retorna a API key
    }
}