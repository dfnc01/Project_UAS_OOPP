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


        switch (JenisPekerjaan) {
            case 1:
                System.out.println("Memilih Pengajar.");
                System.out.println("Pilih jenis Pengajar:");
                System.out.println("1. Guru Honorer");
                System.out.println("2. Guru PNS");
                System.out.print("Masukkan pilihan (1/2): ");
                int pilihanPengajar = scanner.nextInt();

                if (pilihanPengajar == 1) {
                    System.out.println("Memilih Guru Honorer.");
                    System.out.print("Masukkan jumlah pertemuan: ");
                    int jumlahPertemuan = scanner.nextInt();
                    GuruHonorer guruHonorer = new GuruHonorer("Hanif", "08222", "Hanif@gmail.com", "GH001", "Guru Honorer");
                    double totalGaji = guruHonorer.HitungGaji(jumlahPertemuan);
                    System.out.println("Total gaji Guru Honorer: Rp" + formatuang.format(totalGaji));
                } else if (pilihanPengajar == 2) {
                    System.out.println("Memilih Guru PNS.");
                    System.out.print("Masukkan jumlah hari: ");
                    int jumlahHari = scanner.nextInt();
                    GuruPNS guruPNS = new GuruPNS("Hanif", "0822", "Hanif@gmail.com", "GP001", "Guru PNS");
                    double totalGaji = guruPNS.HitungGaji(jumlahHari);
                    System.out.println("Total gaji Guru PNS: Rp" + formatuang.format(totalGaji));
                } else {
                    System.out.println("Pilihan salah");
                }
                break;

            case 2:
                System.out.println("Memilih Keamanan.");
                System.out.println("Pilih jenis Keamanan:");
                System.out.println("1. Satpam");
                System.out.print("Masukkan pilihan (1): ");
                int pilihanKeamanan = scanner.nextInt();

                if (pilihanKeamanan == 1) {
                    System.out.println("Memilih Satpam.");
                    System.out.print("Masukkan jumlah hari: ");
                    int jumlahHari = scanner.nextInt();
                    Satpam satpam = new Satpam("Hanif", "08222", "haha@gmail.com", "SP001", "Satpam");
                    double totalGaji = satpam.HitungGaji(jumlahHari);
                    System.out.println("Total gaji Satpam: Rp" + formatuang.format(totalGaji));
                } else {
                    System.out.println("Pilihan salah");
                }
                break;

            case 3:
                System.out.println("Memilih Kebersihan.");
                System.out.println("Pilih jenis Kebersihan:");
                System.out.println("1. Petugas Kebersihan");
                System.out.println("2. Petugas Kebun");
                System.out.print("Masukkan pilihan (1/2): ");
                int pilihanKebersihan = scanner.nextInt();

                if (pilihanKebersihan == 1) {
                    System.out.println("Memilih Petugas Kebersihan.");
                    System.out.print("Masukkan jumlah hari: ");
                    int jumlahHari = scanner.nextInt();
                    PetugasKebersihan petugasKebersihan = new PetugasKebersihan("Hahaha", "08222", "hahaha@gmail.com", "PK001", "Petugas Kebersihan");
                    double totalGaji = petugasKebersihan.HitungGaji(jumlahHari);
                    System.out.println("Total gaji Petugas Kebersihan: Rp" + formatuang.format(totalGaji));
                } else if (pilihanKebersihan == 2) {
                    System.out.println("Memilih Petugas Kebun.");
                    System.out.print("Masukkan jumlah hari: ");
                    int jumlahHari = scanner.nextInt();
                    PetugasKebun petugasKebun = new PetugasKebun("Hahaha", "08222", "hahaha@gmail.com", "PK001", "Petugas Kebun");
                    double totalGaji = petugasKebun.HitungGaji(jumlahHari);
                    System.out.println("Total gaji Petugas Kebun: Rp" + formatuang.format(totalGaji));
                } else {
                    System.out.println("Pilihan salah");
                }
                break;

            default:
                System.out.println("Pilihan salah");
        }

        scanner.close();
    }
}
