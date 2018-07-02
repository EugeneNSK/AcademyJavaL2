package com.jcourse.zonov.data;

import com.jcourse.zonov.math.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;

public class Parser {



    public static List<Command> pars(String[] main){

        Command cmd = null;
        List<Command> commands = new ArrayList<>();
        String [] args;
        Scanner sc;
        InputStream is;

        try {
            if (main.length > 0) {
                System.out.println("Указан атрибут консоли. В метод pars пришло значение main: " + main[0]);
                is = new FileInputStream(new File(main[0]));
            }

            else{
                System.out.println("Атрибут консоли не указан. Комады будут считываться из консоли");
                is = System.in;
            }

            sc = new Scanner(is);

            while (sc.hasNext()) { //Парсим
                args = sc.nextLine().split(" "); //Массив элементов, разделенных " "

//                Построчный вывод содержимого файла
//                for (String t : args) { System.out.print(t + " ");}
//                System.out.println();

                if (args[0].equals("START")) {
                    break;
                }

                switch (args[0]) {
                    case "DEFINE":{
                        cmd = new Define(args);
                        break;
                    }
                    case "+": {
                        cmd = new Plus();
                        break;
                    }
                    case "-": {
                        cmd = new Minus();
                        break;
                    }
                    case "*": {
                        cmd = new Multi();
                        break;
                    }
                    case "/": {
                        cmd = new Division();
                        break;
                    }
                    case "SQRT": {
                        cmd = new Sqrt();
                        break;
                    }
                    case "PRINT": {
                        cmd = new Print();
                        break;
                    }
                    case "PUSH":{
                        cmd = new Push(args);
                        break;
                    }
                    case "POP": {
                        cmd = new Pop();
                        break;
                    }
                    default:
                        System.out.println("Неверная команда, обработка не будет выполнена");
                }

                commands.add(cmd);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        return commands;
    }

}
