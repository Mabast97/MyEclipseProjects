package Tree;

public class TreeNode<T extends Comparable> {

	TreeNode<T> leftNode;
	//Tree<T> leftNode2;
	T data;
	TreeNode<T> rightNode;
	//Tree<T> rightNode2;
	
	
	public TreeNode(T nodeData)
	{
		data = nodeData;
		leftNode = rightNode = null;
	}
	
	public void insert(T insertValue)
	{		
		if (insertValue.compareTo(data) < 0)
		{
			if (leftNode == null)
				leftNode = new TreeNode<T>(insertValue);
			else
				leftNode.insert(insertValue);
		}
		else if (insertValue.compareTo(data) > 0)
		{
			if (rightNode == null)
				rightNode = new TreeNode<T>(insertValue);
			else
				rightNode.insert(insertValue);
		}
		
	} // insert
	
	public boolean search(T value)
	{
		if (value.compareTo(data) == 0)
			return true;
		
		if (value.compareTo(data) < 0)
		{
			if(leftNode == null)
				return false;
			
			if (leftNode.data == value)
				return true;
			else
				return leftNode.search(value);
				//leftNode.search(leftNode2, value);
		}
		else if (value.compareTo(data) > 0)
		{
			if(rightNode == null)
				return false;
			if (rightNode.data == value)
				return true;
			else
				return rightNode.search(value);
				//rightNode.search(rightNode2, value);
		}
		
		return false;
	}
	
}
