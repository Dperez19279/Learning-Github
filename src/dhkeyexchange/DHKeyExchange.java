/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhkeyexchange;

import static java.lang.Math.pow;

/**
 *
 * @author 19279
 */
public class DHKeyExchange {
    public static final int G = 13;
    private static int n;
    private static int a;
    private static int b;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        n = (int)(Math.random()*1000+10);
        a = (int)(Math.random()*100+10);
        b = (int)(Math.random()*100+10);
        int ag = (int) pow(G,a)%n;
        int bg = (int) pow(G,a)%n;
        System.out.println((int) pow(ag,b)%n);
        System.out.println((int) pow(bg,a)%n);
    }
    
}
