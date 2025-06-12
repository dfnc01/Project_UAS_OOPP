package Class;

import Interfaces.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Satpam extends Keamanan implements hitungGaji {
    public Satpam(String nama, String no_Tlp, String e_mail, int id_Pegawai, String jenisPekerjaan, LocalDate tanggal_Masuk) {
        super(nama, no_Tlp, e_mail, id_Pegawai, jenisPekerjaan, "Satpam", tanggal_Masuk);
    }

    public Satpam() {
        super("", "", "", 0, "", "Satpam", LocalDate.now());
    }

    public double totalGajiSatpam() {
        return hitungGaji.hitungGaji_satpam(getTanggal_Masuk()) + hitungTunjangan.hitungTunjangan_satpam(getTanggal_Masuk()); // method dari interface
    }

    public static List<Satpam> getListSatpam() {
        List<Satpam> listSatpam = new ArrayList<>();
        String link = "jdbc:sqlite:Database.db";
        String sql = "SELECT * FROM pegawai WHERE profesi = ?";
        try (Connection con = DriverManager.getConnection(link); PreparedStatement prstm = con.prepareStatement(sql)) {
            prstm.setString(1, "Satpam");
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
        return listSatpam;
    }
    public static void deleteSatpam(String profesi, int idPegawai) {
        String link = "jdbc:sqlite:Database.db";
        String sql = "DELETE FROM pegawai WHERE profesi = ? AND idPegawai = ?";
        try (Connection con = DriverManager.getConnection(link); PreparedStatement prstm = con.prepareStatement(sql)) {
            prstm.setString(1, "Satpam");
            prstm.setInt(2, idPegawai);
            int rowsAffected = prstm.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data Satpam dengan ID " + idPegawai + " berhasil dihapus.");
            } else {
                System.out.println("Tidak ada data Satpam dengan ID " + idPegawai + ".");
            }
        } catch (SQLException e) {
            System.out.println("Error saat menghapus data Satpam : " + e.getMessage());
        }
    }
}
