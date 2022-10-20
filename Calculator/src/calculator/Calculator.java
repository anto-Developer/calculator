/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author anton
 */
public class Calculator {
    
    double opA, opB, ans;
    
    public Calculator() {
        opA = 0;
        opB = 0;
        ans = 0;
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
    
    
    
    
}
