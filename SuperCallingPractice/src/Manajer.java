/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkm_pondoksalam
 */
public class Manajer extends Karyawan{

        public Manajer(String nama, double gaji, int golongan) {
            super(nama,gaji);
            this.golongan = golongan;

        }
        
        private Karyawan[] staff = new Karyawan[10];
        private int jumkaryawan;
        private int golongan;
        private int kinerja;
    
    public Karyawan getStaff(int i) {
        return staff[i];
    }

    public int getJumkaryawan() {
        return jumkaryawan;
    }

    public int getGolongan() {
        return golongan;
    }

    public int getKinerja() {
       
        return kinerja;
    }

        @Override
    public double getGaji() {
        if (golongan == 1){
            return gaji+1500000;
        }else if (golongan == 2){
            return gaji+2000000;
        }else if (golongan == 3){
            return gaji + 3000000;
        }
        return gaji;
    }

    public void setStaff(Karyawan[] staff) {
        this.staff = staff;
    }
    
    public void addStaff(Karyawan k){
        if (jumkaryawan<staff.length){
            staff[jumkaryawan] = k;
            jumkaryawan++;
        }else{
            System.out.println("Overload Employees");
        }
    }

    public void setJumkaryawan(int jumkaryawan) {
        this.jumkaryawan = jumkaryawan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public void setKinerja(int kinerja) {
        if (kinerja>85){
            setGaji(gaji + (gaji * 0.1));
            for(int i = 0 ; i<10 ; i++){
                if (staff[i] != null){
                    staff[i].setGaji(staff[i].gaji+( staff[i].gaji*0.1));   
                }
            }
        }else if (getKinerja()<40){
            setGaji (gaji - (gaji * 0.15));
            for(int i = 0 ; i<10 ; i++){
                if (staff[i] != null){
                    staff[i].setGaji(staff[i].gaji-( staff[i].gaji*0.15));    
                }
            }
        }
        this.kinerja = kinerja;
    }


    }
