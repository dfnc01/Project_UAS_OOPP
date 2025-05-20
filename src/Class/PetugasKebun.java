package Class;

import Interfaces.*;

import java.time.LocalDate;

public class PetugasKebun extends Kebersihan implements hitungGaji {
    public PetugasKebun(String nama, String no_Tlp, String e_mail, String id_Pegawai, String jabatan, LocalDate tanggal_Masuk) {
        super(nama, no_Tlp, e_mail, id_Pegawai, jabatan, tanggal_Masuk);
    }

    public double totalGajiPetugasKebun(){
        return hitungGaji.hitungGaji_petugasKebun(tanggal_Masuk) * hitungTunjangan.hitungTunjangan_petugasKebun(tanggal_Masuk);
    }
    public String toString() {
        return "Nama: " + nama + ", No. Tlp: " + no_Tlp + ", Email: " + e_mail + ", ID Petugas: " + id_Pegawai + ", Jabatan: " + jabatan ;
    }
}
