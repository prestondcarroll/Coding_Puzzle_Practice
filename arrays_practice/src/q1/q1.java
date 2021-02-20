package q1;
import java.util.HashMap;

public class q1 {


    public q1(){

        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
//        String[] words = {"abcde"};
//        String worde = "abcde" ;
//
//        System.out.println(worde.substring(0,0+1));

        for (String word : words) {
            System.out.println(word + ": " + isUniqueChars(word));
        }

    }

    public boolean isUniqueChars(String word){

        HashMap<String, Integer> h = new HashMap<>();

        for(int i = 0; i < word.length();i++){
            if (h.containsKey(word.substring(i,i+1))){
                return false;
            }
            else{
                h.put(word.substring(i,i+1), 1);
            }
        }

        return true;

    }
}
