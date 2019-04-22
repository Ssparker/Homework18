package edu.dmacc.codedsm.usegit;

import java.util.Objects;

public class Result {

        private Submission submission;
        private String message;

    public Submission getSubmission() {
        return submission;
    }

    public void setSubmission(Submission submission) {
        this.submission = submission;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Result{" +
                "submission=" + submission +
                ", message='" + message + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Result)) return false;
        Result result = (Result) o;
        return Objects.equals(getSubmission(), result.getSubmission()) &&
                Objects.equals(getMessage(), result.getMessage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSubmission(), getMessage());
    }
}
