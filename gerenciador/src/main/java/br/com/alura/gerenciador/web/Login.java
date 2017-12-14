package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.Usuario;
import br.com.alura.gerenciador.dao.UsuarioDAO;

@WebServlet(urlPatterns = "/login")
public class Login extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8638354319336286115L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String senha = req.getParameter("senha");

		Usuario usuario = new UsuarioDAO().buscaPorEmailESenha(email, senha);

		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		if (usuario == null) {
			writer.println("Usuário e senha inválidos.");
		} else {
			
			HttpSession sessio = req.getSession();
			sessio.setAttribute("usuarioLogado", usuario);
			
			writer.println("Usuário " + email + " logado.");
		}

		writer.println("</body>");
		writer.println("</html>");

	}

}
