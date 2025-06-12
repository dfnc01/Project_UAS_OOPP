package Class;

import Interfaces.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PetugasKebun extends Kebersihan implements hitungGaji {
    public PetugasKebun(String nama, String no_Tlp, String e_mail, int id_Pegawai, String jenisPekerjaan, LocalDate tanggal_Masuk) {
        super(nama, no_Tlp, e_mail, id_Pegawai, jenisPekerjaan, "Petugas Kebun", tanggal_Masuk);
    }

    public PetugasKebun() {
        super("", "", "", 0, "", "Petugas Kebun", LocalDate.now());
    }

    public double totalGajiPetugasKebun(){
        return hitungGaji.hitungGaji_petugasKebun(getTanggal_Masuk()) + hitungTunjangan.hitungTunjangan_petugasKebun(getTanggal_Masuk());
    }
    public static List<PetugasKebun> getListPetugasKebun() {
        List<PetugasKebun> listPetugasKebun = new ArrayList<>();
        String link = "jdbc:sqlite:Database.db";
        String sql = "SELECT * FROM pegawai WHERE profesi = ?";
        try (Connection con = DriverManager.getConnection(link); PreparedStatement prstm = con.prepareStatement(sql)) {
            prstm.setString(1, "Petugas Kebun");
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
        return listPetugasKebun;
    }
    public static void deletePetugasKebun(String profesi, int idPegawai) {
        String link = "jdbc:sqlite:Database.db";
        String sql = "DELETE FROM pegawai WHERE profesi = ? AND idPegawai = ?";
        try (Connection con = DriverManager.getConnection(link); PreparedStatement prstm = con.prepareStatement(sql)) {
            prstm.setString(1, "Petugas Kebun");
            prstm.setInt(2, idPegawai);
            int rowsAffected = prstm.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data Petugas Kebun dengan ID " + idPegawai + " berhasil dihapus.");
            } else {
                System.out.println("Tidak ada data Petugas Kebun dengan ID " + idPegawai + ".");
            }
        } catch (SQLException e) {
            System.out.println("Error saat menghapus data Petugas Kebun : " + e.getMessage());
        }
    }
}
