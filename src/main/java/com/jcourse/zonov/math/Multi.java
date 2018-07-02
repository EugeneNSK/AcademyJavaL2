package com.jcourse.zonov.math;

import com.jcourse.zonov.exception.CalcException;
import java.util.EmptyStackException;

// Умножение
public class Multi extends Command {

    @Override
    public void execute() throws CalcException {

        double mult=1;

        try {
            for (int i=0; i<2; i++){
                mult*= stack.pop();
            }
            stack.push(mult);
        }
        catch (EmptyStackException e){
            throw new CalcException("Empty stack by Minus");
        }

        System.out.println("Stack после умножения :" +stack);
    }
}
