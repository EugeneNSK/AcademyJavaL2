package com.jcourse.zonov.main;

import com.jcourse.zonov.data.Parser;
import com.jcourse.zonov.exception.CalcException;
import com.jcourse.zonov.math.Command;

public class Run {
    public static void main(String[] args) throws CalcException {

        System.out.println("Запускаем консольный калькулятор");

        for (Command c: Parser.pars(args)){
            c.execute();
        }
    }
}
