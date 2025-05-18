package Class;

import Interfaces.*;

import java.time.LocalDate;

public class TataUsaha extends Staff {
    public TataUsaha(String nama, String no_Tlp, String e_mail, String id_Pegawai, String jabatan, LocalDate tanggal_Masuk) {
        super(nama, no_Tlp, e_mail, id_Pegawai, jabatan, tanggal_Masuk);
    }
}
