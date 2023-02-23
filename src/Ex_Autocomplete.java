import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Ex_Autocomplete {
    public static void main(){
        List<String> keyW = new ArrayList<String>(Arrays.asList("Pandora","Pinterest","Paypal",
                "Pg&e","Project free tv","Priceline","Press democrat","Progressive","Project runway",
                "Proactive","Programming","Progeria","Progesterone","Progenex","Procurable","Processor",
                "Proud","Print","Prank","Bowl","Owl","River","Phone","Kayak","Stamps","Reprobe"));
        for (String s : keyW) {
            System.out.println(s);
        }
    }
}
