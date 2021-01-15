import CTCILibrary.TreeNode;

public class q2 {

    public q2() {

        int[] arr = {1,2,3,4,5,6};
        TreeNode completeTree = new TreeNode();
        completeTree = createMinimalBST(arr, 0, arr.length - 1);

    }


    public TreeNode createMinimalBST(int[] arr, int start, int end){

        if (end < start){
            return null;
        }


        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(arr[mid]);
        System.out.println(arr[mid]);

        node.left = createMinimalBST(arr, start, mid - 1);
        node.right = createMinimalBST(arr, mid + 1, end);


        return node;
    }

}