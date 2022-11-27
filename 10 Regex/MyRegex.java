import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {

    public static void main(String[] args) {

        Pattern p = Pattern.compile("([01][0-9]|2[0-3]):([0-5][0-9])");
        // Matcher m = p.matcher("23:00");
        // System.out.println(m.matches());

        // for using once
        // boolean f = "23:00".matches("([01][0-9]|2[0-3]):([0-5][0-9])");
        // System.out.println(f);

        // find-group
        Pattern p2 = Pattern.compile(
                "(?<hours>[01][0-9]|2[0-3]):(?<minutes>[0-5][0-9])"
        );
        String txt = "I go to sleep at 03:33. And wake up at 08:30";
        Matcher m2 = p2.matcher(txt);
        while (m2.find()) {
            System.out.println(m2.group());
            // System.out.println("hours: " + m2.group(1));
            // System.out.println("minutes: " + m2.group(2));
            System.out.println("hours: " + m2.group("hours"));
            System.out.println("minutes: " + m2.group("minutes"));
        }

    }

}
