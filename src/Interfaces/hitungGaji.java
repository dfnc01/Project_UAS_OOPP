package Interfaces;

public interface hitungGaji {
    public static final double gajiPokok_guruPNS = 3287000 ;
    public static final double gajiPerhari_guruHonorer = 50000 ;
    public static final double gajiPokok_satpam = 3415279 ;
    public static final double gajiPokok_tataUsaha = 2747789 ;
    public static final double gajiPokok_petugasKebersihan = 2858170 ;
    public static final double gajiPokok_petugasKebun = 2500000 ;
    public static final double gajiPokok_petugasPerpus = 3380000;

    public static double hitungGaji_guruPNS (){
        return gajiPokok_guruPNS;
    }
    public static double hitungGaji_guruHonorer (){
        return gajiPerhari_guruHonorer * 30;
    }
    public static double hitungGaji_satpam (){
        return gajiPokok_satpam;
    }
    public static double hitungGaji_tataUsaha (){
        return gajiPokok_tataUsaha;
    }
    public static double hitungGaji_petugasKebersihan (){
        return gajiPokok_petugasKebersihan;
    }
    public static double hitungGaji_petugasKebun (){
        return gajiPokok_petugasKebun;
    }
    public static double hitungGaji_petugasPerpus (){
        return gajiPokok_petugasPerpus;
    }
}
