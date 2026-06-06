package TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    static class BinaryTree {

        static int idx = -1;

        public static TreeNode buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;

            }

            TreeNode newNode = new TreeNode(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

    }

    public static void levelOrderPrint(TreeNode root) {

        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {

            TreeNode cuTreeNode = queue.remove();

            if (cuTreeNode == null) {
                System.out.println();
                if (queue.isEmpty()) {
                    break;

                } else {
                    queue.add(null);
                }
            } else {
                System.out.print(cuTreeNode.val + " ");
                if (cuTreeNode.left != null) {
                    queue.add(cuTreeNode.left);

                }
                if (cuTreeNode.right != null) {
                    queue.add(cuTreeNode.right);

                }
            }

        }
    }

    public static List<Integer> inOrder(TreeNode node) {

        List<Integer> list = new ArrayList<>();
        if (node == null) {

            return list;
        }

        list.addAll(inOrder(node.left));
        list.add(node.val);

        list.addAll(inOrder(node.right));

        return list;
    }

    public static List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.add(root.val);
        list.addAll(preorderTraversal(root.left));
        list.addAll(preorderTraversal(root.right));
        return list;
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        list.addAll(postorderTraversal(root.left));
        list.addAll(postorderTraversal(root.right));
        list.add(root.val);
        return list;
    }

    public static void preorderTraversalPrint(TreeNode root) {

        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preorderTraversalPrint(root.left);
        preorderTraversalPrint(root.right);

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (!p.equals(q)) {
            return false;
        }
        return (isSameTree(p.left, q.left) && (isSameTree(p.right, q.right)));
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {

            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        queue.add(null);
        List<Integer> ll = new ArrayList<>();
        while (!queue.isEmpty()) {

            TreeNode cuTreeNode = queue.remove();

            if (cuTreeNode == null) {
                list.add(ll);
                ll = new ArrayList<>();
                if (queue.isEmpty()) {
                    break;

                }

                ll = new ArrayList<>();
                queue.add(null);

            } else {
                ll.add(cuTreeNode.val);
                if (cuTreeNode.left != null) {
                    queue.add(cuTreeNode.left);

                }
                if (cuTreeNode.right != null) {
                    queue.add(cuTreeNode.right);

                }
            }

        }

        return list;
    }

    public static int maxDepth(TreeNode root) {

        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

    }

    public static int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

   
    int diameter=0;
     public  int diameterOfBinaryTree(TreeNode root) {
        maxHeight(root);
       return diameter;
    }
    public  int maxHeight(TreeNode root) {

        if (root == null)
            return 0;

        int leftheight = maxHeight(root.left);
        int rightHeight = maxHeight(root.right);

        diameter=Math.max(diameter,leftheight+ rightHeight);

        return Math.max(leftheight, rightHeight)+1;

    }

    public static boolean isIdentical(TreeNode root , TreeNode subTree){

        if(root == null && subTree == null){
            return true;
        }else if (root == null || subTree == null||root.val != subTree.val ) {
            return false;
            
        }

        if (!isIdentical(root.left, subTree.left)) {
            return false;
        }

        if (!isIdentical(root.right, subTree.right)) {
            return false;
            
        }
        return true;
        
    }

     public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
       
        if(root == null){

            return false;
        }

        if(root.val == subRoot.val){

            if(isIdentical(root,subRoot)){

                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    static class Info {
    TreeNode node;
     int hd;
     
     public Info(TreeNode node , int hd){
        this.hd=hd;
        this.node=node;
     }
    }

    public static ArrayList<Integer> topView(TreeNode root) {
        // code here

        ArrayList<Integer> list = new ArrayList<>();

        Queue<Info> q = new LinkedList<>();
        Map<Integer,TreeNode> map = new HashMap<>();

        int min=0;
        int max = 0;

        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {

            Info current = q.remove();
            if(current == null){

                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{

                if(!map.containsKey(current.hd)){
                    map.put(current.hd, current.node);
                }
                if(current.node.left != null){
                    q.add(new Info(current.node.left, current.hd-1));
                    min=Math.min(min, current.hd-1);
                }
                if(current.node.right != null){
                    q.add(new Info(current.node.right, current.hd+1));
                    max=Math.max(max, current.hd+1);
                }
            }

            
        }

        for(int i=min;i<=max;i++){
            list.add(map.get(i).val);
        }

        return list;
        
    }

    public static int maxLevelSum(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int level = 1;
        int sum =0;
        q.add(root);
        q.add(null);
        map.put( level,root.val);

        while (!q.isEmpty()) {

            TreeNode curr = q.remove();

            if (curr == null) {
                map.put( level,sum);
                sum=0;

                if(q.isEmpty()){
                    break;
                }
                level++;
                q.add(null);
                
            }else{
                sum += curr.val;

                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            
        }

        int max=Integer.MIN_VALUE;
        int maxLevel=0;
        for(int i=1;i<= level;i++){
           if(max < map.get(i)){
            max=map.get(i);
            maxLevel=i;
           }
        }
        return maxLevel;

    }
    public static long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int level = 1;
        int sum =0;
        q.add(root);
        q.add(null);
        map.put( level,root.val);

        while (!q.isEmpty()) {

            TreeNode curr = q.remove();

            if (curr == null) {
                map.put( level,sum);
                sum=0;

                if(q.isEmpty()){
                    break;
                }
                level++;
                q.add(null);
                
            }else{
                sum += curr.val;

                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            
        }

       
        int arr[]= new int[level];
       
        for(int i=1;i<= level;i++){
          arr[i-1]=map.get(i);
        }
        Arrays.sort(arr);
        return arr[arr.length-k];
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        int nodes1[] = { 1, 2, 4, 8, -1, -1, -1, 5, -1, -1, 3, -1, 6, -1, 7, -1, -1 };

        BinaryTree tree = new BinaryTree();
        TreeNode node = tree.buildTree(nodes1);

        // System.out.println(isSameTree(node, node1));
        // List<List<Integer>> list = levelOrder(node);
        // System.out.println(list);
        //System.out.println(diameterOfBinaryTree(node));
        //System.out.println(topView(node));
        System.out.println(maxLevelSum(node));

    }
}
