package Database;

import Class.*;
import java.sql.*;
import java.time.format.DateTimeFormatter;


public class InputDB {
    public static void simpanData (Pegawai p) {

        String sql = "INSERT INTO Pegawai (nama, noTelp, email, tanggalMasuk, profesi) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = Create_Connect.create();PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, p.getNama());
            pstmt.setString(2, p.getNo_Tlp());
            pstmt.setString(3, p.getE_mail());
            pstmt.setString(4, p.getTanggal_Masuk().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            pstmt.setString(5, p.getProfesi());
            pstmt.executeUpdate();
            System.out.println("Data berhasil disimpan.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
