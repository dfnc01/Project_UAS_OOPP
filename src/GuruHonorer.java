import Interfaces.hitungGaji;
public class GuruHonorer extends Pengajar implements hitungGaji {

    private double gajiPokok = 3000000;
    private double tunjangan = 1000000;
    private double gajiPerjam = 80000;

    public GuruHonorer(String nama, String no_Tlp, String e_mail, String id_Petugas, String jabatan) {
        super(nama, no_Tlp, e_mail, id_Petugas, jabatan);
    }

    @Override
    public double HitungGajiPokok() {
        return gajiPokok;
    }

    @Override
    public double HitungTunjangan() {
        return tunjangan;
    }

    @Override
    public double HitungGajiHarian() {
        return 0;
    }

    @Override
    public double HitungGajiPertemuan() {
        return gajiPerjam;
    }

    public double HitungGaji(int jumlahPertemuan) {
        return (gajiPerjam * jumlahPertemuan);
    }
}
