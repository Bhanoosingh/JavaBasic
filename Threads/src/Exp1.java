
public class Exp1 implements Runnable{

	public static void main(String[] args) {
		Exp1 ob=new Exp1();
		Thread t1=new Thread(ob);
		
		t1.start();

	}

	@Override
	public void run() {
		System.out.println("Hello World");
	}

	

}
