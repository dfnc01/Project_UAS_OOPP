package Support_Class_;

import Class.*;
import java.time.LocalDate;

public class TestIsA {
    public static void main(String[] args) {
        GuruPNS guruPNS = new GuruPNS("Hanif", "0812", "hanif@mail.com", 1, "Guru PNS", LocalDate.now());
        System.out.println(guruPNS instanceof GuruPNS);
        System.out.println(guruPNS instanceof Pengajar);
        System.out.println(guruPNS instanceof Pegawai);

        PetugasKebersihan petugasKebersihan = new PetugasKebersihan("Yordan", "0813", "yordan@mail.com", 2, "Petugas Kebersihan", LocalDate.now());
        System.out.println(petugasKebersihan instanceof PetugasKebersihan);
        System.out.println(petugasKebersihan instanceof Kebersihan);
        System.out.println(petugasKebersihan instanceof Pegawai);

        TataUsaha tataUsaha = new TataUsaha("Dian", "0814", "dian@mail.com", 3, "Tata Usaha", LocalDate.now());
        System.out.println(tataUsaha instanceof TataUsaha);
        System.out.println(tataUsaha instanceof Staff);
        System.out.println(tataUsaha instanceof Pegawai);

        Satpam satpam = new Satpam("Joko", "0815", "joko@mail.com", 4, "Satpam", LocalDate.now());
        System.out.println(satpam instanceof Satpam);
        System.out.println(satpam instanceof Keamanan);
        System.out.println(satpam instanceof Pegawai);

        PetugasPerpus petugasPerpus = new PetugasPerpus("Dewi", "0816", "dewi@mail.com", 5, "Petugas Perpustakaan", LocalDate.now());
        System.out.println(petugasPerpus instanceof PetugasPerpus);
        System.out.println(petugasPerpus instanceof Staff);
        System.out.println(petugasPerpus instanceof Pegawai);

        AlamatSekolah alamatSekolah = new AlamatSekolah("Gajayana", 50, "Lowokwaru", "Malang", "Jawa Timur");
        System.out.println(alamatSekolah instanceof AlamatSekolah);
        System.out.println(alamatSekolah instanceof Alamat);
    }
}
