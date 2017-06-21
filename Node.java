import java.util.ArrayList;

public class Node {
	private int key;
	private Node parent;
	ArrayList<Node> arrayList = new ArrayList<>();
	
	public Node(int key){
		this.key = key;
	}
	
	public int getData(){
		return key;
	}
	
	public void setData(int key){
		this.key = key;
	}
	
	public Node getParent(){
		return parent;
	}
	
	public void setParent(Node parent){
		this.parent = parent;
	}	
}
