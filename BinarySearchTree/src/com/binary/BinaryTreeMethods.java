/*
  file name:BinaryTreeMethods.java
  Created by:Dhiresh Bhoir
  Create Date:-17-10-2016
  Purpose:Methods for binary tree
*/
package com.binary;

public class BinaryTreeMethods {
	BinaryTreeNode root, node;
	int total = 0;

	public void insert(int value) {
		insert(this.root, value);
	}

	// inserting the data at perticular position
	public void insert(BinaryTreeNode current, int value) {
		node = new BinaryTreeNode(value);
		if (root == null) {
			root = node;
			total++;
			System.out.println("Root is: " + root.data);
		} else {
			// Checking for left position
			if (value < current.getData()) {
				if (current.getLeft() == null) {
					current.setLeft(node);
					total++;
					System.out.println("root node " + current.data);
					System.out.println("left value: " + current.getLeft().data);
				} else {
					current = current.getLeft();
					this.insert(current, value);
				}
			}

			// Checking for Right position
			else {
				if (current.getRight() == null) {
					current.setRight(node);
					total++;
					System.out.println("root node " + current.data);
					System.out.println("right value: " + current.getRight().data);
				} else {
					current = current.getRight();
					this.insert(current, value);
				}
			}

		}
	}// end of insert

	public void getTreeCount() {
		int num = total;
		System.out.println("Total Elements:" + total);
		long result = catalan(num);
		System.out.println("Total Combinatios Possible: " + result);
	}

	public static long catalan(int num) {
		int res = 0;
		if (num <= 1) {
			return 1;
		}
		for (int i = 0; i < num; i++) {
			res += catalan(i) * catalan(num - i - 1);
		}
		return res;
	}
}
