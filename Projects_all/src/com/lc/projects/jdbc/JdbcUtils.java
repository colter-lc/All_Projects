package com.lc.projects.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.lc.projects.Constants;

public class JdbcUtils {
	
	public static Connection getConnection(){
		InputStream in = JdbcUtils.class.getClassLoader().getResourceAsStream(Constants.CONFIG);
		Properties properties = new Properties();
		try {
			properties.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String user = properties.getProperty(Constants.JDBC_USER).trim();
		String password = properties.getProperty(Constants.JDBC_PASSWORD).trim();
		String url = properties.getProperty(Constants.JDBC_URL).trim();
		String driverClass = properties.getProperty(Constants.JDBC_DRIVER_CLASS).trim();
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void release(ResultSet rs, Statement statement, Connection conn){
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(statement != null){
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}
	}
}
