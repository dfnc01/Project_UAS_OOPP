package Support_Class_;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatNominal {
    private static final NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));

    public static String rupiah(double nominal) {
        return formatRupiah.format(nominal);
    }
}
