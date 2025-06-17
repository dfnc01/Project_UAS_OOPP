package Interfaces;

public interface hitungUangMakan {
    public static final double uangMakanPerHari = 25000;

    static double hitungTotalUangMakan(int jumlahHariMasuk) {
        return uangMakanPerHari * jumlahHariMasuk;
    }
}
