package Class;

import Interfaces.hitungGaji;

import java.time.LocalDate;

public class PetugasKebun extends Kebersihan implements hitungGaji {
    public PetugasKebun(String nama, String no_Tlp, String e_mail, String id_Pegawai, String jabatan, LocalDate tanggal_Masuk) {
        super(nama, no_Tlp, e_mail, id_Pegawai, jabatan, tanggal_Masuk);
    }
}
