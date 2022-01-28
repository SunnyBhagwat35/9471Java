import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[0-9]{2,}\\w{10,}", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("VisitW31Schools");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}