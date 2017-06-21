import java.util.*;

public class Tree {

	public static void add(Node parent, Node child){
		child.setParent(parent);
		parent.arrayList.add(child);
		
	}
	
	public static void printArray(final ArrayList<Node> arrayList){
		for(int i=0; i < arrayList.size(); i++){
			System.out.print(arrayList.get(i).getData() + ", ");
			
		}
	}
	
	public static Node find(int parent, Node root){
		Node find = root;
		System.out.println(find.arrayList.size());
		for(int i=0; i < root.arrayList.size(); i++){
			if(root.arrayList.get(i).getData()==parent){
				System.out.println(root.arrayList.get(i).getData());
				return root.arrayList.get(i);
			}
			find = Tree.find(parent, root.arrayList.get(i));
			System.out.println(find.getData()+"자식 없어");
			System.out.println("i = > " + i);
			if(find.getData() != root.arrayList.get(i).getData())
				return find;
		}
		return root;
	}
	
	public static boolean Search(int key, Node root){
		boolean search = false;
		
		for(int i=0; i < root.arrayList.size(); i++){
			if(root.arrayList.get(i).getData()==key){
				System.out.println(root.arrayList.get(i).getData());
				return true;
			}else{
				search = Tree.Search(key, root.arrayList.get(i));
				if(search==true)
					return true;
				}
		}
		return search;
	}
	
	public static void travels(Node root){
		for(int i=0; i< root.arrayList.size(); i++){
			System.out.print(root.arrayList.get(i).getData());
			travels(root.arrayList.get(i));
	   }
	}
	
	public static void delete(int key, Node root){
		Node delete_node = Tree.find(key, root);
		System.out.println(delete_node.getData()+"@@@");
		if(delete_node.arrayList.size() == 0){
			Node del_parent = delete_node.getParent();
			del_parent.arrayList.remove(delete_node);
		}else{
			delete_node.setData(delete_node.arrayList.get(0).getData());
			delete_node.arrayList.remove(0);
		}
	}
	
	public static void F_S(int key1, int key2, Node root){
		Node Find = Tree.find(key1, root);
		Node Child = new Node(key2); 
		Tree.add(Find, Child);
	}
}
