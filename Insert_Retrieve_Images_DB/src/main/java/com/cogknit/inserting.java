package com.cogknit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class inserting {
	public static void main(String[] args) throws SQLException {
		inserting imageTest = new inserting();
        imageTest.insertImage();
    }
 
    public Connection getConnection() {
        Connection connection = null;
 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://192.168.0.124:3306/training", "root", "cogknit");
        } catch (Exception e) {
        	e.printStackTrace();
            System.out.println("Error Occured While Getting the Connection: - " + e);
        }
        return connection;
    }
 
    public void insertImage() {
        Connection connection = null;
        PreparedStatement statement = null;
        FileInputStream inputStream = null;
 
        try {
            File image = new File("/home/interview/Desktop/cogknitlogo.png");
            inputStream = new FileInputStream(image);
 
            connection = getConnection();
            statement = connection.prepareStatement("insert into trn_imgs(img_title, img_data) " + "values(?,?)");
            statement.setString(1, "cogknit logo");
            statement.setBinaryStream(2, (InputStream) inputStream, (int)(image.length()));
 
            statement.executeUpdate();
 
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: - " + e);
        } catch (SQLException e) {
            System.out.println("SQLException: - " + e);
        } finally {
 
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                System.out.println("SQLException Finally: - " + e);
            }
 
        }
 
    }
 
}

