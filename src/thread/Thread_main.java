package thread;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		  Thread_run th=new Thread_run();
		  Thread_runnable th2=new Thread_runnable();
		  Thread_run[] m=new Thread_run[10];
		  Thread_runnable[] n=new Thread_runnable[10];
		  th.start();
		  th2.run();
		  for(int i=0;i<10;i++) {
			  m[i]=new Thread_run();
			  n[i]=new Thread_runnable();
			  m[i].start();
			  n[i].run();
		  }
		  
		  try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  for(int i=0;i < 10;i++) {
				System.out.println("mainから出力 : "+i);
			}
	}
}
