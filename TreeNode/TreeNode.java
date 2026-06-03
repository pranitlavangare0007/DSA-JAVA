package TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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

    public static int maxLevelSum(TreeNode root) {
        int maxSum = Integer.MIN_VALUE;
        int level = 0;
        int ans=0;
        if (root == null) {

            return level;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        queue.add(null);
        level++;
        int sum = 0;
        while (!queue.isEmpty()) {

            TreeNode cuTreeNode = queue.remove();

            if (cuTreeNode == null) {
              
                if (sum > maxSum) {
                   
                   maxSum=sum;
                   ans=level;
                }

                if (queue.isEmpty()) {
                    break;

                }
                level++;
                sum = 0;
                queue.add(null);

            } else {
                sum += cuTreeNode.val;
                if (cuTreeNode.left != null) {
                    queue.add(cuTreeNode.left);

                }
                if (cuTreeNode.right != null) {
                    queue.add(cuTreeNode.right);

                }
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        int nodes1[] = { 1, 2, 4, 8, -1, -1, -1, 5, -1, -1, 3, -1, 6, -1, 7, -1, -1 };

        BinaryTree tree = new BinaryTree();
        TreeNode node = tree.buildTree(nodes1);

        // System.out.println(isSameTree(node, node1));
        // List<List<Integer>> list = levelOrder(node);
        // System.out.println(list);
        System.out.println(maxLevelSum(node));

    }
}
