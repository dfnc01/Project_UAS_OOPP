package Class;

import Interfaces.*;

import java.time.LocalDate;

public class PetugasKebun extends Kebersihan implements hitungGaji {
    public PetugasKebun(String nama, String no_Tlp, String e_mail, int id_Pegawai, String jenisPekerjaan, LocalDate tanggal_Masuk) {
        super(nama, no_Tlp, e_mail, id_Pegawai, jenisPekerjaan, tanggal_Masuk);
    }

    public double totalGajiPetugasKebun(){
        return hitungGaji.hitungGaji_petugasKebun(getTanggal_Masuk()) + hitungTunjangan.hitungTunjangan_petugasKebun(getTanggal_Masuk());
    }
    public String toString() {
        return "Nama: " + getNama() + ", No. Tlp: " + getNo_Tlp() + ", Email: " + getE_mail() + ", ID Petugas: " + getId_Pegawai() + ", Profesi: " + getProfesi();
    }
}
