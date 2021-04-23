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
public interface Mouse {
    String jenis = "Laser Mouse";
    
    // Method Interface harus public
    public void klik_kanan();
    public void klik_kiri();
    // Tidak boleh ada method normal / biasa
    // yang terdapat isi method-nya
}
