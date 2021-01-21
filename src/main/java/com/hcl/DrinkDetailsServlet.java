package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DrinkDetailsServlet extends HttpServlet {
	
	GenericDAO<DrinkDTO> drinkDAO;
	

	public DrinkDetailsServlet() {
		drinkDAO = new DrinkDAOImpl();
	}
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<form action='' method='POST'>");
        out.println("<label>Enter Product (Drink) ID: <input type='text' name='drink-id'></input></label>");
        out.println("<input type='submit' value='Get Details'>");
        out.println("</form>");
	}
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		String drinkId = req.getParameter("drink-id");
        PrintWriter out = resp.getWriter();
        try {
        	DrinkDTO drinkDTO = drinkDAO.getById(Long.parseLong(drinkId));
        	
        	out.print("<style>\n"
            		+ "table, th, td {\n"
            		+ "  border: 1px solid black;\n"
            		+ "  border-collapse: collapse;\n"
            		+ "}\n"
            		+ "th, td {\n"
            		+ "  padding: 1rem;\n"
            		+ "}\n"
            		+ "</style>");
         
            if(drinkDTO == null) {
            	out.println("<h4>ID not found</h4>");
            } else {
            	out.println("<h3>Showing Drink Details Below: </h3><br />");
            	out.print("<table>");
            	out.print("<tr>");
            	out.print("<th>ID</th>");
            	out.print("<th>Name</th>");
            	out.print("<th>Good</th>");
            	out.print("</tr>");
            	out.print("<tr>");
            	out.print("<td>" + drinkDTO.getId() +"</td>");
            	out.print("<td>" + drinkDTO.getName() +"</td>");
            	out.print("<td>" + drinkDTO.isGood() +"</td>");
            	out.print("</tr>");
            	out.print("</table>");
            }
        	
        } catch(Exception e) {
        	out.println("<h4>Invalid ID entered: " + drinkId + "<h4>");
        }
       
	}
	
	
}
