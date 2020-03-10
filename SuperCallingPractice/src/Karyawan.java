/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkm_pondoksalam
 */
public class Karyawan {
    
    public Karyawan(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }
    private String nama;
    double gaji;

    public String getNama() {
        return nama;
    }
    
    public double getGaji() {
        return gaji;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    
    
    
    public static void main(String[] args) {
        Manajer M1 = new Manajer("Bobby", 7500000, 2);
        Karyawan K1 = new Karyawan("Alex",5000000);
        Karyawan K2 = new Karyawan("Ruby",4500000);
        Karyawan K3 = new Karyawan("Suzy",5250000);
        Karyawan K4 = new Karyawan("Ben", 4750000);
        Karyawan K5 = new Karyawan("Max", 5500000);
        M1.addStaff(K1);
        M1.addStaff(K2);
        M1.addStaff(K3);
        M1.addStaff(K4);
        M1.addStaff(K5);
        
        M1.setKinerja(87);
        System.out.println("Gaji Manager : "+M1.getNama()+M1.getGaji());
        System.out.println("Gaji Staff : ");
        for(int i = 0; i<10; i++){
            if (M1.getStaff(i) != null){
                String text = "";
                text += M1.getStaff(i).getNama() + M1.getStaff(i).getGaji() + "\n";
                System.out.println(text);
            }
        }
    }
    
}
