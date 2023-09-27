package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculadoraIdadeServlet")
public class CalculadoraIdadeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {   
        int anoNascimento = Integer.parseInt(request.getParameter("anoNascimento"));
        String fezAniversario = request.getParameter("fezAniversario");
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);       
        int idade = anoAtual - anoNascimento;
        if (fezAniversario.equals("nao")) {
            idade--;
        }
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Idade Atual</title></head><body>");
        out.println("<h1>Sua Idade Atual</h1>");
        out.println("<p>Ano de Nascimento: " + anoNascimento + "</p>");
        out.println("<p>Já fez aniversário este ano? " + fezAniversario + "</p>");
        out.println("<p>Idade Atual: " + idade + " anos</p>");
        out.println("</body></html>");
    }
}