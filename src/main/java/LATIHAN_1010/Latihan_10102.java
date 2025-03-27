/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LATIHAN_1010;

/**
 *
 * @author USER
 */
public class Latihan_10102 {
    private Latihan_10101[] bukuAlamat;
    private int jumlahData;

    public Latihan_10102() {
        bukuAlamat = new Latihan_10101[100];
        jumlahData = 0;
    }
    
    public void masukkanData(Latihan_10101 data) {
        if (jumlahData < 100) {
            bukuAlamat[jumlahData] = data;
            jumlahData++;
        }
    }
    
    public void hapusData(int index) {
        if (index >= 0 && index < jumlahData) {
            for (int i = index; i < jumlahData - 1; i++) {
                bukuAlamat[i] = bukuAlamat[i + 1];
            }
            bukuAlamat[jumlahData - 1] = null;  // Clear last entry
            jumlahData--;
        }
    }
    
    public void tampilkanData() {
        for (int i = 0; i < jumlahData; i++) {
            System.out.println(bukuAlamat[i].getNama());
        }
    }
    
    public void updateData(int index, Latihan_10101 dataBaru) {
        if (index >= 0 && index < jumlahData) {
            bukuAlamat[index] = dataBaru;
        }
    }
}
