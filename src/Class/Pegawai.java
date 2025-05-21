package Class;
import java.time.LocalDate;

public class Pegawai {//super class
    private String nama;
    private String no_Tlp;
    private String e_mail;
    private int id_Pegawai;
    private String profesi;
    private LocalDate tanggal_Masuk;

    public Pegawai(String nama, String no_Tlp, String e_mail, int id_Pegawai, String profesi, LocalDate tanggal_Masuk) {
        this.nama = nama;
        this.no_Tlp = no_Tlp;
        this.e_mail = e_mail;
        this.id_Pegawai = id_Pegawai;
        this.profesi = profesi;
        this.tanggal_Masuk = tanggal_Masuk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNo_Tlp() {
        return no_Tlp;
    }

    public void setNo_Tlp(String no_Tlp) {
        this.no_Tlp = no_Tlp;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public int getId_Pegawai() {
        return id_Pegawai;
    }

    public void setId_Pegawai(int id_Pegawai) {
        this.id_Pegawai = id_Pegawai;
    }

    public String getProfesi() {
        return profesi;
    }

    public void setProfesi(String profesi) {
        this.profesi = profesi;
    }

    public LocalDate getTanggal_Masuk() {
        return tanggal_Masuk;
    }

    public void setTanggal_Masuk(LocalDate tanggal_Masuk) {
        this.tanggal_Masuk = tanggal_Masuk;
    }
}
