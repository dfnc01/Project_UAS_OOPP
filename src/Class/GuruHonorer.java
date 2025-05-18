package Class;

import Interfaces.hitungGaji;

import java.time.LocalDate;

public class GuruHonorer extends Pengajar implements hitungGaji {


    public GuruHonorer(String nama, String no_Tlp, String e_mail, String id_Pegawai, String jabatan, LocalDate tanggal_Masuk) {
        super(nama, no_Tlp, e_mail, id_Pegawai, jabatan, tanggal_Masuk);
    }

    public double totalGaji() {
        return hitungGaji.hitungGaji_guruPNS( tanggal_Masuk); // method dari interface
    }
}
