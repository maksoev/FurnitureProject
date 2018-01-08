/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;
import controllers.CategoryController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mappers.JsonCategory;
import model.Category;
/**
 *
 * @author Konstantin
 */
@WebServlet(name = "UpdateCategory", urlPatterns = {"/UpdateCategory"})
public class UpdateCategory {
    

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       String jsonObject = request.getParameter("json");
        
        try (PrintWriter out = response.getWriter()) 
        {
           Category category = JsonCategory.fromJSON(jsonObject);
           CategoryController  categoryController = new CategoryController();
           int res=categoryController.updateCategory(category);
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
