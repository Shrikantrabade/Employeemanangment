package com.Employee.Service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.Employee.Model.Employee;

public class ServiceImpl implements SeviceI {

	@Override
	public void CreateTabale() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","root");
		 
		String sql="create table salary(EmpID int Primary key, Name varchar(50) , Dept varchar(70),Salary int );";
		
		Statement st=con.createStatement();
		
		st.execute(sql);
		
		System.out.println("Create Table succesfully");
		
		con.close();
		st.close();
		
		
		
		
	}

	@Override
	public void InsertData() throws ClassNotFoundException, SQLException {
		Employee emp=new Employee();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","root");
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your ID ");
		int EmpID=sc.nextInt();
		System.out.println("Enter your Name");
		String Name=sc.next();
		System.out.println("Enter your Department");
		String Dept=sc.next();
		System.out.println("Enter your Salary");
		int Salary=sc.nextInt();
		
		String sql="insert into EmployeeM values(?,?,?,?)";
		
		CallableStatement ps=con.prepareCall(sql);
		
		  ps.setInt(1,EmpID);
		  ps.setString(2,Name);
		  ps.setNString(3, Dept);
		  ps.setInt(4, Salary);
		  
		  System.out.println("Data Inserted Succesfully");
		con.close();
		ps.close();
	  
		
	}

	@Override
	public void ShowedData() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","root");
		 
		String sql="select * from  EmployeeM";
		  
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt("ID")+rs.getString("Name")+rs.getString("Dept")+rs.getInt("Salary"));
			
	
	}
		st.close();
		rs.close();
		
	}

	@Override
	public void UpdateData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteById() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteAll() {
		// TODO Auto-generated method stub
		
	}
}