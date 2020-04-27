package webapp;

import appLayer.SignUp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "signup")
public class signup extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SignUp signUpObject=new SignUp();
        String userName=request.getParameter("loginname");
        String password=request.getParameter("password");
        String email=request.getParameter("email");
        long mobile= Long.parseLong(request.getParameter("mobile"));
        request.setAttribute("username",userName);
        request.setAttribute("password",password);
        request.setAttribute("email",email);
        request.setAttribute("mobile",mobile);
            if(signUpObject.signUpRegister(userName,password,email,mobile)) {
                request.setAttribute("successMessage", "You have Successfully Registered In!!!...");
                request.getRequestDispatcher("/welcome.jsp").forward(request, response);
            }
            else {
                request.setAttribute("errorMessage", "Invalid UserName and password, Try Again");
                request.getRequestDispatcher("/signup.jsp").forward(request, response);
            }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
