public class PetugasKebersihan extends Kebersihan {
    public PetugasKebersihan(String nama, String no_Tlp, String e_mail, String id_Petugas, String jabatan) {
        super(nama, no_Tlp, e_mail, id_Petugas, jabatan);
    }

    public double hitungGaji(int jumlahHari) {
        return 50000 * jumlahHari;
    }
}
