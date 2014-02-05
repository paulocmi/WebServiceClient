
import dbservices.AccessDatabase;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceRef;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulo
 */
@WebServiceClient
public class ClienteServlet extends HttpServlet{
    
    @WebServiceRef(wsdlLocation = "http://localhost:8080/WebServiceServer/accessDatabase?wsdl")
    AccessDatabase accessDatabase;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
        try {
            accessDatabase.consultInfo();
            
        } catch (Exception e) {
        }
        
        
    }
    
    
}