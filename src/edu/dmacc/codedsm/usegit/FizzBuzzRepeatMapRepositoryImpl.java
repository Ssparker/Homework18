package edu.dmacc.codedsm.usegit;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FizzBuzzRepeatMapRepositoryImpl implements MapRepository{

   private Map<Integer, Result> storage = new HashMap<>();

   public void save (Result result) {
       storage.put(1, result);
   }

    private static void writeUsingFileWriter(String data) throws IOException {
        FileWriter fr = null;
        try {
            File file = new File("fizzbuzz.result.txt");
            fr = new FileWriter(file);
           fr.write(data);
       }catch (IOException e) {
           e.printStackTrace();
          }
        if (fr != null) {
            fr.close();
        }


    }

    }

    //public static void main(String[] args) throws IOException {
    //          PrintWriter writer = null;
    //          try {
    //              writer = new PrintWriter("test_practice.txt");
    //              writer.println("Yo!!!! Sup.");
    //              System.out.println("Done.");
    //          } catch (Exception e) {
    //              e.printStackTrace();
    //          }writer.close();
    //      }
    //}


//       File file = new File("fizzbuzz.result.txt");
//       FileWriter fr = null;
//       try{
//           fr = new FileWriter(file);
//           fr.write(data);
//       }catch (IOException e) {
//           e.printStackTrace();
//       }
//       finally {
//                try{
//                    fr.close();
//                } catch (IOException e){
//                    e.printStackTrace();
//                }
//       }
//    }
//
//    private static class FileWriter {
//        public void write(String data) {
//        }
//
//        public void close() {
//        }
//    }

