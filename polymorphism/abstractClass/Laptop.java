/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.abstractClass;

/**
 *
 * @author MOKLET-1
 */

// abstract class
public abstract class Laptop {
    // attribut class
    protected String merk, pemilik;
    
    // abstract method
    protected abstract void setMerk(String merk);
    protected abstract String getMerk();
    protected abstract void setPemilik(String pemilik);
    protected abstract String getPemilik();
    protected abstract void tampil();
    protected abstract void hapus();
    
    // method "biasa"
    protected void hidupkanLaptop(){
        System.out.println("Hidupkan Laptop");
    }
}
