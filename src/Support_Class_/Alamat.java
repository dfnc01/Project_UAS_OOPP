package Support_Class_;

public class Alamat {
    String Jalan, Dusun, Desa, Kecamatan, Kota, Provinsi ;
    int No_Jalan ;

    public Alamat(String jalan, String dusun, String desa, String kecamatan, String kota, String provinsi, int no_Jalan) {
        Jalan = jalan;
        Desa = desa;
        Kecamatan = kecamatan;
        Kota = kota;
        Provinsi = provinsi;
        No_Jalan = no_Jalan;
    }

    void TampilkanAlamat(){
        System.out.println("jl."+ Jalan + "no" + No_Jalan +"Dsn"+ Dusun +"Ds" +Desa +"Kec"+ Kecamatan +"Kota"+Kota);
    }
}
