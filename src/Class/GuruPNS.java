package Class;

import Interfaces.*;

import java.time.LocalDate;

public class GuruPNS extends Pengajar implements hitungGaji {
    public GuruPNS(String nama, String no_Tlp, String e_mail, int id_Pegawai, String jenisPekerjaan, LocalDate tanggal_Masuk) {
        super(nama, no_Tlp, e_mail, id_Pegawai, jenisPekerjaan, tanggal_Masuk);
    }

    public double totalGajiGuruPNS() {
        return hitungGaji.hitungGaji_guruPNS(getTanggal_Masuk()) * hitungTunjangan.hitungTunjangan_guruPNS(getTanggal_Masuk()); // method dari interface
    }

    public String toString() {
        return "Nama: " + getNama() + ", No. Tlp: " + getNo_Tlp() + ", Email: " + getE_mail() + ", ID Petugas: " + getId_Pegawai() + ", Profesi: " + getProfesi();
    }
}
