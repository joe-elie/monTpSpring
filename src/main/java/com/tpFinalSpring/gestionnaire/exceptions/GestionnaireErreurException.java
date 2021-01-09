package com.tpFinalSpring.gestionnaire.exceptions;

public class GestionnaireErreurException {
    private int code;
    private String Message;
    private String details;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return Message;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
