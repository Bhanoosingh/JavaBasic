import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exp4 {

	public static void main(String[] args) {
		// Non Genric method
		List oblist = new ArrayList();

		oblist.add(7);
		oblist.add("Bhanoo");
		oblist.add('A');

		// Genric Method
		// List<Integer> intList=new ArrayList<>();
		List<Integer> intList = new LinkedList<>();

		intList.add(7);
		// intList.add("Bhanoo");

		System.out.println(oblist);

	}

}
