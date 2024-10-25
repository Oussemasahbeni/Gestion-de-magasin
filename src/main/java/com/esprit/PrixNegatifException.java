package com.esprit;

public class PrixNegatifException extends Exception {
    public PrixNegatifException(String message) {
        super(message);
    }
}