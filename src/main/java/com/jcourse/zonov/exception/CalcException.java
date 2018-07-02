package com.jcourse.zonov.exception;

public class CalcException extends Exception {

    public CalcException(String message) {
        super("Неверные параметры: " + message);
    }
}
