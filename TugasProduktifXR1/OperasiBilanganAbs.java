/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasProduktifXR1;

/**
 *
 * @author MOKLET-1
 */
//abstract class
public abstract class OperasiBilanganAbs {
    //attribut class
    protected double a, b, c;
    
    //abstract method
    protected abstract void set_A(double a);
    protected abstract void set_B(double b);
    protected abstract void set_C();
    protected abstract double get_A();
    protected abstract double get_B();
    protected abstract double get_C();
    protected abstract void tampil();
}
