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
public class LaptopDell extends Laptop{
    // constructor 
    LaptopDell(String merk){
        setMerk(merk);
        merk = null;
    }
    
    protected void setMerk(String merk){
        this.merk = merk;
        merk = null;
    }
    
    protected String getMerk(){
        return merk;
    }
    
    protected void setPemilik(String pemilik){
        this.pemilik = pemilik;
        pemilik = null;
    }
    
    protected String getPemilik(){
        return pemilik;
    }
    
    protected void tampil(){
        System.out.println(getPemilik() + " memiliki laptop merk " + getMerk());
    }
    
    protected void hapus(){
        merk = null;
        pemilik = null;
    }
}
