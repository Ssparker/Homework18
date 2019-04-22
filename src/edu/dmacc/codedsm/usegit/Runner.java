package edu.dmacc.codedsm.usegit;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;

public class Runner {

    public static void main(String[] args) { // take inputs

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a user name:");
        String userName = in.next();
        System.out.println("Enter a number:");
        Integer inputNumber = in.nextInt();

       // MapRepository repository = new FizzBuzzMapRepository(); // change for new imp  switch back  / swap out files
        //FizzBuzzService service = newFizzBuzzServiceImpl(repository);
        MapRepository repository = new FizzBuzzRepeatMapRepository();
        FizzBuzzService service = new FizzBuzzRepeatServiceImpl(repository);  // change for new imp  swtich back
        SubmissionControl controller = new SubmissionControlImpl(service);

        InputView view = controller.submit(inputNumber, userName);
        view.render();

            File  file = new File("C:/development/Homework18/fizzbuzz_result.txt");
            if (!file.exists());
            
            try {
                file.createNewFile();
            }catch (
                    IOException e1) {
                e1.printStackTrace();
            }
            PrintWriter pw = null;
            try {
                pw = new PrintWriter(file);
            } catch (
                    FileNotFoundException e1) {
                e1.printStackTrace();
            }
            pw.println("result = " + repository.toString());
            
            pw.close();
            System.out.println("DONE");
    }
//code cotta - prescribed set of steps do over and over again
    //runner, controller,
}