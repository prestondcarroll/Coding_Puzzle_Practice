package q10;

import CTCILibrary.*;

public class q10 {

    public q10() {

        int[] array1 = {1, 2, 1, 3, 1, 1, 5};
        int[] array2 = {2, 3, 1};

        TreeNode t1 = AssortedMethods.createTreeFromArray(array1);
        TreeNode t2 = AssortedMethods.createTreeFromArray(array2);


        if (checkSubTree(t1, t2)){
            System.out.println("t2 is a subtree of t1");
        }
        else{
            System.out.println("t2 is not a subtree of t2");
        }



        int[] array3 = {1, 2, 3};
        TreeNode t3 = AssortedMethods.createTreeFromArray(array1);
        TreeNode t4 = AssortedMethods.createTreeFromArray(array3);


        if (checkSubTree(t3, t4)){
            System.out.println("t3 is a subtree of t4");
        }
        else{
            System.out.println("t3 is not a subtree of t4");
        }




    }

    public boolean checkSubTree(TreeNode t1, TreeNode t2){

        StringBuilder t1Str = new StringBuilder();
        StringBuilder t2Str = new StringBuilder();

        buildTreeStr(t1, t1Str);
        buildTreeStr(t2, t2Str);

        if(t1Str.toString().contains(t2Str.toString())){
            return true;
        }
        else{
            return false;
        }


    }

    void buildTreeStr(TreeNode node, StringBuilder sb){
        if(node == null){
            sb.append("X");
            return;
        }

        sb.append(node.data);
        buildTreeStr(node.left, sb);
        buildTreeStr(node.right, sb);


    }


}