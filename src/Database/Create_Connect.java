package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_Connect {
    private static final String DATABASE_URL = "jdbc:sqlite:Database.db";
    private static Connection connection = null;

    public static Connection create() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(DATABASE_URL);
                try (Statement stm = connection.createStatement()) {
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
                    System.out.println("Tabel Pegawai berhasil dibuat.");
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return connection;
    }

    public static Connection connect() {
        if (connection == null) {
            return create();
        }
        return connection;
    }

    public static void resetAutoIncrement() {
        try (Connection con = DriverManager.getConnection(DATABASE_URL);
             Statement stmt = con.createStatement()) {
            stmt.execute("DELETE FROM Pegawai;");
            stmt.execute("DELETE FROM sqlite_sequence WHERE name='Pegawai';");
            System.out.println("Data Pegawai dan AUTOINCREMENT berhasil direset.");
        } catch (SQLException e) {
            System.out.println("Error reset AUTOINCREMENT: " + e.getMessage());
        }
    }
}
