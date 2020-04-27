package webapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import appLayer.User;

@WebServlet(name = "login")
public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //  PrintWriter out=response.getWriter();
        //  out.print("login-name: "+request.getParameter("loginname")+" password"+request.getParameter("password"));
        User userObject =new User();
        String userName=request.getParameter("loginname");
        String password=request.getParameter("password");
        request.setAttribute("username",userName);
        request.setAttribute("password",password);
        if(userObject.isValidCredential(userName,password)){
            request.setAttribute("successMessage","You have Successfully Logged In!!!...");
            request.getRequestDispatcher("/welcome.jsp").forward(request,response);

        }
        else
        {
            request.setAttribute("errorMessage","Invalid UserName and password, Try Again");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        out.print("login-name: "+request.getParameter("loginname")+" password: "+request.getParameter("password"));

    }
}
