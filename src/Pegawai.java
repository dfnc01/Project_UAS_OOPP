public class Pegawai extends Sekolah {
    protected String NIP, Jabatan ;

    public Pegawai(String nama, String no_Tlp, String e_mail,  String NIP, String jabatan) {
        super(null,null , nama, "", no_Tlp, e_mail, "");
        this.NIP = NIP ;
        Jabatan = jabatan ;
    }
}
