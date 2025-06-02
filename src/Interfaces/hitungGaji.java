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
                LocalDate.now().withDayOfMonth(1).minusMonths(1)
        );
        return gajiPokok_guruPNS * bulanKerja ;
    }
    public static double hitungGaji_guruHonorer (LocalDate tanggal_Masuk){
        long bulanKerja = ChronoUnit.DAYS.between(
                tanggal_Masuk.withDayOfMonth(1),
                LocalDate.now().withDayOfMonth(1).minusMonths(1)
        );
        return gajiPerjam_guruHonorer * bulanKerja ;
    }
    public static double hitungGaji_satpam (LocalDate tanggal_Masuk){
        long bulanKerja = ChronoUnit.MONTHS.between(
                tanggal_Masuk.withDayOfMonth(1),
                LocalDate.now().withDayOfMonth(1).minusMonths(1)
        );
        return gajiPokok_satpam * bulanKerja ;
    }
    public static double hitungGaji_tataUsaha (LocalDate tanggal_Masuk){
        long bulanKerja = ChronoUnit.MONTHS.between(
                tanggal_Masuk.withDayOfMonth(1),
                LocalDate.now().withDayOfMonth(1).minusMonths(1)
        );
        return gajiPokok_tataUsaha * bulanKerja ;
    }
    public static double hitungGaji_petugasKebersihan (LocalDate tanggal_Masuk){
        long bulanKerja = ChronoUnit.MONTHS.between(
                tanggal_Masuk.withDayOfMonth(1),
                LocalDate.now().withDayOfMonth(1).minusMonths(1)
        );
        return gajiPokok_petugasKebersihan * bulanKerja ;
    }
    public static double hitungGaji_petugasKebun (LocalDate tanggal_Masuk){
        long bulanKerja = ChronoUnit.MONTHS.between(
                tanggal_Masuk.withDayOfMonth(1),
                LocalDate.now().withDayOfMonth(1).minusMonths(1)
        );
        return gajiPokok_petugasKebun * bulanKerja ;
    }
    public static double hitungGaji_petugasPerpus (LocalDate tanggal_Masuk){
        long bulanKerja = ChronoUnit.MONTHS.between(
                tanggal_Masuk.withDayOfMonth(1),
                LocalDate.now().withDayOfMonth(1).minusMonths(1)
        );
        return getGajiPokok_petugasPerpus * bulanKerja ;
    }


}
