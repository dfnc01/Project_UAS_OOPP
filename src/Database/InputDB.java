package Database;

import Class.*;
import java.sql.*;

public class InputDB {
    public static void simpanData (Pegawai p) {
        Connection conn = Create_Connect.create();
        String sql = "INSERT INTO Pegawai (idPegawai, nama, noTelp, email, tanggalMasuk, jenisPejekerjaan) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, p.getId_Pegawai());
            pstmt.setString(2, p.getNama());
            pstmt.setString(3, p.getNo_Tlp());
            pstmt.setString(4, p.getE_mail());
            pstmt.setString(5, String.valueOf(p.getTanggal_Masuk()));
            pstmt.setString(6, p.getProfesi());

            pstmt.executeUpdate();
            System.out.println("Data berhasil disimpan.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }


    }

}
