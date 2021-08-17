package FlyAway;
import javax.servlet.http*;
import.
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xpath.internal.operations.String;
import com.sun.xml.internal.ws.api.config.management.policy.ManagementAssertion.Setting;

import java.sql.*;
import java.sql.SQLException;
import java.sql.Connection;
import java.io.IOException;
import java.io.InputStream;

public class Project2FlightInformation{
private String URL = "jdbc:mysql://localhost/;
private String User = "mysql123";
private String Pass = "MySql123";

private static final String sql ="INSERT INTO Flight_Details" values

public int Flight_Details (String airline, String price, String flight_no, String source_city, String departure_time, String arrival_time, String book_seats, String seat_availability, String travel_date, String class_seat ){

	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e1){
		e1.printStackTrace();
	}
	try (Connect connect = DriveManager)
	getConnect(url, user,password);
	Statement statement= connect.statement (sql){
		statement.setString (1, airline);
		statement.setString(2, price));
		statement.setString(3,flight_no);
		statement.setString(4, source_city);
		statement.setString(5, departure_time);
		statement.setString(6. arrival_time);
		statement.setString(7. book_seats);
		statement.setString(8, seat_availability);
		statement.setString(9, travel_date);
		statement.setString(10, class_seat);
	}
		
		catch (SQLException e){
			printSQLException (e);
		}
	
	private void printSQLException(SQLException e) {
	// TODO Auto-generated method stub
	if (e instanceof SQLException){
		e.printStackTrace(System.err);
		System.err.println("Error Code: "+((SQLException)e).getErrorCode());
	
	}
}
}
