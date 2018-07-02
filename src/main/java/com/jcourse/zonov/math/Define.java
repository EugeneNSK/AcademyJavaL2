package com.jcourse.zonov.math;

import com.jcourse.zonov.exception.CalcException;

//Установка
public class Define extends Command {

    public Define(String[] args ) {

        super(args);
    }

    @Override
    public void execute() throws CalcException {

        try {
            String key = tokens[1];
            Double val = Double.parseDouble(tokens[2]);
            System.out.println( "key: " + key + " : val: " + val);
            map.put(key, val);
        }
        catch (ArrayIndexOutOfBoundsException ex1){
            throw new CalcException("Define");
        }
        catch (NumberFormatException ex2){
            throw new CalcException("Define");

        }
    }
}
