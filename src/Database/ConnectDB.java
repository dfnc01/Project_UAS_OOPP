package Database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    public static Connection connect() {
        Connection con = null ;
        try{
            String link ="jdbc:sqlite:DataBaseSekolah.db";
            con = DriverManager.getConnection(link);
        }catch (SQLException w){
            System.out.println("gagal terhubung"+ w.getMessage());
        }
        return con;

    }
    public static void create() {
        String sql = """
            CREATE TABLE IF NOT EXISTS Pengajar (
                id pegawai INTEGER PRIMARY KEY AUTOINCREMENT,
                nama TEXT NOT NULL,
                no telp TEXT
                jabatan TEXT
                email TEXT
                tanggalMasuk TEXT
                peran TEXT NOT NULL
            );
        """;
        try (Connection con = ConnectDB.connect(); Statement stm = con.createStatement()) {
            stm.execute(sql);
            System.out.println("Tabel berhasil dibuat.");
        } catch (Exception e) {
            System.out.println(" Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println(connect());
    }
}
