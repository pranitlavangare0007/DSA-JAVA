package TreeNode;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
     TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
      }
       static class BinaryTree{

        static int idx=-1;
        public static TreeNode buildTree(int nodes[]){
            idx++;
            if (nodes[idx] == -1) {
                return null;
                
            }

            TreeNode newNode = new TreeNode(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
      
    }

    public static List<Integer> inOrder(TreeNode node){

        List<Integer> list = new ArrayList<>();
        if(node == null){
           
            return list ;
        }
       
        list.addAll(inOrder(node.left));
        list.add(node.val);
        
        list.addAll(inOrder(node.right));

        return list;
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        list.add(root.val);
        list.addAll(preorderTraversal(root.left));
        list.addAll(preorderTraversal(root.right));
        return list;
    }

     public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
       
        list.addAll(postorderTraversal(root.left));
        list.addAll(postorderTraversal(root.right));
         list.add(root.val);
        return list;
    }
     public static void preorderTraversalPrint(TreeNode root) {
        
       
        if(root == null){
            return ;
        }
      System.out.print( root.val + " ");
       preorderTraversalPrint(root.left);
      preorderTraversalPrint(root.right);
       
    }
   

      public static void main(String[] args) {
        int nodes[]={1, -1, 2, 3, -1, -1, -1};
        
       BinaryTree tree = new BinaryTree();
       TreeNode node =tree.buildTree(nodes);
         
       preorderTraversalPrint(node);
        
      }
  }
