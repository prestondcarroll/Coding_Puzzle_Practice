package q11;


import java.util.Random;

public class TreeNode {

    public int data;
    public int size = 0;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(){

    }

    public TreeNode(int d){
        data = d;
        size = 1;
    }

    public TreeNode getRandomNode(){
        Random random = new Random();
        int randomInt = random.nextInt(size);
        int leftSize = left == null ? 0 : left.size;


        if(randomInt == size){
            return this;
        }
        else if(randomInt < leftSize){
            return left.getRandomNode();
        }
        else{
            return right.getRandomNode();
        }

    }


}
