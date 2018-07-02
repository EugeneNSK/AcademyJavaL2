package com.jcourse.zonov.math;

import com.jcourse.zonov.exception.CalcException;
import java.util.EmptyStackException;

// Деление
public class Division extends Command {

    @Override
    public void execute() throws CalcException {
        try{
            double div=stack.pop();
            div/=stack.pop();
            stack.push(div);
            System.out.println("Stack после деления :" +stack);
        }
        catch (EmptyStackException e){
            throw new CalcException("Empty stack by Division");
        }
    }
}
