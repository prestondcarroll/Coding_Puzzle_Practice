package q4;

import CTCILibrary.TreeNode;

public class q4 {

    public q4(){

        int[] array = {0, 1, 2, 3, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);


        System.out.println("Is balanced? " + isBalanced(root));

        root.insertInOrder(4); // Add 4 to make it unbalanced

        System.out.println("Is balanced? " + isBalanced(root));



    }


    //heightArr is [int heightValue of current node, boolean isHeightBalanced]
    int getHeight(TreeNode root){
        if(root == null){
            return -1;
        }

        int LHeight = getHeight(root.left);
        if(LHeight == -2){
            return -2;
        }

        int RHeight = getHeight(root.right);
        if(RHeight == -2){
            return -2;
        }

        if((Math.abs(RHeight - LHeight)) > 1){
            return -2;
        }
        else{
            return Math.max(LHeight, RHeight) + 1;
        }

    }


    boolean isBalanced(TreeNode root){
        return getHeight(root) != -2;
    }

}
