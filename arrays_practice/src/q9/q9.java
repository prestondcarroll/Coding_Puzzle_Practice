package q9;

public class q9 {

    public q9(){

        String s1 = "erbottlewat";
        String s2 = "waterbottle";


        System.out.println(isRotation(s1,s2));

    }


    public boolean isRotation(String s1, String s2){

        //concatenate s2
        String s1s1 = s1 + s1;
        System.out.println(s1s1);

        if(isSubString(s2, s1s1)){
            return true;
        }
        else{
            return false;
        }

    }

    public boolean isSubString(String s1, String s2){

        char[] s1char = s1.toCharArray();
        char[] s2char = s2.toCharArray();

        for(int i = 0; i < s2.length(); i++){
            if(s2char[i] == s1char[0]){
                int j = 0;
                while((i + j < s2.length() - 1) && (j < s1.length() - 1) && s2char[i + j] == s1char[j]){
                    j++;
                }
                if(j == s1.length() - 1){
                    return true;
                }
            }
        }
        return false;
    }

}






























