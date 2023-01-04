package task2;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pesel {

    public boolean IsIdNumber(String idNumber) {
        String id = Optional.ofNullable(idNumber).orElseThrow();
        Pattern pattern = Pattern.compile("\\b^\\d{11}\\b(?![-.+])");
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }
}
