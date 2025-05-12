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
                    GuruHonorer guruHonorer = new GuruHonorer("Budi", "08123456789", "budi@gmail.com", "GH001", "Guru Honorer");
                    System.out.println("Data Guru Honorer: " + guruHonorer);
                } else if (pilihanPengajar == 2) {
                    System.out.println("Anda memilih Guru PNS.");
                    GuruPNS guruPNS = new GuruPNS("Siti", "08198765432", "siti@gmail.com", "GP001", "Guru PNS");
                    System.out.println("Data Guru PNS: " + guruPNS);
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
                    Satpam satpam = new Satpam("Andi", "08198765432", "andi@gmail.com", "SP001", "Satpam");
                    System.out.println("Data Satpam: " + satpam);
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
                    PetugasKebersihan petugasKebersihan = new PetugasKebersihan("Rina", "08134567890", "rina@gmail.com", "PK001", "Petugas Kebersihan");
                    System.out.println("Data Petugas Kebersihan: " + petugasKebersihan);
                } else if (pilihanKebersihan == 2) {
                    System.out.println("Anda memilih Petugas Kebun.");
                    PetugasKebun petugasKebun = new PetugasKebun("Dedi", "08145678901", "dedi@gmail.com", "PKB001", "Petugas Kebun");
                    System.out.println("Data Petugas Kebun: " + petugasKebun);
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
