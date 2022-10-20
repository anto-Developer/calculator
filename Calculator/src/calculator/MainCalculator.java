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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("CALCOLATRICE");
        Calculator c = new Calculator();
        Scanner s = new Scanner(System.in);
        double opA, opB;
        
        while(true){
            System.out.println("");
            System.out.println("Quale operazione vuoi eseguire?\n+ Per eseguire una somma\n- Per eseguire una sottrazione\n* Per eseguire una moltiplicazione\n/ Per eseguire una divisione\n\n");
            String input = s.next();
            
            System.out.println("Inserisci i due operandi separati da un invio, usa X per utilizzare l'ultimo risultato\n");
            input = s.next();
            if(input.equals("X")){
                c.setOpA(c.getAns());
            }else{
                c.setOpA(Double.parseDouble(input));
            }
            input = s.next();
            if(input.equals("X")){
                c.setOpA(c.getAns());
            }else{
                c.setOpA(Double.parseDouble(input));
            }

            
            switch(input){
                case "+":{
                    System.out.format("%.2f\n", c.sum());
                }
                case "-":{
                    System.out.format("%.2f\n", c.sum());
                }
                case "*":{
                    System.out.format("%.2f\n", c.sum());
                }
                case "/":{
                    System.out.format("%.2f\n", c.sum());
                }
            }
                    
        }
    }
    
}
