package Class;

import java.time.LocalDate;

public class Pengajar extends Pegawai{
    public Pengajar(String nama, String no_Tlp, String e_mail, int id_Pegawai, String profesi, String role, LocalDate tanggal_Masuk) {
        super(nama, no_Tlp, e_mail, id_Pegawai, profesi, role, tanggal_Masuk);
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }

    @Override
    public String getNo_Tlp() {
        return super.getNo_Tlp();
    }

    @Override
    public void setNo_Tlp(String no_Tlp) {
        super.setNo_Tlp(no_Tlp);
    }

    @Override
    public String getE_mail() {
        return super.getE_mail();
    }

    @Override
    public void setE_mail(String e_mail) {
        super.setE_mail(e_mail);
    }

    @Override
    public int getId_Pegawai() {
        return super.getId_Pegawai();
    }

    @Override
    public void setId_Pegawai(int id_Pegawai) {
        super.setId_Pegawai(id_Pegawai);
    }

    @Override
    public String getProfesi() {
        return super.getProfesi();
    }

    @Override
    public void setProfesi(String profesi) {
        super.setProfesi(profesi);
    }

    @Override
    public LocalDate getTanggal_Masuk() {
        return super.getTanggal_Masuk();
    }

    @Override
    public void setTanggal_Masuk(LocalDate tanggal_Masuk) {
        super.setTanggal_Masuk(tanggal_Masuk);
    }


}
