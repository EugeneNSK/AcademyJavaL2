package com.jcourse.zonov.math;

import com.jcourse.zonov.exception.CalcException;
import java.util.EmptyStackException;
import static java.lang.Double.NaN;

// Квадратный корень
public class Sqrt extends Command {

    @Override
    public void execute() throws CalcException {

        try {
            double d = Math.sqrt(stack.pop());
            if(d != NaN){
                stack.push(d);
            }
            else{
                throw new CalcException("Невозможно извлечь корень из орицательного числа");
            }
            System.out.println("Stack после sqrt :" +stack);
        }
        catch (EmptyStackException e){
            throw new CalcException("Empty stack by Sqrt");
        }
    }
}
