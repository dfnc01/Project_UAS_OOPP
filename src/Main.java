import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis pekerjaan:");
        System.out.println("1. Pengajar");
        System.out.println("2. Keamanan");
        System.out.println("3. Kebersihan");
        System.out.print("Masukkan pilihan Anda (1/2/3): ");
        int pilihan = scanner.nextInt();

        String url = "jdbc:sqlite:C:/Users/RMHYPS/Documents/KULIAH/OOP/PRAKTIKUM/PROJEK/Project_UAS_OOPP/src/ProfilSekolah.db";

        try (Connection conn = DriverManager.getConnection(url)) {
            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih Pengajar.");
                    System.out.println("Pilih jenis Pengajar:");
                    System.out.println("1. Guru Honorer");
                    System.out.println("2. Guru PNS");
                    System.out.print("Masukkan pilihan Anda (1/2): ");
                    int pilihanPengajar = scanner.nextInt();

                    if (pilihanPengajar == 1) {
                        System.out.println("Anda memilih Guru Honorer.");
                        String sql = "SELECT nama FROM datapegawai WHERE jabatan = 'Guru Honorer'";
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                        System.out.println("Daftar Guru Honorer:");
                        boolean found = false;
                        while (rs.next()) {
                            System.out.println("- " + rs.getString("nama"));
                            found = true;
                        }
                        if (!found) {
                            System.out.println("Tidak ada Guru Honorer di database.");
                        }
                    } else if (pilihanPengajar == 2) {
                        System.out.println("Anda memilih Guru PNS.");
                        String sql = "SELECT nama FROM datapegawai WHERE jabatan = 'Guru PNS'";
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                        System.out.println("Daftar Guru PNS:");
                        boolean found = false;
                        while (rs.next()) {
                            System.out.println("- " + rs.getString("nama"));
                            found = true;
                        }
                        if (!found) {
                            System.out.println("Tidak ada Guru PNS di database.");
                        }
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                    break;

                case 2:
                    System.out.println("Anda memilih Keamanan.");
                    System.out.println("Pilih jenis Keamanan:");
                    System.out.println("1. Satpam");
                    System.out.print("Masukkan pilihan Anda (1): ");
                    int pilihanKeamanan = scanner.nextInt();

                    if (pilihanKeamanan == 1) {
                        System.out.println("Anda memilih Satpam.");
                        String sql = "SELECT nama FROM datapegawai WHERE jabatan = 'Satpam'";
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                        System.out.println("Daftar Satpam:");
                        boolean found = false;
                        while (rs.next()) {
                            System.out.println("- " + rs.getString("nama"));
                            found = true;
                        }
                        if (!found) {
                            System.out.println("Tidak ada Satpam di database.");
                        }
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                    break;

                case 3:
                    System.out.println("Anda memilih Kebersihan.");
                    System.out.println("Pilih jenis Kebersihan:");
                    System.out.println("1. Petugas Kebersihan");
                    System.out.println("2. Petugas Kebun");
                    System.out.print("Masukkan pilihan Anda (1/2): ");
                    int pilihanKebersihan = scanner.nextInt();

                    if (pilihanKebersihan == 1) {
                        System.out.println("Anda memilih Petugas Kebersihan.");
                        String sql = "SELECT nama FROM datapegawai WHERE jabatan = 'Petugas Kebersihan'";
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                        System.out.println("Daftar Petugas Kebersihan:");
                        boolean found = false;
                        while (rs.next()) {
                            System.out.println("- " + rs.getString("nama"));
                            found = true;
                        }
                        if (!found) {
                            System.out.println("Tidak ada Petugas Kebersihan di database.");
                        }
                    } else if (pilihanKebersihan == 2) {
                        System.out.println("Anda memilih Petugas Kebun.");
                        String sql = "SELECT nama FROM datapegawai WHERE jabatan = 'Petugas Kebun'";
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                        System.out.println("Daftar Petugas Kebun:");
                        boolean found = false;
                        while (rs.next()) {
                            System.out.println("- " + rs.getString("nama"));
                            found = true;
                        }
                        if (!found) {
                            System.out.println("Tidak ada Petugas Kebun di database.");
                        }
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }

        scanner.close();
    }
}
