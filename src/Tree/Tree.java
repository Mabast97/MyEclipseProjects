package Tree;

public class Tree<T extends Comparable> {
	
	private TreeNode<T> root;
	
	public Tree()
	{
		root = null;
	}
	
	public boolean search1(T key)
	{
		if (root == null)
		{
			System.out.println("null");
		}
		else
		{
			return root.search(key);
		}
		
		return false;
		
	}
	
	public void insertNode(T insertValue)
	{
		if (root == null)
		{
			root = new TreeNode<T>(insertValue);
		}
		else
		{
			root.insert(insertValue);
		}
	}
	
	public void preorderTraversal()
	{
		preorderHelper(root);
	}
	
	private void preorderHelper(TreeNode<T> node)
	{
		if (node == null)
			return;
		
		System.out.print(node.data+" ");
		preorderHelper(node.leftNode);
		preorderHelper(node.rightNode);
	}
	
	public void inorderTraverse()
	{
		inorderHelper(root);
	}
	
	private void inorderHelper(TreeNode<T> node)
	{
		if(node == null)
			return;
		
		inorderHelper(node.leftNode);
		System.out.print(node.data+" ");
		inorderHelper(node.rightNode);
	}
	
	public void postorderTraverse()
	{
		postorderHelper(root);
	}
	
	private void postorderHelper(TreeNode<T> node)
	{
		if (node == null)
			return;

		postorderHelper(node.leftNode);
		postorderHelper(node.rightNode);
		System.out.print(node.data+" ");
		
	}
	
}
