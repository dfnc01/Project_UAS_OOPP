package Interfaces;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public interface hitungTunjangan {
    public static final double tunjangan_petugasKebersihan = 1000000 ;
    public static final double tunjangan_petugasKebun = 1000000 ;
    public static final double tunjangan_guruHonorer = 1000000 ;
    public static final double tunjangan_guruPNS = 1000000 ;
    public static final double tunjangan_satpam = 1000000 ;
    public static final double tunjangan_tataUsaha = 1000000 ;
    public static final double tunjangan_petugasPerpus = 1000000 ;

    public static double hitungTunjangan_guruPNS (LocalDate tanggal_Masuk){
        long bulanKerja = ChronoUnit.MONTHS.between(
                tanggal_Masuk.withDayOfMonth(1),
                LocalDate.now().withDayOfMonth(1)
        );
        return tunjangan_guruPNS * Math.max(0, bulanKerja);
    }
    public static double hitungTunjangan_guruHonorer(LocalDate tanggal_Masuk){
        long bulanKerja = ChronoUnit.MONTHS.between(
                tanggal_Masuk.withDayOfMonth(1),
                LocalDate.now().withDayOfMonth(1)
        );
        return tunjangan_guruHonorer * Math.max(0, bulanKerja);
    }
    public static double hitungTunjangan_satpam (LocalDate tanggal_Masuk){
        long bulanKerja = ChronoUnit.MONTHS.between(
                tanggal_Masuk.withDayOfMonth(1),
                LocalDate.now().withDayOfMonth(1)
        );
        return tunjangan_satpam * Math.max(0, bulanKerja);
    }
    public static double hitungTunjangan_tataUsaha (LocalDate tanggal_Masuk){
        long bulanKerja = ChronoUnit.MONTHS.between(
                tanggal_Masuk.withDayOfMonth(1),
                LocalDate.now().withDayOfMonth(1)
        );
        return tunjangan_tataUsaha * Math.max(0, bulanKerja);
    }
    public static double hitungTunjangan_petugasKebersihan (LocalDate tanggal_Masuk){
        long bulanKerja = ChronoUnit.MONTHS.between(
                tanggal_Masuk.withDayOfMonth(1),
                LocalDate.now().withDayOfMonth(1)
        );
        return tunjangan_petugasKebersihan * Math.max(0, bulanKerja);
    }
    public static double hitungTunjangan_petugasKebun (LocalDate tanggal_Masuk){
        long bulanKerja = ChronoUnit.MONTHS.between(
                tanggal_Masuk.withDayOfMonth(1),
                LocalDate.now().withDayOfMonth(1)
        );
        return tunjangan_petugasKebun * Math.max(0, bulanKerja);
    }
    public static double hitungTunjangan_petugasPerpus (LocalDate tanggal_Masuk){
        long bulanKerja = ChronoUnit.MONTHS.between(
                tanggal_Masuk.withDayOfMonth(1),
                LocalDate.now().withDayOfMonth(1)
        );
        return tunjangan_petugasPerpus * Math.max(0, bulanKerja);
    }
}
