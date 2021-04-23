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
public final class OperasiBilanganAbsCetak {
    public void cetakSemua(OperasiBilanganAbs[] objek, double a, double b){
        for(int i = 0; i < objek.length; i++){
            objek[i].set_A(10.5);
            objek[i].set_B(4.5);
            objek[i].tampil();
            System.out.println("");
        }
    }
    
    public static void main(String[]args){
        OperasiBilanganAbs penjumlahan = new OperasiPenjumlahan();
        OperasiBilanganAbs pengurangan = new OperasiPengurangan();
        OperasiBilanganAbs perkalian = new OperasiPerkalian();
        OperasiBilanganAbs pembagian = new OperasiPembagian();
        
        OperasiBilanganAbs[]objek = {penjumlahan, pengurangan, perkalian, pembagian};
        
        OperasiBilanganAbsCetak cetak = new OperasiBilanganAbsCetak();
        cetak.cetakSemua(objek, 10.5, 4.5);
    }
}
