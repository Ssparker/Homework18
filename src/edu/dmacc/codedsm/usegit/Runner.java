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

        MapRepository repository = new FizzBuzzMapRepository(); // change for new imp  switch back  / swap out files
        FizzBuzzService service = new FizzBuzzServiceImpl(repository);
        MapRepository altrepository = new FizzBuzzRepeatMapRepository();
        FizzBuzzService altservice = new FizzBuzzRepeatServiceImpl(altrepository);  // change for new imp  swtich back
        SubmissionControl controller = new SubmissionControlImpl(service);
        SubmissionControl altcontroller = new SubmissionControlImpl(altservice);

        InputView view = controller.submit(inputNumber, userName);
        view.render();

        view = altcontroller.submit(inputNumber, userName);
        view.render();


                        System.out.println("DONE");
    }
    //code cotta - prescribed set of steps do over and over again
        //runner, controller,
    }