package Database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Create {


    public static Connection create() {
        String link = "jdbc:sqlite:DataBase.db";


        try (Connection con = DriverManager.getConnection(link);Statement stm = con.createStatement()) {

            String Pegawai = """
                    CREATE TABLE IF NOT EXISTS Pegawai(
                      idPegawai INTEGER PRIMARY KEY AUTOINCREMENT,
                      nama TEXT NOT NULL,
                      noTelp TEXT,
                      jabatan TEXT NOT NULL,
                      email TEXT,
                      tanggalMasuk TEXT NOT NULL,
                      jenisPejekerjaan TEXT NOT NULL
                      );
                  """;
            stm.execute(Pegawai);
            System.out.println("Tabel berhasil dibuat.");

            return con;
        } catch (SQLException e) {
            System.out.println(" Error: " + e.getMessage());
        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println(create());
    }
}
