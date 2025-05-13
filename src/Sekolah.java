public class Sekolah {
    private String Nama, Status_Akreditasi, No_Tlp, E_mail, Website  ;
    private long NIS, NPSN ;

    public Sekolah(Long NIS, Long NPSN, String nama, String status_Akreditasi, String no_Tlp, String e_mail, String website ) {
        this.Nama = nama;
        this.Status_Akreditasi = status_Akreditasi;
        this.No_Tlp = no_Tlp;
        this.E_mail = e_mail;
        this.Website = website;
    }

}
