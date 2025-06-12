package Interfaces;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public interface hitungGaji {
    public static final double gajiPokok_guruPNS = 3287000 ;
    public static final double gajiPerjam_guruHonorer = 50000 ;
    public static final double gajiPokok_satpam = 3415279 ;
    public static final double gajiPokok_tataUsaha = 2747789 ;
    public static final double gajiPokok_petugasKebersihan = 2858170 ;
    public static final double gajiPokok_petugasKebun = 2500000 ;
    public static final double getGajiPokok_petugasPerpus = 3380000;

    public static double hitungGaji_guruPNS (LocalDate tanggal_Masuk){
        long bulanKerja = ChronoUnit.MONTHS.between(
                tanggal_Masuk.withDayOfMonth(1),
                LocalDate.now().withDayOfMonth(1)
        );
        return gajiPokok_guruPNS * Math.max(0, bulanKerja);
    }
    public static double hitungGaji_guruHonorer (LocalDate tanggal_Masuk){
        long hariKerja = ChronoUnit.DAYS.between(
                tanggal_Masuk,
                LocalDate.now()
        );
        return gajiPerjam_guruHonorer * Math.max(0, hariKerja);
    }
    public static double hitungGaji_satpam (LocalDate tanggal_Masuk){
        long bulanKerja = ChronoUnit.MONTHS.between(
                tanggal_Masuk.withDayOfMonth(1),
                LocalDate.now().withDayOfMonth(1)
        );
        return gajiPokok_satpam * Math.max(0, bulanKerja);
    }
    public static double hitungGaji_tataUsaha (LocalDate tanggal_Masuk){
        long bulanKerja = ChronoUnit.MONTHS.between(
                tanggal_Masuk.withDayOfMonth(1),
                LocalDate.now().withDayOfMonth(1)
        );
        return gajiPokok_tataUsaha * Math.max(0, bulanKerja);
    }
    public static double hitungGaji_petugasKebersihan (LocalDate tanggal_Masuk){
        long bulanKerja = ChronoUnit.MONTHS.between(
                tanggal_Masuk.withDayOfMonth(1),
                LocalDate.now().withDayOfMonth(1)
        );
        return gajiPokok_petugasKebersihan * Math.max(0, bulanKerja);
    }
    public static double hitungGaji_petugasKebun (LocalDate tanggal_Masuk){
        long bulanKerja = ChronoUnit.MONTHS.between(
                tanggal_Masuk.withDayOfMonth(1),
                LocalDate.now().withDayOfMonth(1)
        );
        return gajiPokok_petugasKebun * Math.max(0, bulanKerja);
    }
    public static double hitungGaji_petugasPerpus (LocalDate tanggal_Masuk){
        long bulanKerja = ChronoUnit.MONTHS.between(
                tanggal_Masuk.withDayOfMonth(1),
                LocalDate.now().withDayOfMonth(1)
        );
        return getGajiPokok_petugasPerpus * Math.max(0, bulanKerja);
    }
}
