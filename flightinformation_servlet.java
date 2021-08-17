package FlyAway;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class flightinformation_servlet
 */
@WebServlet("/register")
public class flightinformation_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public flightinformation_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String airline=request.getParameter("airline");
		String price=request.getParameter("price");
		String flight_no=request.getParameter("flight_no");
		String source_city=request.getParameter("source_city");	
		String destination_city=request.getParameter("destination_city");
		String departure_time=request.getParameter("departure_time");
		String arrival_time=request.getParameter("arrival_time");
		String book_seats=request.getParameter("book_seats");
		String seat_availability=request.getParameter("seat_availability");
		String travel_date=request.getParameter("travel_date");
		String class_seat=request.getParameter("class_seat");
	
	FlyAway.flightinformation flightinformation = new flightinformation();
	
		flightinformation.setAirline(airline);
		flightinformation.setPrice(price);
		flightinformation.setFlight_no(flight_no);
		flightinformation.setSource_city(source_city);
		flightinformation.setDestination_city(destination_city);
		flightinformation.setDeparture_time(departure_time);
		flightinformation.setArrival_time(arrival_time);
		flightinformation.setBook_seats(book_seats);
		flightinformation.setSeat_availability(seat_availability);
		flightinformation.setTravel_date(travel_date);
		flightinformation.setClass_seat(class_seat);
		
		try{
		flightinformation.registerFlightInformation(flightinformation);
		}
		catch(FlightNotFoundException e){
			e.print();
			
		}
		response.sendReddirect("");
	
			}
}
}

	