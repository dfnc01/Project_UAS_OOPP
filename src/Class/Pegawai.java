package Class;
import java.time.LocalDate;

public class Pegawai {//super class
    protected String nama;
    protected String no_Tlp;
    protected String e_mail;
    protected int id_Pegawai;
    protected String jabatan;
    protected LocalDate tanggal_Masuk;
    private String jenisPekerjaan ;


    public Pegawai(String nama, String no_Tlp, String e_mail, int id_Pegawai, String jabatan, LocalDate tanggal_Masuk, String jenisPekerjaan) {
        this.nama = nama;
        this.no_Tlp = no_Tlp;
        this.e_mail = e_mail;
        this.id_Pegawai = id_Pegawai;
        this.jabatan = jabatan;
        this.tanggal_Masuk = tanggal_Masuk;
        this.jenisPekerjaan = jenisPekerjaan;
    }
}
