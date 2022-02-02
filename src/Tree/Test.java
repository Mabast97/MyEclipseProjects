package Tree;

import java.awt.List;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		
		
		Optional<Integer> data = Optional.ofNullable(null);
		
		System.out.println("Optional: " + data.orElse(1000));
		
		Tree<Integer> tree = new Tree<Integer>();
		
		
		tree.insertNode(10);
		tree.insertNode(9);
		tree.insertNode(20);
		tree.insertNode(8);
		tree.insertNode(6);
		tree.insertNode(5);
		tree.insertNode(3);
		
		System.out.printf("Preorder traversal%n");
		tree.inorderTraverse();
		
		System.out.println(tree.search1(6));
		
		
		/*
		SecureRandom randomNumber = new SecureRandom();
		
		System.out.println("Inserting the following values: ");
		
		// insert 10 random integers from 0-99 in tree
		for (int i = 1; i <= 10; i++)
		{
		int value = randomNumber.nextInt(100);
		System.out.printf("%d ", value);
		tree.insertNode(value);
		}
		
		System.out.printf("%n%nPreorder traversal%n");
		tree.preorderTraversal();
		
		System.out.printf("%n%nInorder traversal%n");
		tree.inorderTraverse();
		
		System.out.printf("%n%nPostorder traversal%n");
		tree.inorderTraverse();
		System.out.println();
		
		 */
	}

}



