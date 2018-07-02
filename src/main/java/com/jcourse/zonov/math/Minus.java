package com.jcourse.zonov.math;

import com.jcourse.zonov.exception.CalcException;
import java.util.EmptyStackException;

// Вычитание
public class Minus extends Command {

    @Override
    public void execute() throws CalcException {

        try {
            double razn = -stack.pop();
            razn += stack.pop();
            stack.push(razn);

            System.out.println("Stack после вычитания :" + stack);
        }
        catch (EmptyStackException e){
            throw new CalcException("Empty stack by Minus");
        }
    }
}
