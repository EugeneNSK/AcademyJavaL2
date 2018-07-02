package com.jcourse.zonov.math;

import com.jcourse.zonov.exception.CalcException;

// Деление
public class Division extends Command {

    @Override
    public void execute() throws CalcException {

        if (stack.size()>=2){
            double div=stack.pop();
            div/=stack.pop();
            stack.push(div);
            System.out.println("Stack после деления :" +stack);
        }
        else{
            throw new CalcException("Division: not enough stack");
        }
    }
}
