package Database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Create_Connect {


    public static Connection create() {
        String link = "jdbc:sqlite:DataBase.db";
        try (Connection con = DriverManager.getConnection(link);Statement stm = con.createStatement()) {
            String Pegawai = """
                    CREATE TABLE IF NOT EXISTS Pegawai(
                      idPegawai INTEGER PRIMARY KEY AUTOINCREMENT,
                      nama TEXT NOT NULL,
                      noTelp TEXT,
                      email TEXT,
                      tanggalMasuk TEXT NOT NULL,
                      profesi TEXT NOT NULL
                      );
                  """;
            stm.execute(Pegawai);
            System.out.println("Database berhasil terhubung.");
            System.out.println("Tabel berhasil dibuat.");
            return con;
        } catch (SQLException e) {
            System.out.println(" Error: " + e.getMessage());
        }
        return null;
    }
}
