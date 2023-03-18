import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {
        if(color == null) return false;
        Pattern hex = Pattern.compile("^#([A-Fa-f0-9]{3}){1,2}$");
        return Pattern.matches(hex.pattern(), color);
    }
}





