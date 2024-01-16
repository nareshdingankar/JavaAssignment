package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String courseId = req.getParameter("courseId");
		String courseName = req.getParameter("courseName");
		String courseDetails = req.getParameter("courseDetails");
		String joiningDate = req.getParameter("joiningDate");
		String budget = req.getParameter("budget");
        String[] courses = req.getParameterValues("courses");
		
		 // Display the data on the next page
        out.println("<html><head><title>Registration Details</title></head><body>");
        out.println("<h2>Registration Details</h2>");
        out.println("<p><strong>Course ID:</strong> " + courseId + "</p>");
        out.println("<p><strong>Course Name:</strong> " + courseName + "</p>");
        out.println("<p><strong>Course Details:</strong> " + courseDetails + "</p>");
        out.println("<p><strong>Joining Date:</strong> " + joiningDate + "</p>");
        out.println("<p><strong>Budget:</strong> " + budget + "</p>");	

        if (courses != null && courses.length > 0) {
            out.println("<p><strong>Courses Selected:</strong> ");
            for (String course : courses) {
                out.println(course + " ");
            }
            out.println("</p>");
        }
	}

	
}
