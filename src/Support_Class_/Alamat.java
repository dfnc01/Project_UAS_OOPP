package Support_Class_;

public class Alamat {
    String Jalan, Dusun, Desa, Kecamatan, Kota, Provinsi ;
    int No_Jalan ;

    public Alamat(String jalan, String dusun, String desa, String kecamatan, String kota, String provinsi, int no_Jalan) {
        Jalan = jalan;
        Dusun = dusun;
        Desa = desa;
        Kecamatan = kecamatan;
        Kota = kota;
        Provinsi = provinsi;
        No_Jalan = no_Jalan;
    }

    void TampilkanAlamat(){
        System.out.println();
    }
}
