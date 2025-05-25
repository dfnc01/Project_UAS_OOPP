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
            System.out.println("Menu Admin:");
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
                    inputData.setNama (sc.next());
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
                    sc.close();
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
                            GuruPNS.deleteGuruPNS("Guru PNS", 0);
                            break;
                        case 2:
                            GuruHonorer.getListGuruHonorer();
                            GuruHonorer.deleteGuruHonorer("Guru Honorer", 0);
                            break;
                        case 3:
                            PetugasKebersihan.getListPetugasKebersihan();
                            PetugasKebersihan.deletePetugasKebersihan("Petugas Kebersihan", 0);
                            break;
                        case 4:
                            PetugasKebun.getListPetugasKebun();
                            PetugasKebun.deletePetugasKebun("Petugas Kebun", 0);
                            break;
                        case 5:
                            Satpam.getListSatpam();
                            Satpam.deleteSatpam("Satpam", 0);
                            break;
                        case 6:
                            TataUsaha.getListTataUsaha();
                            TataUsaha.deleteTataUsaha("Tata Usaha", 0);
                            break;
                        case 7:
                            petugasPerpus.getListPetugasPerpus();
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
                System.out.println("Memilih Pengajar.");
                System.out.println("1. Guru Honorer");
                System.out.println("2. Guru PNS");
                System.out.print("Masukkan pilihan (1/2): ");
                int pilihanPengajar = sc.nextInt();
                sc.nextLine();

                if (pilihanPengajar == 1) {

                    System.out.print("Masukkan Id Pegawai :");


//                    System.out.println("Total gaji Guru PNS: Rp" + formatuang.format(guruHonorer.totalGajiGuruHonorer()));
                } else if (pilihanPengajar == 2) {
                    //data perpegawai
                    GuruPNS guruPNS = new GuruPNS("abc", "0822", "abc@gmail.com", 54321, "Guru PNS", LocalDate.of(2024, 4, 18));
                    //data perpegawai

                    System.out.println("Total gaji Guru PNS: Rp" + formatuang.format(guruPNS.totalGajiGuruPNS()));
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
                break;
            case 2:
                System.out.println("Memilih Keamanan.");
                System.out.println("1. Satpam");
                System.out.print("Masukkan pilihan (1): ");
                int pilihanKeamanan = sc.nextInt();
                sc.nextLine();

                if (pilihanKeamanan == 1) {
                    //data perpegawai
                    Satpam satpam = new Satpam("abc", "0822", "abc@gmail.com", 67890, "Satpam",LocalDate.of(2024, 4, 18));
                    //data perpegawai
                    System.out.print("Masukkan jumlah id: ");

                    System.out.println("Total gaji Satpam: Rp" + formatuang.format(satpam.totalGajiSatpam()));
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
                break;
            case 3:
                System.out.println("Memilih Kebersihan.");
                System.out.println("1. Petugas Kebersihan");
                System.out.println("2. Petugas Kebun");
                System.out.print("Masukkan pilihan (1/2): ");
                int pilihanKebersihan = sc.nextInt();
                sc.nextLine();

                if (pilihanKebersihan == 1) {
                    //data perpegawai
                    PetugasKebersihan pk = new PetugasKebersihan("abc", "0822", "abc@gmail.com", 11223, "Petugas Kebersihan",LocalDate.of(2024, 4, 18));
                    //data perpegawai
                    System.out.print("Masukkan jumlah hari: ");

                    System.out.println("Total gaji Petugas Class.Kebersihan: Rp" + formatuang.format(pk.totalGajiPetugasKebersihan()));
                } else if (pilihanKebersihan == 2) {
                    //data perpegawai
                    PetugasKebun pkb = new PetugasKebun("abc", "0822", "abc@gmail.com", 44556, "Petugas Kebun",LocalDate.of(2024, 4, 18));
                    //data perpegawai
                    System.out.print("Masukkan jumlah hari: ");
                    System.out.println("Total gaji Petugas Kebun: Rp" + formatuang.format(pkb.totalGajiPetugasKebun()));
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
                break;
            case 4:
                System.out.println("Memilih Pengajar.");
                System.out.println("1. Tata Usaha");
                System.out.println("2. Petugas Perpus");
                System.out.print("Masukkan pilihan (1/2): ");
                int pilihanStaff = sc.nextInt();
                sc.nextLine();

                if (pilihanStaff == 1) {
                    //data perpegawai
                    TataUsaha p = new TataUsaha("abc", "0822", "abc@gmail.com", 12345, "Tata Usaha",LocalDate.of(2022, 4, 18));
                    //data perpegawai
                    System.out.println("Total gaji Tata Usaha: Rp" + formatuang.format(p.totalGajiTataUsaha()));
                } else if (pilihanStaff == 2) {
                    //data perpegawai
                    petugasPerpus pp = new petugasPerpus("abc", "0822", "abc@gmail.com", 54321, " Petugas Perpus", LocalDate.of(2024, 4, 18));
                    //data perpegawa

                    System.out.println("Total gaji Guru PNS: Rp" + formatuang.format(pp.totalGajiPetugasPerpus()));
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
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
            System.out.println("Login Sebagai :");
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
