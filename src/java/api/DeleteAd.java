/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;
import controllers.AdController;
import controllers.CategoryController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mappers.JsonAd;
import mappers.JsonCategory;
import model.Ad;
import model.Category;
/**
 *
 * @author Konstantin
 */
@WebServlet(name = "DeleteAd", urlPatterns = {"/DeleteAd"})
public class DeleteAd {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       String jsonObject = request.getParameter("json");
        
        try (PrintWriter out = response.getWriter()) 
        {
           Ad ad = JsonAd.fromJSON(jsonObject);
           AdController  adController = new AdController();
           int res=adController.deleteAd(ad);
           out.print(res);
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}