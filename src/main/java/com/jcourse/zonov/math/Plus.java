package com.jcourse.zonov.math;

import com.jcourse.zonov.exception.CalcException;
import java.util.EmptyStackException;

// Сложение
public class Plus extends Command {

    @Override
    public void execute() throws CalcException {

        double summ=0;

        if (stack.size()>=2){
            for (int i=0; i<2; i++){
                summ+= stack.pop();
            }
            stack.push(summ);
            System.out.println("Stack после сложения :" +stack);
        }
        else{
            throw new CalcException("Plus: not enough stack");
        }

    }
}
