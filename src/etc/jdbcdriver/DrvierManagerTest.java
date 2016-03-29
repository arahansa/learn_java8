package etc.jdbcdriver;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

import org.junit.Test;

public class DrvierManagerTest {

	@Test
	public void testName() throws Exception {
		System.out.println("드라이버 매니저");
		Enumeration<Driver> drivers = DriverManager.getDrivers();
		System.out.println("드라이버 사이즈 ? "+drivers.hasMoreElements());
		while(drivers.hasMoreElements()){
			System.out.println(drivers.nextElement().getClass().getName());
		}
	}
}
