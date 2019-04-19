package edu.dmacc.codedsm.usegit;

public class SubmissionControlImpl implements SubmissionControl {

    private FizzBuzzService service;

    public SubmissionControlImpl(FizzBuzzService service) { // constructor
        this.service = service;
    }

    @Override
    public InputView submit(Integer inputNumber, String userName) {
        Submission submission = new Submission();
        submission.setInputNumber(inputNumber);
        submission.setUserName(userName);

        Result result = service.performFizzBuzzLogic(submission);

        return new ConsoleInputView(result);

    }
}
