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
public class Cetakgambar extends Bentuk {
    
    private void tampil(Bentuk[]obj){
        //Polimorfisme
        //Memanggil method yang sama yaitu method gambar() dan hapus()
        //pada masing-masing class
        for (int i=0; i<obj.length; i++){
            obj[i].gambar();
            obj[i].hapus();
            System.out.println("======================");
        }
    }
    
    public static void main (String[]args){
        Bentuk[] obj = {new Lingkaran(),
                        new Elips(),
                        new Segitiga()
                       };
        Cetakgambar cetak = new Cetakgambar();
        
        //Menampilkan method gambar() & hapus() pada class Bentuk (superclass)
        cetak.gambar();
        cetak.hapus();
        System.out.println("======================");
        
        //Overriding
        //Menumpuk mehod gambar() & hapus() pada class Bentuk (superclass)
        //dengan method gambar() & hapus() pada subclass-nya
        //yaitu class Lingkaran, Elips, dan Segitiga
        cetak.tampil(obj);
        }
    }

