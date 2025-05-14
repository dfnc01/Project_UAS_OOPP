public class Satpam extends Keamanan {
    public Satpam(String nama, String no_Tlp, String e_mail, String id_Petugas, String jabatan) {
        super(nama, no_Tlp, e_mail, id_Petugas, jabatan);
    }

    public double hitungGaji(int jumlahHari) {
        return 60000 * jumlahHari;
    }
    
}
