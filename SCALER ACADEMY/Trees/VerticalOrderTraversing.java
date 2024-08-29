import java.util.ArrayList;
import java.util.Hashmap;
import java.util.List;
import java.util.Map;
import java.util.LinkedList;

class VerticalOrderTraversing{
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int x){
			this.data = x;
			Node left = null;
			Node right = null;
		}
	}
	public void Traversing(){
		Map<Integer,List<Node>> hm =  new Hashmap<>();
		List<Integer> list = new ArrayList<>();

		Queue<<Node,Integer>> q = new LinkedList<>();

		q.add(root,0);

		while(q.size()>1){
			<Node,Integer> temp = q.front();

			Node current = temp.first;
			int level = temp.second;

			hm[level].add(current);

			q.add(root.left);
			level-1;

			q.remove(root.right);
			level+1;
		}

		int maxl = Math.max(maxl,level);
		int minl = Math.min(minl,level);

		for () {
			
		}
	}
}