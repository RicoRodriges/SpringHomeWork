package com.dms;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class ResultPageController extends HttpServlet {

    private final String PARAMETER_NAME = "value";
    private String current;
    private String prew;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession session = req.getSession(true);

        prew = current;
        current = req.getParameter(PARAMETER_NAME);

        req.setAttribute("prew", prew);
        req.setAttribute("current", current);
        req.setAttribute("last", session.getAttribute("current"));

        session.setAttribute("current", current);

        req.getRequestDispatcher("result.jsp").forward(req, resp);
    }
}
