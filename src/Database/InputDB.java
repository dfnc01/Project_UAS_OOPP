package Database;

import Class.*;
import java.sql.*;
import java.time.format.DateTimeFormatter;


public class InputDB {
    public static void simpanData (Pegawai p) {

        String sql = "INSERT INTO Pegawai (idPegawai, nama, noTelp, email, tanggalMasuk, profesi) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = Create_Connect.create();PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, p.getId_Pegawai());
            pstmt.setString(2, p.getNama());
            pstmt.setString(3, p.getNo_Tlp());
            pstmt.setString(4, p.getE_mail());
            pstmt.setString(5, p.getTanggal_Masuk().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            pstmt.setString(6, p.getProfesi());
            pstmt.executeUpdate();
            System.out.println("Data berhasil disimpan.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
