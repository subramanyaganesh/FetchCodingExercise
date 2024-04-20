import java.util.ArrayList;
import java.util.List;

public class Utils {

    static List<String> group1 = new ArrayList<>(List.of("0", "1", "2"));//List.of is immutable
    static List<String> group2 = new ArrayList<>(List.of("3", "4", "5"));
    static List<String> group3 = new ArrayList<>(List.of("6", "7", "8"));

    static List<String> weighingMade=new ArrayList<>();

    static  String answer="";
    final static String BASE_URL = "http://sdetchallenge.fetch.com/";
    //final static String BASE_URL = "https://formy-project.herokuapp.com/form/";
    final static String CHROME_DRIVER_LOCATION = "chromedriver";

}
