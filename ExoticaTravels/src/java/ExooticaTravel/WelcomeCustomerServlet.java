/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExooticaTravel;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Toma
 */
@WebServlet(name = "WelcomeCustomerServlet", urlPatterns = {"/WelcomeCustomerServlet"})
public class WelcomeCustomerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Customer Page</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<table border='0' bgcolor='#000080' align='top' width='100%' style='height:100px'>");
            out.println("<tr>");
            out.println("<td bgcolor='#000080' align='center'>");
            out.println("<font style='font-family: 'Arial Rounded MT Bold', Gadget, sans-serif;' size='+4' color='#FFE4B5'>Exotica Travels</font>");
            out.println("</td>");
            out.println("<td bgcolor='#000080' align='left' width='180'>");
            out.println("<img src='Images/CompanyLogo.png' width='180' height='120' align='right'/>");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<td><font color='darkblue' size='+1'><a href='DomesticFlights'>Domestic Flights</a></td>");
            out.println("<td><font color='darkblue' size='+1'><a href='InternationalFlights'>International Flights</a></td>");
            out.println("<td><font color='darkblue' size='+1'><a href='Hotels'>Hotels</a></td>");
            out.println("<td><font color='darkblue' size='+1'><a href='CarRentals'>Car Rentals</a></td>");
            out.println("<td><font color='darkblue' size='+1'><a href='TourPackages'>Tour Packages</a></td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("<br>");
            out.println("<font color='darkblue' size='+2'>Welcome to the Exotica Travels Website!!");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
