package me.ulrich.clans.tasks;

import java.util.UUID;
import java.util.concurrent.ExecutorService;

public class AsyncTaskExecutor {

    public ExecutorService getExecutor() {
		return null;
      
    }
    
    public void run(UUID key, Runnable task) {

    }

    public void runGlobal(Runnable task) {
        
    }

    public void runAsync(Runnable task) {
       
    }

    private void release(UUID key, LockWrapper wrapper) {
        
    }

    private class LockWrapper {
       
    }

    public void shutdown() {
        
    }
}