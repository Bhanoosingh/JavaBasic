import java.util.Scanner;

public class Exp3 {

	public void fun1() throws InterruptedException {
		synchronized (this) {
			System.out.println("Thread 1 is on wait");

			wait();
			System.out.println("Resume");
		}
	}

	public void fun2() throws InterruptedException {
		Thread.sleep(2000);
		Scanner sc = new Scanner(System.in);
		synchronized (this) {
			System.out.println("Thread 2 is working and wating for input.");
			sc.nextLine();
			System.out.println("Wait over key pressed");
			notify();
		}
	}

}
