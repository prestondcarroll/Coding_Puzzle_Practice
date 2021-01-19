package q5;

import CTCILibrary.TreeNode;
import com.sun.source.tree.Tree;

public class q5 {

    public q5(){

        TreeNode root;
        boolean result;

        int[] array1 = {1, 2, 3, 4};
        root = TreeNode.createMinimalBST(array1);
        root.left.data = 2;
        root.print();
        result = checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println("result is: " + result);
//
//
//
        int[] array2 = {1, 2, 3, 4};
        root = TreeNode.createMinimalBST(array1);
        root.right.data = 2;
        root.print();
        result = checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println("result is: " + result);


//        int[] array = {Integer.MIN_VALUE, 3, 5, 6, 10, 13, 15, Integer.MAX_VALUE};
//        root= TreeNode.createMinimalBST(array);
//        root.left.data = 6; // "ruin" the BST property by changing one of the elements
//        root.print();
//        result = checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
//        System.out.println("result is: " + result);


    }


    boolean checkBST(TreeNode root, int min, int max){
        if(root == null){
            return true;
        }

        if((min != Integer.MIN_VALUE && root.data <= min) ||  (max != Integer.MAX_VALUE && root.data > max)){
            return false;
        }


        if(!checkBST(root.left, min, root.data) || !checkBST(root.right, root.data, max)) {
          return false;
        }

        return true;

    }


}
