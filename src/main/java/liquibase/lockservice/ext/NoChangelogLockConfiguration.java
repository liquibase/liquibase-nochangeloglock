package liquibase.lockservice.ext;

import liquibase.configuration.AutoloadedConfigurations;
import liquibase.configuration.ConfigurationDefinition;

public class NoChangelogLockConfiguration implements AutoloadedConfigurations {

    public static final ConfigurationDefinition<Boolean> TABLE_ENABLED;


    static {
        ConfigurationDefinition.Builder builder = new ConfigurationDefinition.Builder("liquibase");

        TABLE_ENABLED = builder.define("databaseChangelogLockEnabled", Boolean.class)
                .setDescription("If false, disable the use of the databasechangelog lock logic")
                .setDefaultValue(false)
                .build();
    }
}
