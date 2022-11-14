package com.gl.bstdriver;

import com.gl.binarysearchtreetoskewedtree.Node;
import com.gl.binarysearchtreetoskewedtree.Transactions;

//Driver class
public class Main {
	public static void main(String[] args) {
		Transactions tree = new Transactions();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		int order = 0;// increasing order
		tree.BinaryToSkewed(tree.node, order);
		tree.rightSkewed(tree.headNode);
	}

}
