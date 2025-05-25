package Class;

import Interfaces.*;
import java.time.LocalDate;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class petugasPerpus extends Staff  {
    public petugasPerpus(String nama, String no_Tlp, String e_mail, int id_Pegawai, String jenisPekerjaan, LocalDate tanggal_Masuk) {
        super(nama, no_Tlp, e_mail, id_Pegawai, jenisPekerjaan, tanggal_Masuk);
    }
    public double totalGajiPetugasPerpus() {
        return hitungGaji.hitungGaji_petugasPerpus(getTanggal_Masuk()) + hitungTunjangan.hitungTunjangan_petugasPerpus(getTanggal_Masuk()); // method dari interface
    }

    public static List<petugasPerpus> getListPetugasPerpus() {
        List<petugasPerpus> listPetugasPerpus = new ArrayList<>();
        String link = "jdbc:sqlite:DataBase.db";
        String sql = "SELECT * FROM pegawai WHERE profesi = ?";
        try (Connection con = DriverManager.getConnection(link); PreparedStatement prstm = con.prepareStatement(sql)) {
            prstm.setString(1, "Petugas Perpustakaan");
            ResultSet rs = prstm.executeQuery();
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("idPegawai"));
                System.out.println("Nama: " + rs.getString("nama"));
                System.out.println("No Telp: " + rs.getString("noTelp"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Tanggal Masuk: " + rs.getString("tanggalMasuk"));
                System.out.println("Profesi: " + rs.getString("profesi"));

                System.out.println("----------------------");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return listPetugasPerpus;
    }
    public static void deletePetugasPerpus(String profesi, int idPegawai) {
        String link = "jdbc:sqlite:DataBase.db";
        String sql = "DELETE FROM pegawai WHERE profesi = ? AND idPegawai = ?";
        try (Connection con = DriverManager.getConnection(link); PreparedStatement prstm = con.prepareStatement(sql)) {
            prstm.setString(1, "Petugas Perpustakaan");
            prstm.setInt(2, idPegawai);
            int rowsAffected = prstm.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data Petugas Perpustakaan dengan ID " + idPegawai + " berhasil dihapus.");
            } else {
                System.out.println("Tidak ada data Petugas Perpustakaan dengan ID " + idPegawai + ".");
            }
        } catch (SQLException e) {
            System.out.println("Error saat menghapus data Petugas Perpustakaan : " + e.getMessage());
        }
    }
}

