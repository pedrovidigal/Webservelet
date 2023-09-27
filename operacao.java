package web;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/operacao")
public class operacao extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
        int numero1 = Integer.parseInt(request.getParameter("numero1"));
        int numero2 = Integer.parseInt(request.getParameter("numero2"));

       
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = (double) numero1 / numero2;
        int resto = numero1 % numero2;

        
        request.setAttribute("numero1", numero1);
        request.setAttribute("numero2", numero2);
        request.setAttribute("soma", soma);
        request.setAttribute("subtracao", subtracao);
        request.setAttribute("multiplicacao", multiplicacao);
        request.setAttribute("divisao", divisao);
        request.setAttribute("resto", resto);
        
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}
