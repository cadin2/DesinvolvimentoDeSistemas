

package com.mycompany.bhaskara;

public class Bhaskara {

    public static void main(String[] args) {
        double a=5, b=8, c=6,delta,x1,x2;
        
        delta = Math.pow(b,2) - 4*a*c;
        x1 = -b + Math.sqrt(delta)/2*a;
        x2 = -b - Math.sqrt(delta)/2*a;
        
        System.out.println("delta:"+delta+"\nx1: "+x1+"\nx2: "+x2);
        
    }
}
