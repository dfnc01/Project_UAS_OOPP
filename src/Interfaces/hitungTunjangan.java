package Interfaces;

public interface hitungTunjangan {
    public static final double tunjangan_petugasKebersihan = 1000000 ;
    public static final double tunjangan_petugasKebun = 1000000 ;
    public static final double tunjangan_guruHonorer = 1000000 ;
    public static final double tunjangan_guruPNS = 1000000 ;
    public static final double tunjangan_satpam = 1000000 ;
    public static final double tunjangan_tataUsaha = 1000000 ;
    public static final double tunjangan_petugasPerpus = 1000000 ;

    public static double hitungTunjangan_guruPNS (){
        return tunjangan_guruPNS;
    }
    public static double hitungTunjangan_guruHonorer(){
        return tunjangan_guruHonorer;
    }
    public static double hitungTunjangan_satpam (){
        return tunjangan_satpam;
    }
    public static double hitungTunjangan_tataUsaha (){
        return tunjangan_tataUsaha;
    }
    public static double hitungTunjangan_petugasKebersihan (){
        return tunjangan_petugasKebersihan;
    }
    public static double hitungTunjangan_petugasKebun (){
        return tunjangan_petugasKebun;
    }
    public static double hitungTunjangan_petugasPerpus (){
        return tunjangan_petugasPerpus;
    }
}
