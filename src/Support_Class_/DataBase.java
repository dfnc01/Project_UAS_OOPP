package Support_Class_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataBase {

    public static void main(String[] args) {
            try {
                // Koneksi ke SQLite (file akan otomatis dibuat di folder project)
                Connection conn = DriverManager.getConnection("jdbc:sqlite:data.db");

                // Coba buat tabel dan isi 1 data
                Statement stmt = conn.createStatement();
                stmt.execute("CREATE TABLE IF NOT EXISTS siswa (id INTEGER PRIMARY KEY, nama TEXT)");
                stmt.execute("INSERT INTO siswa(nama) VALUES ('Budi')");

                System.out.println("✅ Koneksi sukses & data dimasukkan!");
            } catch (Exception e) {
                System.out.println("❌ Error: " + e.getMessage());
            }
    }
}
