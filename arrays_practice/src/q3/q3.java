package q3;

public class q3 {

    public q3(){

        String str = "Mr John Smith    ";
        char[] arr = str.toCharArray();
        int trueLength = findLastCharacter(arr) + 1;
        replaceSpaces(arr, trueLength);
       System.out.println("\"" + charArrayToString(arr) + "\"");


    }

    private int findLastCharacter(char[] arr) {
        int idx = arr.length;
        while(arr[idx - 1] == ' '){
            idx--;
        }

        System.out.println(arr[idx-1]);
        return idx-1;

    }

    public void replaceSpaces(char[] arr, int trueLength){
        int endIdx = arr.length - 1;
        for(int idx = trueLength - 1; idx >= 0; idx--){
            if(arr[idx] == ' '){
                arr[endIdx] = '0';
                endIdx--;
                arr[endIdx] = '2';
                endIdx--;
                arr[endIdx] = '%';
                endIdx--;
            }
            else{
                arr[endIdx] = arr[idx];
                endIdx--;
            }
            System.out.println(charArrayToString(arr));
        }
    }

//    public void putString(char[] arr, int idx){
//        arr[idx] = '0';
//        arr[idx - 1] = '2';
//        arr[idx - 2] = '%';
//
//    }

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
