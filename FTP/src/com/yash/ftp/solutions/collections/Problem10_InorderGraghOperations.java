package com.yash.ftp.solutions.collections;
/*
 Algorithm for the given problem:

 Input given: in-order graph:

 Step 1: Recursively traverse the left subtree  
 Step 2: Now, visit the root  
 Step 3: Traverse the right subtree recursively 

 */
class Node{
	int data;
	Node left, right;
	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
public class Problem10_InorderGraghOperations {
    Node root;
    
    Problem10_InorderGraghOperations(){
    	root = null;
    }
    
    public static Node insert(Node root, int data)
    {
        if (root == null)
            return new Node(data);
        
        if (data < root.data)
            root.left = insert(root.left, data);
        
        if (data > root.data)
            root.right = insert(root.right, data);
    
        return root;
    }
    
    void printInOrder(Node node) {
    	if(node == null) {
    		return;
    	}
    	
    	printInOrder(node.left);
    	System.out.println(node.data);
    	printInOrder(node.right);
    }
    
	public static void main(String[] args) {
        Problem10_InorderGraghOperations b = new Problem10_InorderGraghOperations();
        int arr[] = { 10, 2, 12, 12, 2, 4, 4 };
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            b.root = insert(b.root,arr[i]);
        }
        b.printInOrder(b.root);
	}}  