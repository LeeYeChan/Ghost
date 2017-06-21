import java.util.*;

public class Tree_main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Node Node_root = new Node(0);
		Node_root.setParent(null);
		
		
			
		while(true){
			System.out.println("<Choose one>");
			System.out.println("1. travel");
			System.out.println("2. child");
			System.out.println("3. search");
			System.out.println("4. delete");
			System.out.println("5. find and make child");
			System.out.println("6. exit");
			System.out.println();
			
			int choose = keyboard.nextInt();
			
			if(choose==1){
				System.out.print(Node_root.getData());
				Tree.travels(Node_root);
			}
			
			else if(choose == 2){
				System.out.println("input key:");
				int key = keyboard.nextInt();
				Node child = new Node(key);
				System.out.println("자식 생성할 부모노드를 선택하시오(root의 자식노드->0입력)");
				int parent = keyboard.nextInt();
				
				if(parent == 0){
					Tree.add(Node_root, child);
				}else{
					Tree.add(Tree.find(parent,Node_root ),child);
				}
			}else if(choose == 3){
				System.out.println("input key:");
				int key = keyboard.nextInt();
				if(Tree.Search(key, Node_root)==true){
					System.out.println("해당 키 값이 존재");
				}else
					System.out.println("해당 키 값이 존재하지 않습니다.");
			}else if(choose == 4){
				System.out.println("input delete key : ");
				int key = keyboard.nextInt();
				Tree.delete(key,Node_root);
			}else if(choose == 5){
				int key1, key2;
				System.out.println("찾을 노드와 그 노드에 만들 자식노드입력");
				key1 = keyboard.nextInt();
				key2 = keyboard.nextInt();
				Tree.F_S(key1, key2, Node_root);
			}else{
				System.out.println("종료되었습니다");
				break;
			}
		}
	}
}
