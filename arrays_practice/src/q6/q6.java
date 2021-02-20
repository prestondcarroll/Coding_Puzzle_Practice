package q6;

import java.util.ArrayList;

public class q6 {

    public q6(){


        String s1 = "aabcccccaaa";

        if(!s1.isEmpty()){
            String s2 = compress(s1);
            System.out.println(s2);
        }


    }

    String compress(String s){

        char old;
        char[] compressed = new char[s.length() * 2];
        int compressIdx = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            old = s.charAt(i);
            int charCount = 0;
            int arrIdx = i;
            while(arrIdx < s.length() && s.charAt(arrIdx) == old){
                charCount++;
                arrIdx++;
            }

            i = arrIdx - 1;

            compressed[compressIdx] = old;
            compressIdx++;
            compressed[compressIdx] = Character.forDigit(charCount, 10) ;
            compressIdx++;
        }

        String comp = charArrayToString(compressed);
        if(comp.length() > s.length()){
            return s;
        }
        else{
            return charArrayToString(compressed);
        }

    }

    public static String charArrayToString(char[] array) {
        StringBuilder buffer = new StringBuilder(array.length);
        for (char c : array) {
            if (c == 0) {
                break;
            }
            buffer.append(c);
        }
        return buffer.toString();
    }



}
