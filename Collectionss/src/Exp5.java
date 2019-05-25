import java.util.ArrayDeque;
import java.util.Deque;

public class Exp5 {

	public static void main(String[] args) {
		Deque<Integer> obList=new ArrayDeque<>();
		
		//Stack
		
		  obList.push(7); 
		  obList.push(17); 
		  obList.push(71); 
		  obList.push(74);
		 
		
		//De-Queue
		obList.add(7);
		obList.add(17);
		obList.add(71);
		obList.add(74);
		
		System.out.println(obList);
		obList.removeLast();
		System.out.println(obList);
	

	}

}
