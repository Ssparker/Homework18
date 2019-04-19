package edu.dmacc.codedsm.usegit;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) { // take inputs
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a user name:");
        String userName = in.next();
        System.out.println("Enter a number:");
        Integer inputNumber = in.nextInt();

        MapRepository repository = new FizzBuzzMapRepository();
        FizzBuzzService service = new FizzBuzzServiceImpl(repository);
        SubmissionControl controller = new SubmissionControlImpl(service);

        controller.submit(inputNumber, userName);


    }

}
