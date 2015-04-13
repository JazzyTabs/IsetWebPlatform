package com.thabang.iset.servlet;

import com.google.gson.Gson;
import com.thabang.iset.dto.transfer.RequestDTO;
import com.thabang.iset.dto.transfer.ResponseDTO;
import com.thabang.iset.util.DataUtil;
import com.thabang.iset.util.CoachUtil;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MokomaneMB
 */
@WebServlet(name = "TesterServlet", urlPatterns = {"/cs"})
public class TesterServlet extends HttpServlet {

    @EJB
    CoachUtil coachUtil;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");

        ResponseDTO res = new ResponseDTO();
        RequestDTO req = new RequestDTO();

        try {
            req = getRequest(request);
            switch (req.getRequestType()) {
                case RequestDTO.GETCOACH_BY_CLASS:
                    res = coachUtil.getCoachByClasss(req.getCoachMentorID());
                    break;
            }
        } catch (Exception e) {

        }

    }

    private RequestDTO getRequest(HttpServletRequest url) {
        String json = url.getParameter("JSON");

        Gson gson = new Gson();
        RequestDTO req = new RequestDTO();
        try {
            req = gson.fromJson(json, RequestDTO.class);
            if (req == null) {
            }

        } catch (Exception e) {

        }
        return req;
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
