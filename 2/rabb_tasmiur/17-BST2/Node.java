
public class Node {
	
	private int data;
	Node left, right;
	
	public Node (int data){
		this.data = data;
		left = null;
		right = null;
	}
	
	public void setLeft(Node left){
		this.left = left;
	}
	public void setRight(Node right){
		this.right = right;
	}
	public Node getLeft(){
		return this.left;
	}
	public Node getRight(){
		return this.right;
	}
	public void setData(int d){
		data = d;
	}
	public int getData(){
		return this.data;
	}
	public boolean equals(Node n){
		if(this.data ==(int) n.getData())
			return true;
		else
			return false;
	}
}



