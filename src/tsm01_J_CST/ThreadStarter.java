package tsm01_J_CST;

final class ThreadStarter implements Runnable { 
	public void startThread() {
		Thread thread = new Thread(this);
		thread.start();
	}
	
	@Override 
	public void run() { // ...
	} 
	
	public static void main(String[] args) { 
		for (int i = 0; i < 2; i++) {
			new Thread(new ThreadStarter()).start(); 
			}
	}
}