package edu.dmacc.codedsm.usegit;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Submission)) return false;
        Submission that = (Submission) o;
        return Objects.equals(getUserName(), that.getUserName()) &&
                Objects.equals(getInputNumber(), that.getInputNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserName(), getInputNumber());
    }
}
