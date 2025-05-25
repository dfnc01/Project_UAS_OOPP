package Class;

import Interfaces.*;
import java.time.LocalDate;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TataUsaha extends Staff {
    public TataUsaha(String nama, String no_Tlp, String e_mail, int id_Pegawai, String profesi, LocalDate tanggal_Masuk) {
        super(nama, no_Tlp, e_mail, id_Pegawai, profesi, tanggal_Masuk);
    }

    public double totalGajiTataUsaha() {
        return hitungGaji.hitungGaji_tataUsaha(getTanggal_Masuk()) + hitungTunjangan.hitungTunjangan_tataUsaha(getTanggal_Masuk()); // method dari interface
    }

    public static List<TataUsaha> getListTataUsaha() {
        List<TataUsaha> listTataUsaha = new ArrayList<>();
        String link = "jdbc:sqlite:DataBase.db";
        String sql = "SELECT * FROM pegawai WHERE profesi = ?";
        try (Connection con = DriverManager.getConnection(link); PreparedStatement prstm = con.prepareStatement(sql)) {
            prstm.setString(1, "Tata Usaha");
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
        return listTataUsaha;
    }

    public static void deleteTataUsaha(String profesi, int idPegawai) {
        String link = "jdbc:sqlite:DataBase.db";
        String sql = "DELETE FROM pegawai WHERE profesi = ? AND idPegawai = ?";
        try (Connection con = DriverManager.getConnection(link); PreparedStatement prstm = con.prepareStatement(sql)) {
            prstm.setString(1, "Tata Usaha");
            prstm.setInt(2, idPegawai);
            int rowsAffected = prstm.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data Tata Usaha dengan ID " + idPegawai + " berhasil dihapus.");
            } else {
                System.out.println("Tidak ada data Tata Usaha dengan ID " + idPegawai + ".");
            }
        } catch (SQLException e) {
            System.out.println("Error saat menghapus data Tata Usaha: " + e.getMessage());
        }
    }
}
