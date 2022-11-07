package liquibase.lockservice.ext;

import liquibase.database.Database;
import liquibase.exception.DatabaseException;
import liquibase.exception.LockException;
import liquibase.lockservice.DatabaseChangeLogLock;
import liquibase.lockservice.LockService;

public class NoOpLockService implements LockService {

    @Override
    public int getPriority() {
        return 1000;
    }

    @Override
    public boolean supports(Database database) {
        return NoChangelogLockConfiguration.ENABLED.getCurrentValue();
    }

    @Override
    public void setDatabase(Database database) {

    }

    @Override
    public void setChangeLogLockWaitTime(long changeLogLockWaitTime) {

    }

    @Override
    public void setChangeLogLockRecheckTime(long changeLogLocRecheckTime) {

    }

    @Override
    public boolean hasChangeLogLock() {
        return true;
    }

    @Override
    public void waitForLock() throws LockException {

    }

    @Override
    public boolean acquireLock() throws LockException {
        return true;
    }

    @Override
    public void releaseLock() throws LockException {

    }

    @Override
    public DatabaseChangeLogLock[] listLocks() throws LockException {
        return new DatabaseChangeLogLock[0];
    }

    @Override
    public void forceReleaseLock() throws LockException, DatabaseException {

    }

    @Override
    public void reset() {

    }

    @Override
    public void init() throws DatabaseException {

    }

    @Override
    public void destroy() throws DatabaseException {

    }
}
