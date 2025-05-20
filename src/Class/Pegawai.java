package Class;
import java.time.LocalDate;

public class Pegawai {//super class
    protected String nama;
    protected String no_Tlp;
    protected String e_mail;
    protected String id_Pegawai;
    protected String jabatan;
    protected LocalDate tanggal_Masuk;

    public Pegawai(String nama, String no_Tlp, String e_mail, String id_Pegawai, String jabatan, LocalDate tanggal_Masuk) {
        this.nama = nama;
        this.no_Tlp = no_Tlp;
        this.e_mail = e_mail;
        this.id_Pegawai = id_Pegawai;
        this.jabatan = jabatan;
        this.tanggal_Masuk = tanggal_Masuk;
    }

}
