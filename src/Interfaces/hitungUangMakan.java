package Interfaces;

public class hitungUangMakan {
    public static final double uangMakanPerHari = 25000;

    public static double hitungTotalUangMakan(int jumlahHariMasuk) {
        return uangMakanPerHari * jumlahHariMasuk;
    }
}
