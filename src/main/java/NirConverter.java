import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;

import java.util.Locale;
import java.util.regex.Pattern;

@FacesConverter(value = "nirConverter")

public class NirConverter implements Converter<NIR> {
    @Override
    public NIR getAsObject(FacesContext faceContext, UIComponent uiComponent, String s) {
        s = s.replace(" ", "").toUpperCase(Locale.ROOT);
        if (s.length() != 15) errorDetected();
        if (!Pattern.matches("[0-9]{6}[0-9,A,B][0-9]{8}", s)) errorDetected();
        NIR nir = new NIR();
        nir.SetSexe(Byte.parseByte(s.substring(0, 1)));
        nir.setAnneeNaissance(Byte.parseByte(s.substring(1, 3)));
        nir.setMoisNaissance(Byte.parseByte(s.substring(3, 5)));
        nir.setLieuNaissance(s.substring(5, 10));
        nir.setOrdreNaissance(Short.parseShort(s.substring(10, 13)));
        nir.setClef(Byte.parseByte(s.substring(13, 15)));
        return nir;

    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, NIR nir) {
        s = s.replace(" ", "").toUpperCase(Locale.ROOT);
        if (s.length() != 15) errorDetected();
        if (!Pattern.matches("[0-9]{6}[0-9,A,B][0-9]{8}", s)) errorDetected();
        NIR nir = new NIR();
        nir.SetSexe(Byte.parseByte(s.substring(0, 1)));
        nir.setAnneeNaissance(Byte.parseByte(s.substring(1, 3)));
        nir.setMoisNaissance(Byte.parseByte(s.substring(3, 5)));
        nir.setLieuNaissance(s.substring(5, 10));
        nir.setOrdreNaissance(Short.parseShort(s.substring(10, 13)));
        nir.setClef(Byte.parseByte(s.substring(13, 15)));
        return nir;
    }

}
