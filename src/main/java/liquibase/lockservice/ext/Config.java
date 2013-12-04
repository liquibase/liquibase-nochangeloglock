package liquibase.lockservice.ext;

public class Config {
    private static Config instance = new Config();

    public static Config getInstance() {
        return instance;
    }

    private Config() {
    }

    public boolean isEnabled() {
        String enabledProperty = System.getProperty("liquibase.ext.nochangeloglock.enabled");
        if (enabledProperty == null) {
            return true;
        }
        return Boolean.valueOf(enabledProperty);
    }
}
