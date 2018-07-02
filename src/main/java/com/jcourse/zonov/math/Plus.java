package com.jcourse.zonov.math;

import com.jcourse.zonov.exception.CalcException;
import java.util.EmptyStackException;

// Сложение
public class Plus extends Command {

    @Override
    public void execute() throws CalcException {

        double summ=0;
        try {
            for (int i=0; i<2; i++){
                summ+= stack.pop();
            }
            stack.push(summ);
            System.out.println("Stack после сложения :" +stack);
        }
        catch (EmptyStackException e){
            throw new CalcException("Empty stack by Plus");
        }

    }
}
