/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.loglevels;
import java.lang.String;


/**
 *
 * @author sauro
 */
public class LogLevels {
    
    public static void main(String[] args) {
        String mensaje = "[info]: Se escribe un mensaje";
        System.out.println(message(mensaje));
        System.out.println(logLevel(mensaje));
        System.out.println(reformat(mensaje));
    }
    
    public static String message(String logLine){
        return logLine.split("]:")[1].trim();
    }
    
    public static String logLevel(String logLine){
        return logLine.split("]:")[0]
                .substring(1)
                .toLowerCase();
    }
    
    public static String reformat(String logLine){
        return String.format("%s (%s)", message(logLine), logLevel(logLine));
    }
    
}
