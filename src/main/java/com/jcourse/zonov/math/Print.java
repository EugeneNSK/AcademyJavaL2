package com.jcourse.zonov.math;

import com.jcourse.zonov.exception.CalcException;

//Печать элемента стека
public class Print extends Command {

    @Override
    public void execute() throws CalcException {

        if (stack.size()>0){
            System.out.println("Верхний элемент стэка: "+ stack.firstElement());
        }
        else{
            throw new CalcException("Print: not enough stack");
        }
    }
}
