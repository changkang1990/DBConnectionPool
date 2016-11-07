import java.sql.Connection;

/**
 * @author Administrator
 *
 */
public class Thread1 extends Thread {

	public void run() {
		Connection conn = null;
		ConnectionPool connPool = ConnectionPool.getInstance();
		try {
			if (!connPool.hasConnections()) {
				connPool.createPool();
			}
			conn = connPool.getConnection();
			System.out.println("我是线程Thread1" + conn);
			Thread.sleep(600);
			//释放连接
			connPool.returnConnection(conn);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
