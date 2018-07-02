package com.jcourse.zonov.math;

import com.jcourse.zonov.exception.CalcException;

//Удаление последнего элемента стэка
public class Pop extends Command{

    @Override
    public void execute() throws CalcException {

        if (stack.size()>0){
            stack.pop();
            System.out.println("Stack после Pop :" +stack);
        }
        else{
            throw new CalcException("Pop: not enough stack");
        }
    }
}
