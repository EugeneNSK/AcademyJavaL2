package com.jcourse.zonov.math;

import com.jcourse.zonov.exception.CalcException;
import java.util.EmptyStackException;

//Удаление последнего элемента стэка
public class Pop extends Command{

    @Override
    public void execute() throws CalcException {

        try {
            stack.pop();
            System.out.println("Stack после Pop :" +stack);
        }
        catch (EmptyStackException e){
            throw new CalcException("Empty stack by Pop");
        }
    }
}
