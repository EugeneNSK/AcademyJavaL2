package com.jcourse.zonov.math;

import com.jcourse.zonov.exception.CalcException;

// Вычитание
public class Minus extends Command {

    @Override
    public void execute() throws CalcException {

        if (stack.size()>=2){
            double razn = -stack.pop();
            razn += stack.pop();
            stack.push(razn);

            System.out.println("Stack после вычитания :" + stack);
        }
        else{
            throw new CalcException("Minus: not enough stack");
        }
    }
}
