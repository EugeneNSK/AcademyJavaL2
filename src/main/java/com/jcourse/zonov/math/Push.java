package com.jcourse.zonov.math;

import com.jcourse.zonov.exception.CalcException;

//Загрузка переменных в стэк
public class Push extends Command {

    public Push(String[] args) {

        super(args);
    }

    @Override
    public void execute() throws CalcException {

        try {
            System.out.println("Сейчас будем пушить. Аргумент: " + tokens[1]);
            Double d = Double.parseDouble(tokens[1]);
            System.out.println("Пушим double");
            stack.push(d);
        }
        catch (ArrayIndexOutOfBoundsException e1) {
            throw new CalcException("Push: variable not defined");
        }
        catch (NumberFormatException e2) {
            System.out.println("Не double, а string");
            if (map.get(tokens[1])!= null) {
                stack.push(map.get(tokens[1]));
            }
            else{
                throw new CalcException("Push: Wrong value");
            }
        }
        System.out.println("Стэк после добавления переменных: " + stack);
    }

}
