/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class MainCalculator {
        
        private static Calculator c = new Calculator();
        private static Scanner s = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    private static void trigonometricOperations(){
        
    }
    
    private static void arithmeticOperations(){
        double opA, opB, val;
        String input, op;
        
        System.out.println("Quale operazione vuoi eseguire?\n+ Per eseguire una somma\n- Per eseguire una sottrazione\n* Per eseguire una moltiplicazione\n/ Per eseguire una divisione\n\n");
        input = s.next();

        System.out.println("Inserisci i due operandi separati da un invio, usa X per utilizzare l'ultimo risultato altrimenti il nome di una variabile\n");

        op = s.next();
        try{
            val = c.memoryGet(op);
            c.setOpA(val);
        }catch(Exception e){
            if(op.equals("X")){
                System.out.println("Preso paaramtro ANS");
                c.setOpA(c.getAns());
            }else{
                c.setOpA(Double.parseDouble(op));
            }
        }            

        op = s.next();
        try{
            val = c.memoryGet(op);
            c.setOpB(val);
        }catch(Exception e){
            if(op.equals("X")){
                System.out.println("Preso paaramtro ANS");
                c.setOpB(c.getAns());
            }else{
                c.setOpB(Double.parseDouble(op));
            }
        }



        switch(input){
            case "+":{
                System.out.format("%.2f\n", c.sum());
                break;
            }
            case "-":{
                System.out.format("%.2f\n", c.subtraction());
                break;
            }
            case "*":{
                System.out.format("%.2f\n", c.multiplication());
                break;
            }
            case "/":{
                System.out.format("%.2f\n", c.division());
                break;
            }
            default:{
                System.out.println("Operatore non consentito");
                break;
            }
        }
        
        saveResult();
        
    }
    
    private static void memoryOperations(){
        String input;
        System.out.println("1 Cancella memoria\n2 Cancella una variabile");
        
        input = s.next();
        switch(input){
            case "1":{
                c.memoryClear();
                break;
            }
            case "2":{
                System.out.println("inserire nome variabile da cancellare\n");
                input = s.next();
                try {
                    c.memoryDelete(input);
                } catch (NotFoundKeyException ex) {
                    System.out.println("Variabile non esistente");
                }
                break;
            }
            default:{
                System.out.println("Operazione non riconosciuta");
            }
        }
       
    }
    
    private static void saveResult(){
        String input;
        
        System.out.println("Vuoi salvare il risultato?");
        input = s.next();
        if(input.equalsIgnoreCase("Si")){
            System.out.println("Inserire nome variabile");
            input = s.next();

            c.memorySet(input, c.getAns());
        }else if(input.equalsIgnoreCase("no")){
        }else{
            System.out.println("Risposta non corretta");
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("CALCOLATRICE");
        Scanner s = new Scanner(System.in);
        String input;
        
        while(true){
            System.out.println("1 Operazioni aritmetiche\n2 Gestione memoria");
            input = s.next();
            switch(input){
                case "1":{
                    arithmeticOperations();
                    break;
                }
                case "2":{
                    memoryOperations();
                    break;
                }/*
                case "3":{
                    trigonometricOperations();
                }*/
                default:{
                    System.out.println("Operazione non consentito");
                }
            }       
        }
    }
    
}
