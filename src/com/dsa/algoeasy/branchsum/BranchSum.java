package com.dsa.algoeasy.branchsum;

class Node {
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class BranchSum {
    Node root;

    boolean hasPathSum(Node node, int sum)
    {
        boolean ans = false;
        int subSum = sum - node.data;
        if(subSum == 0 && node.left == null && node.right == null)
            return(ans = true);
        if(node.left != null)

            // ans || hasPathSum... has no utility if the ans is false
            ans = ans || hasPathSum(node.left, subSum);

        if(node.right != null)

            // But if it is true then we can avoid calling hasPathSum
            // here as answer has already been found
            ans = ans || hasPathSum(node.right, subSum);
        return(ans);
    }

    public static void main(String[] args){

        int sum = 23;

        /* Constructed binary tree is
              10
             /  \
           8     2
          / \   /
         3   5 2
        */
        BranchSum tree = new BranchSum();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);

        if (tree.hasPathSum(tree.root, sum))
            System.out.println(
                    "There is a root to leaf path with sum "
                            + sum);
        else
            System.out.println(
                    "There is no root to leaf path with sum "
                            + sum);
    }
}

