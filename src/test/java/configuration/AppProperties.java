package configuration;

public class AppProperties {
    public static String getAppUrl() {
        return ConfigurationProperties.getProperties().getProperty("app.url");
    }
}
