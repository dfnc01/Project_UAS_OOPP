import Interfaces.hitungGaji;
public class Satpam extends Keamanan implements hitungGaji {
    private double gajiPokok = 3000000;
    private double tunjangan = 1000000;
    private double gajiPerHari = 80000;

    public Satpam(String nama, String no_Tlp, String e_mail, String id_Petugas, String jabatan) {
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
        return gajiPerHari;
    }

    @Override
    public double HitungGajiPertemuan() {
        return 0; 
    }

    public double HitungGaji(int jumlahHari) {
        return (gajiPerHari * jumlahHari);
    }
    
}
