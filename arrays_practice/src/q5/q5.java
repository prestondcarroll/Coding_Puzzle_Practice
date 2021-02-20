package q5;

import java.util.HashMap;

public class q5 {

    public q5(){
        String s1 = "pale";
        String s2 = "pale";
        if(s1.length() > s2.length()){
            System.out.println(oneAway(s1, s2));
        }
        else{
            System.out.println(oneAway(s2, s1));
        }

        //System.out.println(oneAway("pale", "pales"));


    }

    private boolean oneAway(String s1, String s2) {
        //s1 hashmap
        HashMap<String, Integer> h = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            String subStr = s1.substring(i, i + 1);
            if (!h.containsKey(subStr)) {
                h.put(subStr, 1);
            } else {
                int newVal = h.get(subStr);
                h.put(subStr, newVal + 1);
            }
        }


        //s2 hashmap
        HashMap<String, Integer> h2 = new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            String subStr = s2.substring(i, i + 1);
            if (!h2.containsKey(subStr)) {
                h2.put(subStr, 1);
            } else {
                int newVal = h2.get(subStr);
                h2.put(subStr, newVal + 1);
            }
        }


        boolean oneAway;
        int diff = 0;


        for(String key: h.keySet()){
            if(!h.containsKey(key)){
                diff++;
            }
            else if(!h2.containsKey(key)){
                diff++;
            }
            else if(h.get(key) != h2.get(key)){
                diff++;
            }
        }

        if(diff == 1 || diff == 0){
            oneAway = true;
        }
        else{
            oneAway = false;
        }


        return oneAway;

    }



}
