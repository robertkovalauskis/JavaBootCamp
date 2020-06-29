package sef.module17.activity;
//Needs to be completed
import java.sql.Connection;
import java.util.ArrayList;

import junit.framework.TestCase;

public class EmployeeJDBCTest extends TestCase {

	EmployeeJDBC emp;
	
	protected void setUp() throws Exception {
	//setUp() is used to initialize member data which would be used by all/most of its methods
		emp = new EmployeeJDBC();
	}

	public void testCreateConnection() {
		Connection con = emp.createConnection();
		assertNotNull(con);
		
	}

	public void testFindEmployeeById_MatchFound() {
		//complete the code here
		Employee e = emp.findEmployeeById("1");
		assertEquals("John", e.getFirstName());
		assertEquals("Doe", e.getLastName());
		assertEquals(2000, e.getSalary());
	}

	public void testFindEmployeeById_NoMatchFound() {
		//complete the code here
		Employee e1 = emp.findEmployeeById("99");
		assertNull(e1);
	}
	
	
	public void testFindEmployeeByName_MatchFound() {
		//complete the code here
		ArrayList<Employee> e1 = emp.findEmployeesByName("John");
		//assertEquals("1", e1.getId());
		//assertEquals("Doe", e1.getLastName());
		//assertEquals(2000, e1.getSalary());
	}
	
	public void testFindEmployeeByName_NoMatchFound() {
		//complete the code here
		ArrayList<Employee> e1 = emp.findEmployeesByName("Robert");
		assertNull(e1);
	}

	public void testFindEmployeeBySalary_MatchFound() {
		//complete the code here
		ArrayList<Employee> e1 = emp.findEmployeesBySalary(100);
	}

	public void testFindEmployeeBySalary_NoMatchFound() {
		//complete the code here
		ArrayList<Employee> e1 = emp.findEmployeesBySalary(99999);
		assertNull(e1);
	}
	
	public void testInsertEmployee(){
		//complete the code here
		insertEmployee(e1);
	}
}
