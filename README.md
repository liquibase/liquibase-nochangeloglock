Liquibase Extension: No ChangeLog Lock Logic
===========================

This extension suppresses all calls to update the DatabaseChangeLogLock table as changeSets are ran.
That means no:

* Creation of the databasechangeloglock table
* "update databasechangeloglock set locked=1" calls on run

Generally you want to have the databasechangeloglock logic. But especially in scenarios like cloud-managed infrastructure like kubernetes where there is already infrastructure ensuring only one Liquibase process is running at a time, it can be unneeded. 

You can disable the use of databasechangelog lock by setting the Liquibase configuration `liquibase.databaseChangelogLockEnabled` to "false" (the default when this plugin is installed) via CLI arguments, defaultsFile file, etc. 

NOTE: For backwards compatibility, it also checks the `liquibase.ext.nochangeloglock.enabled` Java system property, where "true" means "disable databasechangelog lock". 

To use the extension, add the liquibase-nochangeloglock.jar file to your LIQUIBASE_HOME/lib directory, or your applications's classpath.

Download the liquibase-nochangeloglock.jar file from:

* Direct: ["release" section on github](https://github.com/liquibase/liquibase-nochangeloglock/releases)
* Maven: Group org.liquibase.ext, Artifact liquibase-nochangeloglock
