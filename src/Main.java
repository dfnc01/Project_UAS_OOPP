import Class.*;
import Database.*;
import Support_Class_.Alamat;
import java.text.*;
import java.time.LocalDate;
import java.util.*;

public class Main  {
    public static void admin(){
        Scanner sc = new Scanner(System.in);
        Pegawai inputData = new Pegawai("", "", "", 0, "", "", LocalDate.now());
        boolean isLogin = false;

        do {
            System.out.println("\n=====================");
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
                    System.out.print("Masukkan Tanggal Masuk (YYYY-MM-DD): ");
                    LocalDate tanggalMasuk = LocalDate.parse(sc.nextLine());
                    while (tanggalMasuk.isAfter(LocalDate.now())) {
                        System.out.println("Tanggal masuk tidak boleh di masa depan. Masukkan ulang:");
                        tanggalMasuk = LocalDate.parse(sc.nextLine());
                    }

                    Pegawai inputDataBaru = new Pegawai(nama, noTlp, email, 0, profesi, profesi, tanggalMasuk);
                    InputDB.simpanData(inputDataBaru);
                    System.out.println("data berhasil ditambahkan");
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
                            GuruPNS.getListGuruPNS();
                            break;
                        case 2:
                            System.out.println("Data Guru Honorer:");
                            GuruHonorer.getListGuruHonorer();
                            break;
                        case 3:
                            System.out.println("Data Petugas Kebersihan:");
                            PetugasKebersihan.getListPetugasKebersihan();
                            break;
                        case 4:
                            System.out.println("Data Petugas Kebun:");
                            PetugasKebun.getListPetugasKebun();
                            break;
                        case 5:
                            System.out.println("Data Satpam:");
                            Satpam.getListSatpam();
                            break;
                        case 6:
                            System.out.println("Data Tata Usaha:");
                            TataUsaha.getListTataUsaha();
                            break;
                        case 7:
                            System.out.println("Data Petugas Perpustakaan:");
                            PetugasPerpus.getListPetugasPerpus();
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
                            GuruPNS.getListGuruPNS();
                            System.out.print("Masukkan ID Pegawai yang ingin dihapus:");
                            int idGuruPNS = sc.nextInt();
                            GuruPNS.deleteGuruPNS("Guru PNS", idGuruPNS);
                            break;
                        case 2:
                            GuruHonorer.getListGuruHonorer();
                            System.out.print("Masukkan ID Pegawai yang ingin dihapus:");
                            int idGuruHonorer= sc.nextInt();
                            GuruHonorer.deleteGuruHonorer(idGuruHonorer);
                            break;
                        case 3:
                            PetugasKebersihan.getListPetugasKebersihan();
                            System.out.print("Masukkan ID Pegawai yang ingin dihapus:");
                            int idPetugasKebersihan = sc.nextInt();
                            PetugasKebersihan.deletePetugasKebersihan("Petugas Kebersihan", idPetugasKebersihan);
                            break;
                        case 4:
                            PetugasKebun.getListPetugasKebun();
                            System.out.print("Masukkan ID Pegawai yang ingin dihapus:");
                            int idPetugasKebun = sc.nextInt();
                            PetugasKebun.deletePetugasKebun("Petugas Kebun", idPetugasKebun);
                            break;
                        case 5:
                            Satpam.getListSatpam();
                            System.out.print("Masukkan ID Pegawai yang ingin dihapus:");
                            int idSatpam = sc.nextInt();
                            Satpam.deleteSatpam("Satpam", idSatpam);
                            break;
                        case 6:
                            TataUsaha.getListTataUsaha();
                            System.out.print("Masukkan ID Pegawai yang ingin dihapus:");
                            int idTataUsaha = sc.nextInt();
                            TataUsaha.deleteTataUsaha("Tata Usaha", idTataUsaha);
                            break;
                        case 7:
                            PetugasPerpus.getListPetugasPerpus();
                            System.out.print("Masukkan ID Pegawai yang ingin dihapus:");
                            int idPetugasPerpus = sc.nextInt();
                            PetugasPerpus.deletePetugasPerpus("Petugas Perpustakaan", idPetugasPerpus);
                            break;
                        default:
                            System.out.print("Pilihan tidak valid.");
                    }
                    break;
                case 4:
                    System.out.println("Back");
                    isLogin = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }while (!isLogin) ;
        sc.close();
    }

    public static void user(){
        Scanner sc = new Scanner(System.in);
        NumberFormat formatuang = NumberFormat.getInstance(new Locale("id", "ID"));

        System.out.println("\nPilih jenis pekerjaan:");
        System.out.println("1. Pengajar");
        System.out.println("2. Keamanan");
        System.out.println("3. Kebersihan");
        System.out.println("4. Staff");
        System.out.print("Masukkan pilihan (1/2/3/4): ");
        int JenisPekerjaan = sc.nextInt();
        sc.nextLine();

        switch (JenisPekerjaan) {
            case 1:
                System.out.print("Masukkan id Pengajar: ");
                int inputIdPengajar = sc.nextInt();
                Pengajar pengajar = new Pengajar("", "", "", inputIdPengajar, "", "", LocalDate.now());
                String hasilPengajar = pengajar.getProfesi(inputIdPengajar);
                if (hasilPengajar != null) {
                    System.out.println("Total Gaji Pengajar: " + hasilPengajar);
                } else {
                    System.out.println("Data tidak ditemukan atau profesi tidak valid.");
                }
                break;
            case 2:
                System.out.print("Masukkan id Keamanan: ");
                int inputIdKeamanan = sc.nextInt();
                Keamanan keamanan = new Keamanan("", "", "", inputIdKeamanan, "", "", LocalDate.now());
                String hasilKeamanan = keamanan.getProfesi(inputIdKeamanan);
                if (hasilKeamanan != null) {
                    System.out.println("Total Gaji Keamanan: " + hasilKeamanan);
                } else {
                    System.out.println("Data tidak ditemukan atau profesi tidak valid.");
                }
                break;
            case 3:
                System.out.print("Masukkan id Kebersihan: ");
                int inputIdKebersihan = sc.nextInt();
                Kebersihan kebersihan = new Kebersihan("", "", "", inputIdKebersihan, "", "", LocalDate.now());
                String hasilKebersihan = kebersihan.getProfesi(inputIdKebersihan);
                if (hasilKebersihan != null) {
                    System.out.println("Total Gaji Kebersihan: " + hasilKebersihan);
                } else {
                    System.out.println("Data tidak ditemukan atau profesi tidak valid.");
                }
                break;
            case 4:
                System.out.print("Masukkan id Staff: ");
                int inputIdStaff = sc.nextInt();
                Staff staff = new Staff("", "", "", inputIdStaff, "", "", LocalDate.now());
                String hasilStaff = staff.getProfesi(inputIdStaff);
                if (hasilStaff != null) {
                    System.out.println("Total Gaji Staff: " + hasilStaff);
                } else {
                    System.out.println("Data tidak ditemukan atau profesi tidak valid.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    public static void main(String[] args) {
        Create_Connect.create();
        Scanner sc = new Scanner(System.in);
        Alamat alamat = new Alamat("Gajayana ", 50, "Lowokwaru ", "Malang ", "Jawa Timur");
        System.out.print("Alamat: ");
        alamat.TampilkanAlamat();

        String[] Username = {"admin", "user"};
        String[] Password = {"admin", "user"};
        boolean isLogin = false;
        do {
            System.out.println("Login Sebagai");
            System.out.print("Username: ");
            String username = sc.nextLine();
            System.out.print("Password: ");
            String password = sc.nextLine();
            if (username.equals(Username[0]) && password.equals(Password[0])) {
                admin();
            } else if (username.equals(Username[1]) && password.equals(Password[1])) {
                user();
            } else {
                System.out.println(" Login gagal! Username atau password salah.");
            }
        }while (!isLogin) ;
        sc.close();
    }
}
