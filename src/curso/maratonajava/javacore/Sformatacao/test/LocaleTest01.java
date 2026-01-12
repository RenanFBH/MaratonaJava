package curso.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {

    public static void main(String[] args) {

        // pt-BR
        Locale localeIT = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIN = new Locale("hi", "IN");
        Locale localeJP = new Locale("hi", "IN");
        Locale localeNL = new Locale("nl", "NL");
        Calendar calendar = Calendar.getInstance();
        DateFormat dateInstance1 = DateFormat.getDateInstance(DateFormat.FULL, localeIT);
        DateFormat dateInstance2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat dateInstance3 = DateFormat.getDateInstance(DateFormat.FULL, localeIN);
        DateFormat dateInstance4 = DateFormat.getDateInstance(DateFormat.FULL, localeJP);
        DateFormat dateInstance5 = DateFormat.getDateInstance(DateFormat.FULL, localeNL);

        System.out.println("Itália: " + dateInstance1.format(calendar.getTime()));
        System.out.println("Suiça: " + dateInstance2.format(calendar.getTime()));
        System.out.println("Índia: " + dateInstance3.format(calendar.getTime()));
        System.out.println("Japão: " + dateInstance4.format(calendar.getTime()));
        System.out.println("Holanda: " + dateInstance5.format(calendar.getTime()));

        System.out.println(localeIT.getDisplayCountry(localeIT));
        System.out.println(localeCH.getDisplayCountry(localeCH));
        System.out.println(localeIN.getDisplayCountry(localeIN));
        System.out.println(localeJP.getDisplayCountry(localeJP));
        System.out.println(localeNL.getDisplayCountry(localeNL));

    }

}
