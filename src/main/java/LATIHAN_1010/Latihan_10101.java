/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LATIHAN_1010;

/**
 *
 * @author USER
 */
public class Latihan_10101 {
    private String nama;
    private String alamat;
    private String nomorTelepon;
    private String alamatEmail;

    public Latihan_10101(String nama, String alamat, String nomorTelepon, String alamatEmail) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.alamatEmail = alamatEmail;
    }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }

    public String getNomorTelepon() { return nomorTelepon; }
    public void setNomorTelepon(String nomorTelepon) { this.nomorTelepon = nomorTelepon; }
    
    public String getAlamatEmail() { return alamatEmail; }
    public void setAlamatEmail(String alamatEmail) { this.alamatEmail = alamatEmail; }
}
