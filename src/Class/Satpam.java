package Class;

import Interfaces.*;

import java.time.LocalDate;

public class Satpam extends Keamanan implements hitungGaji {
    public Satpam(String nama, String no_Tlp, String e_mail, int id_Pegawai, String jenisPekerjaan, LocalDate tanggal_Masuk) {
        super(nama, no_Tlp, e_mail, id_Pegawai, jenisPekerjaan, tanggal_Masuk);
    }

    public double totalGajiSatpam() {
        return hitungGaji.hitungGaji_satpam(getTanggal_Masuk()) + hitungTunjangan.hitungTunjangan_satpam(getTanggal_Masuk()); // method dari interface
    }

    public String toString() {
        return "Nama: " + getNama() + ", No. Tlp: " + getNo_Tlp() + ", Email: " + getE_mail() + ", ID Petugas: " + getId_Pegawai() + ", Profesi: " + getProfesi();
    }
}
