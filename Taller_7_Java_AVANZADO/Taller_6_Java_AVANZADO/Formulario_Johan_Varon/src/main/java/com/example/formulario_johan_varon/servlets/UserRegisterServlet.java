package com.example.formulario_johan_varon.servlets;
import com.example.formulario_johan_varon.model.beans.User;
import com.example.formulario_johan_varon.model.repository.Repository;
import com.example.formulario_johan_varon.model.repository.UserRepositoryImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;



@WebServlet("/register-user")
public class UserRegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // collect all form data
        String user_firstname = request.getParameter("user_firstname");
        String user_lastname = request.getParameter("user_lastname");
        String user_email = request.getParameter("user_lastname");
        String user_password = request.getParameter("user_password");

        // fill it up in a User bean
        User user = new User(user_firstname, user_lastname, user_email, user_password);

        // call Repository layer and save the user object to DB
        Repository<User> repository = new UserRepositoryImpl();
        int rows = 0;
        try {
            rows = repository.saveObj(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // todo prepare an information message for user about success or failure of the operation
        // String infoMessage = null;
        if (rows == 0) {
            // infoMessage = "Ocurrió un error!";
            System.out.println("Ocurrió un error!");
        } else {}

        // todo write the message back to the page in client browser
    }
}
