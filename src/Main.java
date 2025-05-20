import Support_Class_.Alamat;
import java.text.*;
import java.time.LocalDate;
import java.util.*;
import Class.*;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat formatuang = NumberFormat.getInstance(new Locale("id", "ID"));

        Alamat alamat = new Alamat("Gajayana ", 50, "Lowokwaru ", "Malang ", "Jawa Timur");
        System.out.print("Alamat: ");
        alamat.TampilkanAlamat();

        System.out.println("\nPilih jenis pekerjaan:");
        System.out.println("1. Pengajar");
        System.out.println("2. Keamanan");
        System.out.println("3. Kebersihan");
        System.out.println("4. Staff");
        System.out.print("Masukkan pilihan (1/2/3/4): ");
        int JenisPekerjaan = scanner.nextInt();
        scanner.nextLine();

        switch (JenisPekerjaan) {
            case 1:
                System.out.println("Memilih Pengajar.");
                System.out.println("1. Guru Honorer");
                System.out.println("2. Guru PNS");
                System.out.print("Masukkan pilihan (1/2): ");
                int pilihanPengajar = scanner.nextInt();
                scanner.nextLine();

                if (pilihanPengajar == 1) {
                    //data perpegawai
                    GuruHonorer guruHonorer = new GuruHonorer("abc", "0822", "abc@gmail.com", "12345", "Guru Honorer",LocalDate.of(2022, 4, 18));
                    //data perpegawai
                    System.out.println("Total gaji Guru PNS: Rp" + formatuang.format(guruHonorer.totalGajiGuruHonorer()));
                } else if (pilihanPengajar == 2) {
                    //data perpegawai
                    GuruPNS guruPNS = new GuruPNS("abc", "0822", "abc@gmail.com", "54321", "Guru PNS", LocalDate.of(2024, 4, 18));
                    //data perpegawai
//                    int jumlahBulan = scanner.nextInt();
//                    double totalGaji = hitungGaji(jumlahBulan);
                    System.out.println("Total gaji Guru PNS: Rp" + formatuang.format(guruPNS.totalGajiGuruPNS()));
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
                break;
            case 2:
                System.out.println("Memilih Keamanan.");
                System.out.println("1. Satpam");
                System.out.print("Masukkan pilihan (1): ");
                int pilihanKeamanan = scanner.nextInt();
                scanner.nextLine();

                if (pilihanKeamanan == 1) {
                    //data perpegawai
                    Satpam satpam = new Satpam("abc", "0822", "abc@gmail.com", "67890", "Satpam",LocalDate.of(2024, 4, 18));
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
                int pilihanKebersihan = scanner.nextInt();
                scanner.nextLine();

                if (pilihanKebersihan == 1) {
                    //data perpegawai
                    PetugasKebersihan pk = new PetugasKebersihan("abc", "0822", "abc@gmail.com", "11223", "Petugas CKebersihan",LocalDate.of(2024, 4, 18));
                    //data perpegawai
                    System.out.print("Masukkan jumlah hari: ");
//                    int jumlahHari = scanner.nextInt();
//                    double totalGaji = pk.HitungGaji(jumlahHari);
                    System.out.println("Total gaji Petugas Class.Kebersihan: Rp" + formatuang.format(pk.totalGajiPetugasKebersihan()));
                } else if (pilihanKebersihan == 2) {
                    //data perpegawai
                    PetugasKebun pkb = new PetugasKebun("abc", "0822", "abc@gmail.com", "44556", "Petugas Kebun",LocalDate.of(2024, 4, 18));
                    //data perpegawai
                    System.out.print("Masukkan jumlah hari: ");
//                    int jumlahHari = scanner.nextInt();
//                    double totalGaji = pkb.HitungGaji(jumlahHari);
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
                int pilihanStaff = scanner.nextInt();
                scanner.nextLine();

                if (pilihanStaff == 1) {
                    //data perpegawai
                    TataUsaha p = new TataUsaha("abc", "0822", "abc@gmail.com", "12345", "Guru Honorer",LocalDate.of(2022, 4, 18));
                    //data perpegawai
                    System.out.println("Total gaji Tata Usaha: Rp" + formatuang.format(p.totalGajiTataUsaha()));
                } else if (pilihanStaff == 2) {
                    //data perpegawai
                    petugasPerpus pp = new petugasPerpus("abc", "0822", "abc@gmail.com", "54321", "Guru PNS", LocalDate.of(2024, 4, 18));
                    //data perpegawa

                    System.out.println("Total gaji Guru PNS: Rp" + formatuang.format(pp.totalGajiPetugasPerpus()));
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
