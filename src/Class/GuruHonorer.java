package Class;

import Interfaces.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class GuruHonorer extends Pengajar implements hitungGaji {
    public GuruHonorer(String nama, String no_Tlp, String e_mail, int id_Pegawai, String jenisPekerjaan, LocalDate tanggal_Masuk) {
        super(nama, no_Tlp, e_mail, id_Pegawai, jenisPekerjaan,  "Guru Honorer", tanggal_Masuk);
    }

    public GuruHonorer() {
        super("", "", "", 0, "", "Guru Honorer", LocalDate.now());
    }

    public static List<GuruHonorer> getListGuruHonorer() {
        List<GuruHonorer> listGuruHonorer = new ArrayList<>();
        String link = "jdbc:sqlite:Database.db";
        String sql = "SELECT * FROM pegawai WHERE profesi = ?";
        try (Connection con = DriverManager.getConnection(link); 
        PreparedStatement prstm = con.prepareStatement(sql)) {
            prstm.setString(1, "Guru Honorer");
            ResultSet rs = prstm.executeQuery();
            int count = 0;
            while (rs.next()) {
                count++;
                System.out.println("ID: " + rs.getInt("idPegawai"));
                System.out.println("Nama: " + rs.getString("nama"));
                System.out.println("No Telp: " + rs.getString("noTelp"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Tanggal Masuk: " + LocalDate.parse( rs.getString("tanggalMasuk")));
                System.out.println("Profesi: " + rs.getString("profesi"));
                System.out.println("===============================================================");

                GuruHonorer guru = new GuruHonorer(
                        rs.getString("nama"),
                        rs.getString("noTelp"),
                        rs.getString("email"),
                        rs.getInt("idPegawai"),
                        rs.getString("profesi"),
                        LocalDate.parse(rs.getString("tanggalMasuk"))
                );
                listGuruHonorer.add(guru);
            }
            System.out.println("Jumlah data Guru Honorer: " + count);
            if (count == 0) {
                System.out.println("Tidak ada data Guru Honorer ditemukan di database.");
            }
        } catch (Exception e) {
            System.out.println("Error saat mengambil data Guru Honorer: " + e.getMessage());
        }
        return listGuruHonorer;
    }

    public static GuruHonorer deleteGuruHonorer(int idPegawai) {
        String link = "jdbc:sqlite:Database.db";
        String sql = "DELETE FROM pegawai WHERE profesi = ? AND idPegawai = ?";
        try (Connection con = DriverManager.getConnection(link); PreparedStatement prstm = con.prepareStatement(sql)) {
            prstm.setString(1, "Guru Honorer");
            prstm.setInt(2, idPegawai);
            int rowsAffected = prstm.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data Guru Honorer dengan ID " + idPegawai + " berhasil dihapus.");
            } else {
                System.out.println("Tidak ada data Guru Honorer dengan ID " + idPegawai + ".");
            }
        } catch (SQLException e) {
            System.out.println("Error saat menghapus data Guru Honorer: " + e.getMessage());
        }
        return null;
    }
}

