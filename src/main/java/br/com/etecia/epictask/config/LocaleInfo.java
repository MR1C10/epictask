package br.com.etecia.epictask.config;

import java.util.List;
import java.util.Locale;

public final class LocaleInfo {

    private LocaleInfo() {}

    public static List<Locale> supportedLocales() {
        return List.of(
            new Locale("pt", "BR"),
            new Locale("en", "US"),
            new Locale("fr"),
            new Locale("es"),
            new Locale("ru"),
            new Locale("de")
        );
    }

}
