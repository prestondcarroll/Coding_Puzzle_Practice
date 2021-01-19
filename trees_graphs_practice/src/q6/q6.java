package q6;

import CTCILibrary.*;

public class q6 {

    public q6(){
        TreeNode root = new TreeNode(10);
        TreeNode result;

//        int[] array1 = {10,5,9,7};
//        root = TreeNode.createMinimalBST(array1);
//        root.insertInOrder(5);
//        root.insertInOrder(9);
//        root.insertInOrder(7);


        root.insertInOrder(11);
        root.insertInOrder(5);
        root.insertInOrder(4);


        root.print();

        result = findSucc(root.right);
        if(result != null){
            System.out.println("Result is " + result.data);
        }
        else{
            System.out.println("no in order successor");
        }

    }

    TreeNode findSucc(TreeNode node){

        //TreeNode result = node;
//        if (node.left == null && node.right == null){
//            return node;
//        }
//
//        if(node.right != null){
//            return findSucc(node.right);
//        }
//        else {
//            return findSucc(node.left);
//        }


        if(node == null){
            return null;
        }


        if(node.right != null){
            return leftMostChild(node.right);
        }
        else{
            TreeNode q = node;
            TreeNode x = q.parent;
            while (x!= null && x.left != q){
                q = x;
                x = x.parent;
            }

            return x;
        }



    }

    TreeNode leftMostChild(TreeNode node){
        if(node == null){
            return null;
        }
        while(node.left != null){
            node = node.left;
        }
        return node;
    }



}
