/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author MOKLET-1
 */
public class Lingkaran extends Bentuk{
    protected void gambar(){
        System.out.println("subclass -> Menggambar Lingkaran");
    }
    
    protected void hapus(){
        System.out.println("superclass -> Menghapus Gammbar Lingkaran");
    }
}
