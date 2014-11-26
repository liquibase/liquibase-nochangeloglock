package liquibase.locksevice.ext;

import liquibase.lockservice.ext.NoOpLockService;
import org.junit.Test;

import static org.junit.Assert.*;

public class NoOpLockServiceTest {

    @Test
    public void getPriority() {
        assertEquals(1000, new NoOpLockService().getPriority());
    }

}