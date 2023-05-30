package com.example.formulario_johan_varon.servlets;

import com.example.formulario_johan_varon.model.beans.Category;
import com.example.formulario_johan_varon.model.repository.CategoryRepositoryImpl;
import com.example.formulario_johan_varon.model.repository.Repository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("register-category")
public class CategoryRegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // collect all form data
        String category_name = request.getParameter("category_name");

        // fill it up in a Category bean
        Category category = new Category(category_name);

        // call Repository layer and save the category object to DB
        Repository<Category> repository = new CategoryRepositoryImpl();
        int rows = 0;
        try {
            rows = repository.saveObj(category);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // todo prepare an information message for category about success or failure of the operation
        // String infoMessage = null;
        if (rows == 0) {
            // infoMessage = "Ocurrió un error!";
            System.out.println("Ocurrió un error!");
        } else {}

        // todo write the message back to the page in client browser
    }
}