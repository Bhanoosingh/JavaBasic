import java.util.PriorityQueue;
import java.util.Queue;

public class Exp6 {

	public static void main(String[] args) {
		Queue<Integer> obList=new PriorityQueue<>();
		
		obList.add(17);
		obList.add(7);
		obList.add(74);
		obList.add(71);
		
		System.out.println(obList);
		obList.remove();
		System.out.println(obList);
		

	}

}
