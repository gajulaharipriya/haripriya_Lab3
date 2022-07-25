package com.hari.treesum;

import java.util.*;

class FindSumPair {

	public Node insert(Node root,int key)
	{
		if (root == null)
			return new Node(key);
		if (key < root.nodedata) 
			root. leftNode = insert(root. leftNode, key);
		else
			root.rightNode = insert(root.rightNode, key);
		return root;

	}
	public boolean findpairUtil (Node root, int sum,HashSet<Integer> set)
	{
		if (root == null)
			return false;

		if (findpairUtil(root.leftNode, sum, set))
			return true;
		if (set.contains(sum - root.nodedata)) { 
			System.out.println("Pair is found (" 
					+(sum - root.nodedata) + ","
							+ root.nodedata + ")"); 
			return true;
			//set.add(root.nodeData);
		}
		else
			set.add(root.nodedata); 
		return findpairUtil(root.rightNode, sum, set);
	}
	public void findPairWithGivenSum (Node root, int sum)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		if (findpairUtil(root, sum, set))
			System.out.print ("Pairs do not exit" + "\n"); findpairUtil(root, sum, set);






	}		  
}