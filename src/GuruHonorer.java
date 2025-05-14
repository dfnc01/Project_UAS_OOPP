public class GuruHonorer extends Pengajar {
    public GuruHonorer(String nama, String no_Tlp, String e_mail, String id_Petugas, String jabatan) {
        super(nama, no_Tlp, e_mail, id_Petugas, jabatan);
    }

    public double hitungGaji(int jumlahPertemuan) {
        return 40000 * jumlahPertemuan;
    }    
    
    @Override
    public String toString() {
        return "Nama: " + nama + ", No. Tlp: " + no_Tlp + ", Email: " + e_mail + ", ID Petugas: " + id_Petugas + ", Jabatan: " + jabatan;
    }
}
