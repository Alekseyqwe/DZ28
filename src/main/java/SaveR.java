import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/save-request")
public class SaveR extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String message = req.getParameter("message");

        if (name.isEmpty() || email.isEmpty() || message.isEmpty()) {
            res.sendRedirect("save-request.jsp");
        } else {
            req.setAttribute("name", name);
            req.setAttribute("email", email);
            req.setAttribute("message", message);
            req.getRequestDispatcher("success.jsp").forward(req, res);
        }
    }
}
