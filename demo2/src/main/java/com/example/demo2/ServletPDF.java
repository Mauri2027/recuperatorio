package com.example.demo2;

import Models.PDF;
import Models.Page;
import javafx.scene.shape.MoveTo;

import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

import com.darwinsys.spdf.Page;
import com.darwinsys.spdf.Text;
import com.darwinsys.spdf.MoveTo;

@WebServlet("/ServletPDF")
public class ServletPDF extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        PrintWriter out = response.getWriter();
        response.setContentType("application/pdf");

        response.setHeader("Content-disposition","inline; filename='javatpoint.pdf'");

        PDF p = new PDF(out);
        Page p1 = new Page(p);
        p1.add(new MoveTo(p, 200, 700));
        p1.add(new Text(p, "www.javatpoint.com"));
        p1.add(new Text(p, "by Sonoo Jaiswal"));

        p.add(p1);
        p.setAuthor("Ian F. Darwin");

        p.writePDF();
    }
