package liquibase.lockservice.ext;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class NoChangelogLockConfigurationTest {

    @Test
    void testDisabledByDefault() {
        assertFalse(NoChangelogLockConfiguration.TABLE_ENABLED.getCurrentValue());
    }

}
