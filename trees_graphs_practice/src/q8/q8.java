
package q8;

import CTCILibrary.TreeNode;

public class q8 {

    public q8(){
        TreeNode root = new TreeNode(10);
        TreeNode result;

//        int[] array1 = {10,5,9,7};
//        root = TreeNode.createMinimalBST(array1);
//        root.insertInOrder(5);
//        root.insertInOrder(9);
//        root.insertInOrder(7);


        root.insertInOrder(15);
        root.insertInOrder(14);
        root.insertInOrder(17);
        root.insertInOrder(3);
        root.insertInOrder(2);
        root.insertInOrder(5);
        root.insertInOrder(4);
        root.insertInOrder(6);


        root.print();


        result = FCA(root, root.find(2) , root.find(4));

        //System.out.println("root data is: " + root.data);

        if(result == null){
            System.out.println("no common ancestor found");
        }
        else{
            System.out.println("common ancestor is " + result.data);
        }




    }

    TreeNode FCA(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return null;
        }
        if(root == p && root == q){
            return root;
        }

        TreeNode x = FCA(root.left, p ,q);
        if(x != null && x != p && x!= q){
            return x;
        }

        TreeNode y = FCA(root.right, p ,q);
        if(y != null && y != p && y!= q){
            return x;
        }


        if(x!= null && y!= null){
            return root;
        }
        else if(root == p || root == q){
            return root;
        }
        else{
            return (x == null) ? y: x;
        }


    }


}
