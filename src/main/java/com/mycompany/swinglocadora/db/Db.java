package com.mycompany.swinglocadora.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Db {
    
    private static Connection conn = null;

	public static Connection getConnection() {
            if (conn == null) {
                try {               
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_locadora?useSSL=false", "root", "password");
                } catch (SQLException e) {
                    throw new DbException(e.getMessage());
                }
            }
            return conn;
	}
	
	public static void closeConnection() {
            if (conn != null) {
                try {
                    conn.close();
                } catch(SQLException e) {
                    throw new DbException(e.getMessage());
		}
            }
	}
	
	public static void closeStatement(Statement st) {
            if (st != null) {
		try {
                    st.close();
		} catch (SQLException e) {
                    throw new DbException(e.getMessage());
		}
            }
	}

	public static void closeResultSet(ResultSet rs) {
            if (rs != null) {
		try {
                    rs.close();
		} catch (SQLException e) {
                    throw new DbException(e.getMessage());
		}
            }
	}
    
}
