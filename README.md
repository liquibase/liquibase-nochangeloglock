Liquibase Extension: No ChangeLog Lock Logic
===========================

This extension suppresses all calls to update the DatabaseChangeLogLock table as changeSets are ran.
That means no:

* Creation of the databasechangeloglock table
* "update databasechangeloglock set locked=1" calls on run

You can disable the extension logic by setting the system parameter "liquibase.ext.nochangeloglock.enabled" to "false"

**WARNING: THIS FUNCTIONALITY IS NOT WHAT YOU NORMALLY WANT!**

_It can be helpful in certain circumstance, so use at your own risk_

To use the extension, simply add the liquibase-nochangeloglock.jar file to your classpath.

Download the liquibase-nochangeloglock.jar file from:

* Direct: ["release" section on github](https://github.com/liquibase/liquibase-nochangeloglock/releases)
* Maven: Group org.liquibase.ext, Artifact liquibase-nochangeloglock
