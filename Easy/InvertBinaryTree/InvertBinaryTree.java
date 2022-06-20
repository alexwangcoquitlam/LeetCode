package Easy.InvertBinaryTree;

public class InvertBinaryTree {
    // #226
    public static void main(String[] args){

    }

    public static TreeNode invertTree(TreeNode root){
        if(root == null){
            return root;
        }
        else{
            TreeNode temp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(temp);
        }
        return root;
    }
}
