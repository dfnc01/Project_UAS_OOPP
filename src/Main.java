import Support_Class_.Alamat;
import java.text.*;
import java.util.*;

public class Main {
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
        System.out.print("Masukkan pilihan (1/2/3): ");
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
                    GuruHonorer guruHonorer = new GuruHonorer("abc", "0822", "abc@gmail.com", "12345", "Guru Honorer");
                    //data perpegawai
                    System.out.print("Masukkan jumlah pertemuan: ");
                    int jumlahPertemuan = scanner.nextInt();
                    double totalGaji = guruHonorer.HitungGaji(jumlahPertemuan);
                    System.out.println("Total gaji Guru Honorer: Rp" + formatuang.format(totalGaji));
                } else if (pilihanPengajar == 2) {
                    //data perpegawai
                    GuruPNS guruPNS = new GuruPNS("abc", "0822", "abc@gmail.com", "54321", "Guru PNS");
                    //data perpegawai
                    System.out.print("Masukkan jumlah hari: ");
                    int jumlahHari = scanner.nextInt();
                    double totalGaji = guruPNS.HitungGaji(jumlahHari);
                    System.out.println("Total gaji Guru PNS: Rp" + formatuang.format(totalGaji));
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
                    Satpam satpam = new Satpam("abc", "0822", "abc@gmail.com", "67890", "Satpam");
                    //data perpegawai
                    System.out.print("Masukkan jumlah hari: ");
                    int jumlahHari = scanner.nextInt();
                    double totalGaji = satpam.HitungGaji(jumlahHari);
                    System.out.println("Total gaji Satpam: Rp" + formatuang.format(totalGaji));
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
                    PetugasKebersihan pk = new PetugasKebersihan("abc", "0822", "abc@gmail.com", "11223", "Petugas Kebersihan");
                    //data perpegawai
                    System.out.print("Masukkan jumlah hari: ");
                    int jumlahHari = scanner.nextInt();
                    double totalGaji = pk.HitungGaji(jumlahHari);
                    System.out.println("Total gaji Petugas Kebersihan: Rp" + formatuang.format(totalGaji));
                } else if (pilihanKebersihan == 2) {
                    //data perpegawai
                    PetugasKebun pkb = new PetugasKebun("abc", "0822", "abc@gmail.com", "44556", "Petugas Kebun");
                    //data perpegawai
                    System.out.print("Masukkan jumlah hari: ");
                    int jumlahHari = scanner.nextInt();
                    double totalGaji = pkb.HitungGaji(jumlahHari);
                    System.out.println("Total gaji Petugas Kebun: Rp" + formatuang.format(totalGaji));
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
