package qu3;

import CTCILibrary.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class q3 {
    public q3() {

        int[] nodes_flattened = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<LinkedList<TreeNode>> linkListArr = new ArrayList<LinkedList<TreeNode>>();
        TreeNode root = AssortedMethods.createTreeFromArray(nodes_flattened);
        ArrayList<LinkedList<TreeNode>> list = createLevelLinkedList(root, linkListArr, 0);
        printResult(list);

    }

    public static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> linkListArr, int depth) {
//
        if(root == null)
            return null;

        LinkedList<TreeNode> head = null;
        if(linkListArr.size() == depth) {
            head = new LinkedList<TreeNode>();
            linkListArr.add(head);
        }
        else {
            head = linkListArr.get(depth);
        }

        head.add(root);

        createLevelLinkedList(root.left, linkListArr, depth + 1);
        createLevelLinkedList(root.right, linkListArr, depth + 1);

        return linkListArr;
    }

    public static void printResult(ArrayList<LinkedList<TreeNode>> result){
        int depth = 0;
        for(LinkedList<TreeNode> entry : result) {
            Iterator<TreeNode> i = entry.listIterator();
            System.out.print("Link list at depth " + depth + ":");
            while(i.hasNext()){
                System.out.print(" " + ((TreeNode)i.next()).data);
            }
            System.out.println();
            depth++;
        }
    }

}
