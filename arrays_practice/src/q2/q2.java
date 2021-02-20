package q2;

import java.util.Arrays;

public class q2 {


    public q2(){
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean anagram = permutation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + anagram);
        }

    }

    public boolean permutation(String word, String word2){
        char[] w1 = word.toCharArray();
        Arrays.sort(w1);


        char[] w2 = word2.toCharArray();
        Arrays.sort(w2);

        StringBuilder sb_w1 = new StringBuilder();
        StringBuilder sb_w2 = new StringBuilder();;
        for (char c : w1){
            sb_w1.append(c);
        }
        for (char c : w2){
            sb_w2.append(c);
        }

        if(sb_w1.toString().equals(sb_w2.toString())){
            return true;
        }
        else{
            return false;
        }

    }
}
