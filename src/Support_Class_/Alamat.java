package Support_Class_;

public class Alamat {
    String Jalan, Kecamatan, Kota, Provinsi ;
    int No_Jalan ;

    public Alamat(String jalan,  int no_Jalan, String kecamatan, String kota, String provinsi) {
        Jalan = jalan;
        Kecamatan = kecamatan;
        Kota = kota;
        Provinsi = provinsi;
        No_Jalan = no_Jalan;
    }

    public void TampilkanAlamat(){
        System.out.println("Jl."+ Jalan + "No." + No_Jalan + " Kec." + Kecamatan + "Kota " + Kota + Provinsi);
    }
}
