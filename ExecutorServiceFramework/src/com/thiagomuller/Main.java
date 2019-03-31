package com.thiagomuller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers(100);
        Sum sum = new Sum(numbers);
        Sub sub = new Sub(numbers);
        Div div = new Div(numbers);
        Mult mult = new Mult(numbers);
        ExecutorService executor = Executors.newFixedThreadPool(4);

        List<Future> results = new ArrayList<>();
        Future sumResult = executor.submit(sum);
        Future subResult = executor.submit(sub);
        Future divResult = executor.submit(div);
        Future multResult = executor.submit(mult);

        results.add(sumResult);
        results.add(subResult);
        results.add(divResult);
        results.add(multResult);


        results.forEach(item ->{
            try{
                Object result = item.get();
                System.out.println("The result is: " + result.toString());
            } catch (InterruptedException e){}
            catch(ExecutionException e){}

        });

        executor.shutdown();

    }
}
