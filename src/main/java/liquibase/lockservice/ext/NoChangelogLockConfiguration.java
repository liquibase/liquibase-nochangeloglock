package liquibase.lockservice.ext;

import liquibase.configuration.AutoloadedConfigurations;
import liquibase.configuration.ConfigurationDefinition;

public class NoChangelogLockConfiguration implements AutoloadedConfigurations {

    public static final ConfigurationDefinition<Boolean> ENABLED;


    static {
        ConfigurationDefinition.Builder builder = new ConfigurationDefinition.Builder("liquibase");

        ENABLED = builder.define("databaseChangelogLockEnabled", Boolean.class)
                .addAliasKey("liquibase.ext.nochangeloglock.enabled")
                .setDescription("If false, disable the use of the databasechangelog lock logic")
                .setDefaultValue(true)
                .build();
    }
}
