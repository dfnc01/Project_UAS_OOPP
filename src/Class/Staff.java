package Class;

import java.time.LocalDate;

public class Staff extends Pegawai {
    public Staff(String nama, String no_Tlp, String e_mail, int id_Pegawai, String jabatan, LocalDate tanggal_Masuk, String jenisPekerjaan) {
        super(nama, no_Tlp, e_mail, id_Pegawai, jabatan, tanggal_Masuk, jenisPekerjaan);
    }
}
