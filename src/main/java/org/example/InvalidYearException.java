package org.example;

public class InvalidYearException extends Exception {
    public InvalidYearException(String errorMessage){
        super(errorMessage);
    }
}
