package com.jcourse.zonov.math;

import com.jcourse.zonov.exception.CalcException;
import java.util.NoSuchElementException;

//Печать элемента стека
public class Print extends Command {

    @Override
    public void execute() throws CalcException {

        try {
            System.out.println("Верхний элемент стэка: "+ stack.firstElement());
        } catch (NoSuchElementException e) {
            throw new CalcException("Empty stack by Print");
        }
    }
}
