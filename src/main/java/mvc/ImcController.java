package mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class ImcController extends HttpServlet {
	
	@Override
	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		//PrintWriter out = response.getWriter();
		//out.println("Teste");
		
		String temp;

		double altura = 0;
		temp = request.getParameter("altura");
		temp = temp == null ? "0" : temp;
		altura = Float.parseFloat(temp);

		double peso = 0;
		temp = request.getParameter("peso");
		temp = temp == null ? "0" : temp;
		peso = Float.parseFloat(temp);

		String sexo;
		sexo = request.getParameter("sexo");

		//Executa "regras de neg�cio".
		ImcModel criaImc = new ImcModel(peso, altura, sexo);
		String situacao = criaImc.situacao();
		
		//Passa a v�ri�vel para a p�gina JSP.
		request.setAttribute("situacao", situacao);

		//Chama p�gina JSP.
		request.getRequestDispatcher("mvc/ImcView.jsp").
			forward(request, response);
	}	
}