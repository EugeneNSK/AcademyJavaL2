package com.jcourse.zonov.math;

import com.jcourse.zonov.exception.CalcException;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public abstract class Command {

    protected static Stack<Double> stack = new Stack<>();
    protected static Map <String, Double> map = new HashMap<>();
    protected String[] tokens;

    public Command() {
    }

    public Command(String[] args) {

        this.tokens = args;
    }

    abstract public void execute() throws CalcException;
}
