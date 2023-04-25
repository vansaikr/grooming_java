package com.sapient.w4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorCachedThreadPool {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Create a cached thread pool
        ExecutorService executorService = Executors.newCachedThreadPool();

        // Create a list to hold the results of the future tasks
        List<Future<Integer>> futureList = new ArrayList<>();

        // Submit 5 tasks to the executor service
        for (int i = 0; i < 5; i++) {
            Future<Integer> future = executorService.submit(new MyTask(i));
            futureList.add(future);
        }

        // Wait for all the tasks to complete and store the results in the list
        List<Integer> resultList = new ArrayList<>();
        for (Future<Integer> future : futureList) {
            resultList.add(future.get());
        }

        // Print out the results
        System.out.println("Result list: " + resultList);

        // Shutdown the executor service
        executorService.shutdown();
    }

    // Define a task that returns an integer value
    static class MyTask implements Callable<Integer> {
        private final int num;

        public MyTask(int num) {
            this.num = num;
        }

        @Override
        public Integer call() throws Exception {
            // Perform some time-consuming computation here
            Thread.sleep(1000);
            return num * 2;
        }
    }
}
