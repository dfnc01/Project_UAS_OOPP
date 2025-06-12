package Class;

import Interfaces.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GuruPNS extends Pengajar implements hitungGaji {
    public GuruPNS(String nama, String no_Tlp, String e_mail, int id_Pegawai, String profesi, LocalDate tanggal_Masuk) {
        super(nama, no_Tlp, e_mail, id_Pegawai, profesi, "Guru PNS", tanggal_Masuk);
    }

    public GuruPNS() {
        super("", "", "", 0, "", "Guru PNS", LocalDate.now());
    }

    public static List<GuruPNS> getListGuruPNS() {
        List<GuruPNS> listGuruPNS = new ArrayList<>();
        String link = "jdbc:sqlite:Database.db";
        String sql = "SELECT * FROM pegawai WHERE profesi = ?";
        try(Connection con = DriverManager.getConnection(link); PreparedStatement prstm = con.prepareStatement(sql)){
            prstm.setString(1, "Guru PNS");
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
        return listGuruPNS;
    }

    public static void deleteGuruPNS(String profesi, int idPegawai) {
        String link = "jdbc:sqlite:Database.db";
        String sql = "DELETE FROM pegawai WHERE profesi = ? AND idPegawai = ?";
        try (Connection con = DriverManager.getConnection(link); PreparedStatement prstm = con.prepareStatement(sql)) {
            prstm.setString(1, "Guru PNS");
            prstm.setInt(2, idPegawai);
            int rowsAffected = prstm.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data Guru PNS dengan ID " + idPegawai + " berhasil dihapus.");
            } else {
                System.out.println("Tidak ada data Guru PNS dengan ID " + idPegawai + ".");
            }
        } catch (SQLException e) {
            System.out.println("Error saat menghapus data Guru PNS: " + e.getMessage());
        }
    }

    @Override
    public String getProfesi(int id_Pegawai){
        String Url ="jdbc:sqlite:Database.db";
        String sql = "SELECT * FROM Pegawai WHERE idPegawai = ?";
        try(Connection conn = DriverManager.getConnection(Url); PreparedStatement prstm = conn.prepareStatement(sql)){
            prstm.setInt(1,id_Pegawai);
            ResultSet rs = prstm.executeQuery();
            if(rs.next()){
                String profesi = rs.getString("profesi");
                LocalDate tanggalMasuk = LocalDate.parse(rs.getString("tanggalMasuk"));
                if(profesi.equals("Guru PNS")) {
                    return String.valueOf(
                        Interfaces.hitungGaji.hitungGaji_guruPNS(tanggalMasuk) +
                        Interfaces.hitungTunjangan.hitungTunjangan_guruPNS(tanggalMasuk)
                    );
                } else {
                    return "Id Pegawai bukan Guru PNS.";
                }
            } else {
                return null;
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}
