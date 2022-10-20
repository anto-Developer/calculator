/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.HashMap;

/**
 *
 * @author anton
 */
public class Calculator {
    
    private double opA, opB, ans;
    private final HashMap<String, Double> var;
    
    public Calculator() {
        opA = 0;
        opB = 0;
        ans = 0;
        var = new HashMap();
    }

    public void setOpA(double opA) {
        this.opA = opA;
    }

    public void setOpB(double opB) {
        this.opB = opB;
    }

    public void setAns(double ans) {
        this.ans = ans;
    }

    public double getOpA() {
        return opA;
    }

    public double getOpB() {
        return opB;
    }

    public double getAns() {
        return ans;
    }
    
    public double multiplication(){
        this.ans = this.opA * this.opB;
        return ans;
    }
    
    public double division(){
        this.ans = this.opA / this.opB;
        return ans;
    }
    
    public double sum(){
        this.setAns(opA+opB);
        return ans;
    }
    
    public double subtraction(){
        this.setAns(opA-opB);
        return ans;
    }
    
    public void memorySet(String valName, double val){
        var.put(valName, val);
    }
    
    public double memoryGet(String valName) throws NotFoundKeyException{
        if(var.get(valName) == null){
            throw new NotFoundKeyException();
        }
        return var.get(valName);
    }
    
    public void memoryDelete(String valName) throws NotFoundKeyException {
        if(var.remove(valName) == null)
            throw new NotFoundKeyException();
    }
    
    public void memoryClear(){
        var.clear();
    }
    
    public boolean memoryIsEmpty(){
        return var.isEmpty();
    }
    
    public double sin(){
        this.ans = Math.sin(this.opA);
        return ans;
    }
    
    public double cos(){
        this.ans = Math.cos(this.opA);
        return ans;
    }
    
    public double tan(){
        this.ans = Math.tan(this.opA);
        return ans;
    }
    
    
}
