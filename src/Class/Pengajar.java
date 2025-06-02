package Class;

import Interfaces.*;

import java.sql.*;
import java.time.LocalDate;

public class Pengajar extends Pegawai{
    public Pengajar(String nama, String no_Tlp, String e_mail, int id_Pegawai, String rofesi, LocalDate tanggal_Masuk) {
        super(nama, no_Tlp, e_mail, id_Pegawai, rofesi, tanggal_Masuk);
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

    @Override
    public String getProfesi(int id_Pegawai){
        String Url ="jdbc:sqlite:DataBase.db";
        String sql = "SELECT Profesi FROM Pegawai WHERE idPegawai = ?";
        try(Connection conn = DriverManager.getConnection(Url); PreparedStatement prstm = conn.prepareStatement(sql)){
            prstm.setInt(1,id_Pegawai);
            ResultSet rs = prstm.executeQuery();
            if(rs.next()){
                if(rs.getString("profesi").equals("Guru PNS")) {
                    return String.valueOf(hitungGaji.hitungGaji_guruPNS(getTanggal_Masuk()) + hitungTunjangan.hitungTunjangan_guruPNS(getTanggal_Masuk()));
                } else if(rs.getString("profesi").equals("Guru Honorer")) {
                    return String.valueOf(hitungGaji.hitungGaji_guruHonorer(getTanggal_Masuk()) + hitungTunjangan.hitungTunjangan_guruHonorer(getTanggal_Masuk()));
                }else {
                    return "Id Pegawai tidak ditemukan atau jenis profesi tidak valid.";
                }
            }else {
                return null;
            }
        }catch (SQLException e){
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

}
