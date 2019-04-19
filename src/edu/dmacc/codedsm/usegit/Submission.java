package edu.dmacc.codedsm.usegit;

public class Submission {

    private String userName;
    private Integer inputNumber;

    public Integer getInputNumber() {
        return inputNumber;
    }

    public void setInputNumber(Integer inputNumber) {
        this.inputNumber = inputNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Submission{" +
                "userName='" + userName + '\'' +
                ", inputNumber=" + inputNumber +
                '}';
    }
}
