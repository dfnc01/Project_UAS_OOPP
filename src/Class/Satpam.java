package Class;

import Interfaces.hitungGaji;

import java.time.LocalDate;

public class Satpam extends Keamanan implements hitungGaji {


    public Satpam(String nama, String no_Tlp, String e_mail, String id_Pegawai, String jabatan, LocalDate tanggal_Masuk) {
        super(nama, no_Tlp, e_mail, id_Pegawai, jabatan, tanggal_Masuk);
    }

    public double totalGajiSatpam() {
        return hitungGaji.hitungGaji_satpam( tanggal_Masuk); // method dari interface
    }

    public String toString() {
        return "Nama: " + nama + ", No. Tlp: " + no_Tlp + ", Email: " + e_mail + ", ID Petugas: " + id_Pegawai + ", Jabatan: " + jabatan ;
    }
}
