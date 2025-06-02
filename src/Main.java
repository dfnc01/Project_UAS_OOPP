import Support_Class_.Alamat;
import java.text.*;
import java.time.LocalDate;
import java.util.*;
import Class.*;
import Database.*;

public class Main  {

    public static void admin(){
        Scanner sc = new Scanner(System.in);
        Pegawai inputData = new Pegawai("", "", "", 0, "", LocalDate.now());
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
                    //input data pegawai

                    System.out.println("Masukkan Data Pegawai Baru ");
                    System.out.println("Masukkan Nama :");
                    inputData.setNama(sc.next());
                    sc.nextLine();
                    System.out.println("Masukkan No Telepon :");
                    inputData.setNo_Tlp(sc.next());
                    sc.nextLine();
                    System.out.println("Masukkan Email :");
                    inputData.setE_mail(sc.next());
                    sc.nextLine();
                    System.out.println("Masukkan ID Pegawai :");
                    inputData.setId_Pegawai(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Masukkan Profesi :");
                    inputData.setProfesi(sc.next());
                    sc.nextLine();
                    System.out.println("Masukkan Tanggal Masuk (YYYY-MM-DD):");
                    inputData.setTanggal_Masuk(LocalDate.parse(sc.nextLine()));

                    // Simpan data pegawai ke database
                    InputDB.simpanData(inputData);

                    break;
                case 2:
                    //tampilkan data pegawai
                    System.out.println("Masukkan Profesi Pegawai yang ingin dilihat:");
                    System.out.println("1. Guru PNS");
                    System.out.println("2. Guru Honorer");
                    System.out.println("3. Petugas Kebersihan");
                    System.out.println("4. Petugas Kebun");
                    System.out.println("5. Satpam");
                    System.out.println("6. Tata Usaha");
                    System.out.println("7. Petugas Perpustakaan");
                    System.out.print("Masukkan pilihan (1/2/3/4/5/6/7): ");
                    int pilihProfesi = sc.nextInt();
                    switch (pilihProfesi) {
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
                            petugasPerpus.getListPetugasPerpus();
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                    }
                    break;
                case 3:
                    //hapus data pegawai
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
                            int idGuruPNS = sc.nextInt();
                            GuruPNS.deleteGuruPNS("Guru PNS", 0);
                            break;
                        case 2:
                            GuruHonorer.getListGuruHonorer();
                            int idGuruHonorer= sc.nextInt();
                            GuruHonorer.deleteGuruHonorer(idGuruHonorer);
                            break;
                        case 3:
                            PetugasKebersihan.getListPetugasKebersihan();
                            int idPetugasKebersihan = sc.nextInt();
                            PetugasKebersihan.deletePetugasKebersihan("Petugas Kebersihan", 0);
                            break;
                        case 4:
                            PetugasKebun.getListPetugasKebun();
                            int idPetugasKebun = sc.nextInt();
                            PetugasKebun.deletePetugasKebun("Petugas Kebun", 0);
                            break;
                        case 5:
                            Satpam.getListSatpam();
                            int idSatpam = sc.nextInt();
                            Satpam.deleteSatpam("Satpam", 0);
                            break;
                        case 6:
                            TataUsaha.getListTataUsaha();
                            int idTataUsaha = sc.nextInt();
                            TataUsaha.deleteTataUsaha("Tata Usaha", 0);
                            break;
                        case 7:
                            petugasPerpus.getListPetugasPerpus();
                            int idPetugasPerpus = sc.nextInt();
                            petugasPerpus.deletePetugasPerpus("Petugas Perpustakaan", 0);
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                    }
                    System.out.println("Masukkan ID Pegawai yang ingin dihapus:");
                    int idPegawai = sc.nextInt();
                    sc.nextLine();
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
                Pengajar gajiPengajar = new Pengajar("", "", "", 0, "", LocalDate.now());
                System.out.println("Masukkan id Pengajar:");
                int inputIdPengajar = sc.nextInt();
                gajiPengajar.getProfesi(inputIdPengajar);
                break;
            case 2:
                Keamanan gajiKeamanan = new Keamanan("", "", "", 0, "", LocalDate.now());
                System.out.println("Masukkan id Keamanan:");
                int inputIdKeamanan = sc.nextInt();
                gajiKeamanan.getProfesi(inputIdKeamanan);
                break;
            case 3:
                Kebersihan gajiKebersihan = new Kebersihan("", "", "", 0, "", LocalDate.now());
                System.out.println("Masukkan id Kebersihan:");
                int inputIdKebersihan = sc.nextInt();
                gajiKebersihan.getProfesi(inputIdKebersihan);
                break;
            case 4:
                Staff gajiStaff = new Staff("", "", "", 0, "", LocalDate.now());
                System.out.println("Memilih Pengajar:");
                int inputIdStaff = sc.nextInt();
                gajiStaff.getProfesi(inputIdStaff);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alamat alamat = new Alamat("Gajayana ", 50, "Lowokwaru ", "Malang ", "Jawa Timur");
        System.out.print("Alamat: ");
        alamat.TampilkanAlamat();

        String[] Username = {"admin", "user"};
        String[] Password = {"admin1234", "12345678"};
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
