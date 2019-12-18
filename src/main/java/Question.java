import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question {
    public static void main(String[] args) {
        List<String> a= new ArrayList(Arrays.asList(new String[] {"Tokyo", "Philadelphia", "Minsk", "LA", "NY", "Milan"}));
        List<String> b= new ArrayList(Arrays.asList(new String[] {"Tokyo", "Milan"}));

        for (String s: b) {
            if(a.contains(s)){
                a.remove(s);
            }

        }

        System.out.println(a);


    }

}
