/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author MOKLET-1
 */
public class Test {
    public static void main (String[]args){
        Line x = new Line (15,25,35,45);
        System.out.println(x.getLength());
        System.out.println(x.isGreater(x, x));
        System.out.println(x.isLess(x, x));

    }
}
