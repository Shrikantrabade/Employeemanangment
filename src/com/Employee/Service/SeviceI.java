package com.Employee.Service;

import java.sql.SQLException;

public interface SeviceI {
	
	public abstract void CreateTabale() throws ClassNotFoundException, SQLException;
	
	public void InsertData() throws ClassNotFoundException, SQLException;
	
	public abstract void ShowedData() throws ClassNotFoundException, SQLException;
	
	public void UpdateData();
	 
	void DeleteById();
	
	void DeleteAll();

}
