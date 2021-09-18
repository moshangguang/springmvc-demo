package com.mvc.controller;

import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Demo2Controller implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        System.out.println(666);
        httpServletRequest.
                getRequestDispatcher("WEB-INF/views/demo2.jsp").
                forward(httpServletRequest, httpServletResponse);
    }
}
