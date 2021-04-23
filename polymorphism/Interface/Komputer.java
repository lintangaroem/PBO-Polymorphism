/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.Interface;

/**
 *
 * @author MOKLET-1
 */
public class Komputer implements MouseBaru {
    
    public void klik_kanan(){
        System.out.println("Mouse Komputer : Klik Kanan ...");
    }
    
    public void klik_kiri(){
        System.out.println("Mouse Komputer : Klik Kiri ...");
    }
    
    public void double_klik(){
        System.out.println("Mouse Komputer : Double Klik ...");
    }
}
