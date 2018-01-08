/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import controllers.CategoryController;
import controllers.AdController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mappers.JsonCategory;
import mappers.JsonAd;
import model.Category;
import model.Ad;

/**
 *
 * @author Konstantin
 */
@WebServlet(name = "GetAdById", urlPatterns = {"/GetAdById"})
public class GetAdById extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String ids = request.getParameter("id");
        int id = Integer.parseInt(ids);
        try (PrintWriter out = response.getWriter()) {
            AdController adController = new AdController();
            Ad ad = adController.getAdById(id);
            String adJson = JsonAd.toJSON(ad);
            out.println(adJson);
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
