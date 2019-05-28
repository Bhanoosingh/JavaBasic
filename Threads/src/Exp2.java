public class Exp2 {

	public static void main(String[] args)throws Exception {
		Exp3 ob=new Exp3();
		
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					ob.fun1();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					ob.fun2();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
			}
			
		});

		t1.start();
		t2.start();
	}

}
