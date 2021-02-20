package q4;

import java.util.HashMap;

public class q4 {

    public q4(){

//        String pali = "Rats live on no evil star";


//        String pali = "Tact Coa";
//        pali = pali.toLowerCase();
//        pali = pali.replaceAll(" ", "");
//
//        System.out.println(isPermutationOfPalindrome(pali));





        String[] strings = {"Rats live on no evil star",
                "A man, a plan, a canal, panama",
                "Lleve",
                "Tacotac",
                "asda"};
        for (String s : strings) {
            s = s.toLowerCase();
            s= s.replaceAll(" ", "");
            boolean a = isPermutationOfPalindrome(s);
            //boolean b = QuestionB.isPermutationOfPalindrome(s);
            //boolean c = QuestionC.isPermutationOfPalindrome(s);
            System.out.println(s);
            System.out.println("Result: " + a);

//            if (a == b && b == c) {
//                System.out.println("Agree: " + a);
//            } else {
//                System.out.println("Disagree: " + a + ", " + b + ", " + c);
//            }
//            System.out.println();
        }


    }

    private boolean isPermutationOfPalindrome(String pali) {
        HashMap<String, Integer> h = new HashMap<>();
        for(int i = 0; i < pali.length(); i++){
            String subStr = pali.substring(i, i+1);
            if(!(subStr.isBlank()));{
                if(!h.containsKey(subStr)){
                    h.put(subStr, 1);
                }
                else{
                    int newVal =  h.get(subStr);
                    h.put(subStr, newVal + 1);
                }
            }

        }



        //check for odds
        boolean validPerm;
       //
        int odds = 0;
        for(String key: h.keySet()){
            if(h.get(key) % 2 == 1){
                odds++;
            }
        }

        if(odds > 1){
            validPerm = false;
        }
        else{
            validPerm = true;
        }

        return validPerm;
    }


}
