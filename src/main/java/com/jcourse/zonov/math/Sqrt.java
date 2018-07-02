package com.jcourse.zonov.math;

import com.jcourse.zonov.exception.CalcException;
import static java.lang.Double.NaN;

// Квадратный корень
public class Sqrt extends Command {

    @Override
    public void execute() throws CalcException {

        if (stack.size()>0 && stack.lastElement()>0){
            double d = Math.sqrt(stack.pop());
            if(d != NaN) {
                stack.push(d);
                System.out.println("Stack после sqrt :" + stack);
            }
        }
        else{
            throw new CalcException("Sqrt: not enough stack or negative value");
        }
    }
}
