package curso.maratonajava.javacore.Sformatacao.test;

import curso.maratonajava.javacore.Gassociacao.dominio.Local;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {

    public static void main(String[] args) {

        Locale localeBR = new Locale("pt", "BR");
        Locale localeDefault = Locale.getDefault();
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] numberFormats = new NumberFormat[4];
        numberFormats[0] = NumberFormat.getInstance(localeJP);
        numberFormats[1] = NumberFormat.getInstance(localeBR);
        numberFormats[2] = NumberFormat.getInstance(localeIT);
        numberFormats[3] = NumberFormat.getInstance();
        double valor = 1_000.2130;
        for (NumberFormat numberFormat : numberFormats) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }
        String valorString = "1_000.2130";
        try {
            System.out.println(numberFormats[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

}
