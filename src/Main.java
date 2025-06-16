import Class.*;
import Database.*;
import Support_Class_.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main  {
    public static void admin(Scanner sc){
        boolean isLogin = false;
        do {
            System.out.println("Menu Admin");
            System.out.println("1. Input Data Pegawai");
            System.out.println("2. Tampilkan Data Pegawai");
            System.out.println("3. Hapus Data Pegawai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1/2/3/4): ");
            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    System.out.println("Masukkan Data Pegawai Baru ");
                    System.out.print("Masukkan Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan No Telepon : ");
                    String noTlp = sc.nextLine();
                    System.out.print("Masukkan Email : ");
                    String email = sc.nextLine();
                    System.out.println("Daftar Profesi yang tersedia:");
                    System.out.println("1. " + new GuruPNS().getRole());
                    System.out.println("2. " + new GuruHonorer().getRole());
                    System.out.println("3. " + new PetugasKebersihan().getRole());
                    System.out.println("4. " + new PetugasKebun().getRole());
                    System.out.println("5. " + new Satpam().getRole());
                    System.out.println("6. " + new TataUsaha().getRole());
                    System.out.println("7. " + new PetugasPerpus().getRole());
                    System.out.print("Pilih Profesi (1/2/3/4/5/6/7): ");
                    int pilihProfesi = sc.nextInt();
                    sc.nextLine();
                    String profesi = "";
                    switch (pilihProfesi) {
                        case 1: profesi = new GuruPNS().getRole(); break;
                        case 2: profesi = new GuruHonorer().getRole(); break;
                        case 3: profesi = new PetugasKebersihan().getRole(); break;
                        case 4: profesi = new PetugasKebun().getRole(); break;
                        case 5: profesi = new Satpam().getRole(); break;
                        case 6: profesi = new TataUsaha().getRole(); break;
                        case 7: profesi = new PetugasPerpus().getRole(); break;
                        default: System.out.println("Pilihan tidak valid."); return;
                    }

                    System.out.print("Masukkan Tanggal Masuk (format: DD-MM-YYYY): ");
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    LocalDate tanggalMasuk = null;
                    while (tanggalMasuk == null) {
                        try {
                            String inputTanggal = sc.nextLine();
                            tanggalMasuk = LocalDate.parse(inputTanggal, formatter);
                        } catch (Exception e) {
                            System.out.println("Format tanggal salah. Silakan masukkan ulang (format: DD-MM-YYYY): ");
                        }
                    }

                    Pegawai inputDataBaru = new Pegawai(nama, noTlp, email, 0, profesi, profesi, tanggalMasuk);
                    InputDB.simpanData(inputDataBaru);
                    System.out.println("Data berhasil ditambahkan.");
                    System.out.println("Data pegawai yang baru ditambahkan:");
                    tampilkanPegawaiTerakhir();
                    break;
                case 2:
                    System.out.println("Masukkan Profesi Pegawai yang ingin dilihat:");
                    System.out.println("1. Guru PNS");
                    System.out.println("2. Guru Honorer");
                    System.out.println("3. Petugas Kebersihan");
                    System.out.println("4. Petugas Kebun");
                    System.out.println("5. Satpam");
                    System.out.println("6. Tata Usaha");
                    System.out.println("7. Petugas Perpustakaan");
                    System.out.print("Masukkan pilihan (1/2/3/4/5/6/7): ");
                    int pilihProfesiLihat = sc.nextInt();
                    switch (pilihProfesiLihat) {
                        case 1:
                            System.out.println("Data Guru PNS:");
                            GuruPNS.ListAdminGuruPNS();
                            break;
                        case 2:
                            System.out.println("Data Guru Honorer:");
                            GuruHonorer.ListAdminGuruHonorer();
                            break;
                        case 3:
                            System.out.println("Data Petugas Kebersihan:");
                            PetugasKebersihan.ListAdminPetugasKebersihan();
                            break;
                        case 4:
                            System.out.println("Data Petugas Kebun:");
                            PetugasKebun.ListAdminPetugasKebun();
                            break;
                        case 5:
                            System.out.println("Data Satpam:");
                            Satpam.ListAdminSatpam();
                            break;
                        case 6:
                            System.out.println("Data Tata Usaha:");
                            TataUsaha.ListAdminTataUsaha();
                            break;
                        case 7:
                            System.out.println("Data Petugas Perpustakaan:");
                            PetugasPerpus.ListAdminPetugasPerpus();
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                    }
                    break;
                case 3:
                    System.out.println("Masukkan Profesi Pegawai yang ingin dihapus:");
                    System.out.println("1. Guru PNS");
                    System.out.println("2. Guru Honorer");
                    System.out.println("3. Petugas Kebersihan");
                    System.out.println("4. Petugas Kebun");
                    System.out.println("5. Satpam");
                    System.out.println("6. Tata Usaha");
                    System.out.println("7. Petugas Perpustakaan");
                    System.out.print("Masukkan pilihan (1/2/3/4/5/6/7): ");
                    int pilihHapus = sc.nextInt();
                    sc.nextLine();
                    switch (pilihHapus) {
                        case 1:
                            GuruPNS.ListAdminGuruPNS();
                            System.out.print("Masukkan ID Pegawai yang ingin dihapus:");
                            int idGuruPNS = sc.nextInt();
                            GuruPNS.deleteGuruPNS("Guru PNS", idGuruPNS);
                            break;
                        case 2:
                            GuruHonorer.ListAdminGuruHonorer();
                            System.out.print("Masukkan ID Pegawai yang ingin dihapus:");
                            int idGuruHonorer= sc.nextInt();
                            GuruHonorer.deleteGuruHonorer(idGuruHonorer);
                            break;
                        case 3:
                            PetugasKebersihan.ListAdminPetugasKebersihan();
                            System.out.print("Masukkan ID Pegawai yang ingin dihapus:");
                            int idPetugasKebersihan = sc.nextInt();
                            PetugasKebersihan.deletePetugasKebersihan("Petugas Kebersihan", idPetugasKebersihan);
                            break;
                        case 4:
                            PetugasKebun.ListAdminPetugasKebun();
                            System.out.print("Masukkan ID Pegawai yang ingin dihapus:");
                            int idPetugasKebun = sc.nextInt();
                            PetugasKebun.deletePetugasKebun("Petugas Kebun", idPetugasKebun);
                            break;
                        case 5:
                            Satpam.ListAdminSatpam();
                            System.out.print("Masukkan ID Pegawai yang ingin dihapus:");
                            int idSatpam = sc.nextInt();
                            Satpam.deleteSatpam("Satpam", idSatpam);
                            break;
                        case 6:
                            TataUsaha.ListAdminTataUsaha();
                            System.out.print("Masukkan ID Pegawai yang ingin dihapus:");
                            int idTataUsaha = sc.nextInt();
                            TataUsaha.deleteTataUsaha("Tata Usaha", idTataUsaha);
                            break;
                        case 7:
                            PetugasPerpus.ListAdminPetugasPerpus();
                            System.out.print("Masukkan ID Pegawai yang ingin dihapus:");
                            int idPetugasPerpus = sc.nextInt();
                            PetugasPerpus.deletePetugasPerpus("Petugas Perpustakaan", idPetugasPerpus);
                            break;
                        default:
                            System.out.print("Pilihan tidak valid.");
                    }
                    break;
                case 4:
                    System.out.println("Terimakasih.\n");
                    isLogin = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }while (!isLogin) ;
        sc.nextLine();
    }

    public static void user(Scanner sc){
        System.out.println("\nPilih jenis pekerjaan:");
        System.out.println("1. Guru PNS");
        System.out.println("2. Guru Honorer");
        System.out.println("3. Petugas Kebersihan");
        System.out.println("4. Petugas Kebun");
        System.out.println("5. Satpam");
        System.out.println("6. Tata Usaha");
        System.out.println("7. Petugas Perpustakaan");
        System.out.print("Masukkan pilihan (1/2/3/4/5/6/7): ");
        int pilihan = sc.nextInt();
        System.out.print("Masukkan ID Pegawai: ");
        int idPegawai = sc.nextInt();
        System.out.print("Masukkan jumlah hari masuk (untuk uang makan): ");
        int hariMasuk = sc.nextInt();
        sc.nextLine();
        switch (pilihan) {
            case 1:
                GuruPNS.ListUserGuruPNS(idPegawai, hariMasuk);
                break;
            case 2:
                GuruHonorer.ListUserGuruHonorer(idPegawai, hariMasuk);
                break;
            case 3:
                PetugasKebersihan.ListUserPetugasKebersihan(idPegawai, hariMasuk);
                break;
            case 4:
                PetugasKebun.ListUserPetugasKebun(idPegawai, hariMasuk);
                break;
            case 5:
                Satpam.ListUserSatpam(idPegawai, hariMasuk);
                break;
            case 6:
                TataUsaha.ListUserTataUsaha(idPegawai, hariMasuk);
                break;
            case 7:
                PetugasPerpus.ListUserPetugasPerpus(idPegawai, hariMasuk);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
        sc.nextLine();
    }

    public static void main(String[] args) {
        Create_Connect.create();
        Scanner sc = new Scanner(System.in);

        Alamat alamat = new AlamatSekolah("Gajayana ", 50, "Lowokwaru ", "Malang ", "Jawa Timur\n");
        System.out.print("\nAlamat: ");
        alamat.TampilkanAlamat();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine().trim();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine().trim();
        boolean loginSukses = false;

        try (BufferedReader br = new BufferedReader(
                new FileReader("src/Database/username.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String fileUsername = parts[0].trim();
                    String filePassword = parts[1].trim();
                    if (username.equals(fileUsername) && password.equals(filePassword)) {
                        loginSukses = true;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (loginSukses) {
            admin(sc);
        } else {
            user(sc);
        }

        sc.close();
    }

    public static void tampilkanPegawaiTerakhir() {
        String link = "jdbc:sqlite:Database.db";
        String sql = "SELECT * FROM Pegawai ORDER BY idPegawai DESC LIMIT 1";
        try (java.sql.Connection con = java.sql.DriverManager.getConnection(link);
            java.sql.Statement stmt = con.createStatement();
            java.sql.ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                System.out.println("===============================================================");
                System.out.println("ID: " + rs.getInt("idPegawai"));
                System.out.println("Nama: " + rs.getString("nama"));
                System.out.println("No Telp: " + rs.getString("noTelp"));
                System.out.println("Email: " + rs.getString("email"));
                String tanggalDb = rs.getString("tanggalMasuk");
                LocalDate tanggalMasuk = LocalDate.parse(tanggalDb); 
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                System.out.println("Tanggal Masuk: " + tanggalMasuk.format(formatter));
                System.out.println("Profesi: " + rs.getString("profesi"));
                System.out.println("===============================================================");
            } else {
                System.out.println("Data tidak ditemukan.");
            }
        } catch (Exception e) {
            System.out.println("Error saat mengambil data pegawai: " + e.getMessage());
        }
    }
}
