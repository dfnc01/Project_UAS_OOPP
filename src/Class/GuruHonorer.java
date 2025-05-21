package Class;

import Interfaces.*;

import java.time.LocalDate;

public class GuruHonorer extends Pengajar implements hitungGaji {


    public GuruHonorer(String nama, String no_Tlp, String e_mail, int id_Pegawai, String jabatan, LocalDate tanggal_Masuk, String jenisPekerjaan) {
        super(nama, no_Tlp, e_mail, id_Pegawai, jabatan, tanggal_Masuk, jenisPekerjaan);
    }
    public double totalGajiGuruHonorer() {
        return hitungGaji.hitungGaji_guruHonorer( tanggal_Masuk) * hitungTunjangan.hitungTunjangan_guruHonorer(tanggal_Masuk); // method dari interface
    }

    public String toString() {
        return "Nama: " + nama + ", No. Tlp: " + no_Tlp + ", Email: " + e_mail + ", ID Petugas: " + id_Pegawai + ", Jabatan: " + jabatan ;
    }
}
