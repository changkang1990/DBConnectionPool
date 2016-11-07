import java.sql.Connection;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Connection conn = null;
		ConnectionPool connPool = ConnectionPool.getInstance();
		try {
			if (!connPool.hasConnections()) {
				connPool.createPool();
			}
			conn = connPool.getConnection();
			System.out.println("我是线程Thread2" + conn);
			Thread.sleep(100);
			//释放连接
			connPool.returnConnection(conn);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
