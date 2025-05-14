package Support_Class_;

import java.sql.*;
import java.util.*;

public class DataBase {

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:dataa.db");
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS pegawai (" +
                         "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                         "nama TEXT NOT NULL, " +
                         "no_telp TEXT NOT NULL, " +
                         "email TEXT NOT NULL, " +
                         "id_petugas TEXT NOT NULL, " +
                         "jabatan TEXT NOT NULL)");
            stmt.execute("INSERT INTO pegawai (nama, no_telp, email, id_petugas, jabatan) VALUES " +
                         "('Hanif', '08123456789', 'Hanif@gmail.com', 'PG002', 'Guru Honorer')");
            stmt.execute("INSERT INTO pegawai (nama, no_telp, email, id_petugas, jabatan) VALUES " +
                         "('Siti', '08123456780', 'siti@gmail.com', 'PG003', 'Guru PNS')");
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static List<Map<String, String>> getDaftarPegawaiByJabatan(String jabatan) {
        List<Map<String, String>> daftar = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:dataa.db");
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM pegawai WHERE jabatan = ?");
            stmt.setString(1, jabatan);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Map<String, String> data = new HashMap<>();
                data.put("nama", rs.getString("nama"));
                data.put("no_telp", rs.getString("no_telp"));
                data.put("email", rs.getString("email"));
                data.put("id_petugas", rs.getString("id_petugas"));
                data.put("jabatan", rs.getString("jabatan"));
                daftar.add(data);
            }
            rs.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return daftar;
    }
}