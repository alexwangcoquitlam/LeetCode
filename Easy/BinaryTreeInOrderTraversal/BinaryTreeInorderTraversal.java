package Easy.BinaryTreeInOrderTraversal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args){
        // #94
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(1, left, null);
        TreeNode root = new TreeNode(3, null, right);
        List<Integer> result = inorderTraversal(root);
        System.out.println("break");
    }

    public static List<Integer> inorderTraversal(TreeNode root){
        if(root == null){
            return new ArrayList<Integer>();
        }
        if(root.left == null && root.right == null) {
            List<Integer> res = new ArrayList<Integer>();
            res.add(root.val);
            return res;
        }
        else{
            List<Integer> newList = new ArrayList<Integer>();
            if(root.left != null)
                newList.addAll(inorderTraversal(root.left));
            newList.add(root.val);
            if(root.right != null)
                newList.addAll(inorderTraversal(root.right));
            return newList;
        }
    }
}
