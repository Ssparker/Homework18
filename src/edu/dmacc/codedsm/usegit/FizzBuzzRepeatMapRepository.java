package edu.dmacc.codedsm.usegit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class FizzBuzzRepeatMapRepository implements MapRepository {

    private Map<Integer, Result> storage = new HashMap<>();


    @Override
    public String toString() {
        return "FizzBuzzRepeatMapRepository{" +
                "storage=" + storage +
                '}';
    }

     public void save(Result result) {

         File file = new File("fizzbuzz_result.txt");
         PrintWriter pw = null;
         try {
             pw = new PrintWriter(file);
             pw.println("result = "+result.toString());
         } catch(FileNotFoundException e1) {
             e1.printStackTrace();
         } finally {
             pw.close();
         }

        storage.put(1, result);

    }
}
