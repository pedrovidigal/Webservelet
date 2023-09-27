package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ConcatenarDadosServlet")
public class ConcatenarDadosServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtém os parâmetros do formulário
        String nome = request.getParameter("nome");
        String estadoCivil = request.getParameter("estadoCivil");
        String faixaEtaria = request.getParameter("faixaEtaria");

        // Concatena os dados
        String dadosConcatenados = "Nome: " + nome + "<br>" +
                                   "Estado Civil: " + estadoCivil + "<br>" +
                                   "Faixa Etária: " + faixaEtaria;

        // Configura a resposta
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<html><head><title>Dados Concatenados</title></head><body>");
        response.getWriter().println("<h1>Dados Concatenados</h1>");
        response.getWriter().println("<p>" + dadosConcatenados + "</p>");
        response.getWriter().println("</body></html>");
    }
}
