package sef.module17.activity;
//Needs to be completed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeJDBC {

	public static void main(String arg[]) {
		
		Connection.con = createConnection();
		System.out.println(con);
		
		Employee e1 = new Employee();
		
		e1.setId(1);
		e1.setFirstName("John");
		e1.setLastName("Dee");
		e1.setSalary(300);
		
		 insertEmployee(e1);
		
	}
	
	
	public static Connection createConnection()
	{
		Connection con=null;
		String url = "jdbc:mysql://localhost/activity";
		String user = "root";
		String pass = "robertpass";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public Employee findEmployeeById(String id)
	{
		Connection con = createConnection();
		Employee emp=null;
		try {
		// 1 - Create a PreparedStatement with a query
		PreparedStatement pStmt = con.prepareStatement("select * from employee where id = ?");
		// 2 - Search for the given id
		pStmt.setString(1, id);
		// 3 - Execute this query
		ResultSet rs = pStmt.executeQuery();	
		// 4 - If resultset is not null, then initialize emp object with data 
		if(rs.next())
		{
			emp = new Employee();
			emp.setId(rs.getInt(1));
			emp.setFirstName(rs.getString(2));
			emp.setLastName(rs.getString(3));
			emp.setSalary(Integer.parseInt(rs.getString(4)));
		}
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp;
	}

	public ArrayList<Employee> findEmployeesByName(String name)
	{
		Connection con = createConnection();
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		try {
		// 1 - Create a PreparedStatement with a query
		PreparedStatement pStmt = con.prepareStatement("select * from employee where name = ?");
		// 2 - Search for the given id (YOU MEAN NAME, YES?)
		pStmt.setString(1, name);
		// 3 - Execute this query
		ResultSet rs = pStmt.executeQuery();
		// 4 - While there are some records, continue 
		if(rs.next())
		{
			
		}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	public ArrayList<Employee> findEmployeesBySalary(int salary)
	{
		Connection con = createConnection();
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		try {
		// 1 - Create a PreparedStatement with a query
		PreparedStatement pStmt = con.prepareStatement("select * from employee where salary = ?");
		// 2 - Search for the given salary
		pStmt.setInt(1, salary);
		// 3 - Execute this query
		ResultSet rs = pStmt.executeQuery();
		// 4 - While there are records, continue 
		if(rs.next())
		{
			
		}
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	public static void insertEmployee(Employee emp)
	{
		Connection con = createConnection();
		//1 - Create a PreparedStatement with a query "insert into employee values(?,?,?,?)" 
		try {
		PreparedStatement pStmt = con.prepareStatement("insert into employee values (?,?,?,?)");
		con.setAutoCommit(false);
		//	Substitute the ? now.
		pStmt.setInt(1, emp.getId());
		pStmt.setString(2, emp.getFirstName());
		pStmt.setString(3, emp.getLastName());
		pStmt.setInt(4, emp.getSalary());
		//2 - Execute this query using executeUpdate()
		int rows = pStmt.executeUpdate();
		System.out.println(rows + " row(s) added!");
		con.commit();
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
