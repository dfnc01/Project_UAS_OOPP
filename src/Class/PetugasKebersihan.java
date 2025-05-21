package Class;

import Interfaces.*;

import java.time.LocalDate;

public class PetugasKebersihan extends Kebersihan implements hitungGaji {
    public PetugasKebersihan(String nama, String no_Tlp, String e_mail, int id_Pegawai, String jenisPekerjaan, LocalDate tanggal_Masuk) {
        super(nama, no_Tlp, e_mail, id_Pegawai, jenisPekerjaan, tanggal_Masuk);
    }

    public double totalGajiPetugasKebersihan(){
        return hitungGaji.hitungGaji_petugasKebersihan(getTanggal_Masuk()) * hitungTunjangan.hitungTunjangan_petugasKebersihan(getTanggal_Masuk());
    }

    public String toString() {
        return "Nama: " + getNama() + ", No. Tlp: " + getNo_Tlp() + ", Email: " + getE_mail() + ", ID Petugas: " + getId_Pegawai() + ", Profesi: " + getProfesi();
    }
}
