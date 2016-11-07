import java.sql.SQLException;

public class TestConnectionPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		Thread1 thread3 = new Thread1();
		Thread2 thread4 = new Thread2();
		Thread1 thread5 = new Thread1();
		Thread2 thread6 = new Thread2();
		Thread1 thread7 = new Thread1();
		Thread2 thread8 = new Thread2();
		Thread1 thread9 = new Thread1();
		Thread2 thread10 = new Thread2();
		Thread1 thread11 = new Thread1();
		Thread2 thread12 = new Thread2();
		
		thread1.start();
		thread2.run();
		thread3.start();
		thread4.run();
		thread5.start();
		thread6.run();
		thread7.start();
		thread8.run();
		thread9.start();
		thread10.run();
		thread11.start();
		thread12.run();
		
		try {
			ConnectionPool.getInstance().closeConnectionPool();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
