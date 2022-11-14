package com.gl.binarysearchtreetoskewedtree;

//SkewedBinaryTree  class
public class Transactions {
	public Node node;
	static Node prevNode = null;
	public Node headNode = null;

	// ----------------------------------------------------------
	// BinaryToSkewed method
	public void BinaryToSkewed(Node root, int order) {
		// Base Case
		if (root == null) {
			return;
		}
		if (order > 0) {
			BinaryToSkewed(root.right, order);
		} else {
			BinaryToSkewed(root.left, order);
		}
		Node rightNode = root.right;
		Node leftNode = root.left;

		// Condition to check if the root Node
		// of the skewed tree is not defined
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		// recursive fn for the left / right subtree on the basis of the order required

		if (order > 0) {
			BinaryToSkewed(leftNode, order);
		} else {
			BinaryToSkewed(rightNode, order);
		}
	}

	// ----------------------------------------------------------
	// Function to traverse the right
	// skewed tree using recursion
	// rightSkewed method
	public void rightSkewed(Node root) {

		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		rightSkewed(root.right);
	}
}
