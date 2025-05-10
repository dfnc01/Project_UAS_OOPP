public class Pegawai extends Sekolah {
    protected String Id_Petugas, Jabatan;

    public Pegawai( String nama, String no_Tlp, String e_mail, String id_Petugas, String jabatan) {
        super(null, null, nama, "", no_Tlp, e_mail, "");
        Id_Petugas = id_Petugas;
        Jabatan = jabatan;
    }

}
