package br.com.etecia.epictask.config;

import java.util.List;
import java.util.Locale;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GlobalControllerAdvice {

    @ModelAttribute("locales")
    public List<Locale> populateLocales() {
        return LocaleInfo.supportedLocales();
    }

}
