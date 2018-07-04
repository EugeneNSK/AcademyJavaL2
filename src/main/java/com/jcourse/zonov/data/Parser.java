package com.jcourse.zonov.data;

import com.jcourse.zonov.math.*;

import java.io.InputStream;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Parser {

    public static List<Command> pars(InputStream is){

        Command cmd = null;
        List<Command> commands = new ArrayList<>();
        String [] args;

        Scanner sc = new Scanner(is);

        while (sc.hasNext()) { //Парсим
            args = sc.nextLine().split(" "); //Массив элементов, разделенных " "

//                Построчный вывод содержимого файла
//                for (String t : args) { System.out.print(t + " ");}
//                System.out.println();

            if ("START".equals(args[0])) { // args[0].equals("START") - может выкинуть NPE если не будет в args[0]
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

        return commands;
    }

}
