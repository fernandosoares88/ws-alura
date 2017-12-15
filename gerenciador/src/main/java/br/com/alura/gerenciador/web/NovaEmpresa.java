package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;

@WebServlet(urlPatterns="/novaEmpresa")
public class NovaEmpresa extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4165129590738667259L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nome = req.getParameter("nome");
		Empresa empresa = new Empresa(nome);
		new EmpresaDAO().adiciona(empresa);
		
		req.getRequestDispatcher("/WEB-INF/paginas/novaEmpresa.jsp").forward(req, resp);
		
//		PrintWriter writer = resp.getWriter();
//		writer.println("<html>");
//		writer.println("<body>");
//		writer.println("Empresa " + nome + " foi adicionada com sucesso!");
//		writer.println("</body>");
//		writer.println("</html>");
	}

}
