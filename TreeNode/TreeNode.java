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

    public static List<Integer> preOrder(TreeNode node){

        List<Integer> list = new ArrayList<>();
        if(node == null){
           
            return list ;
        }
       
        list.addAll(preOrder(node.left));
        list.add(node.val);
        
        list.addAll(preOrder(node.right));

        return list;
    }

      public static void main(String[] args) {
        int nodes[]={1, -1, 2, 3, -1, -1, -1};
        
       BinaryTree tree = new BinaryTree();
       TreeNode node =tree.buildTree(nodes);
         List<Integer> list = preOrder(node);
         System.out.println(list);
        
      }
  }
