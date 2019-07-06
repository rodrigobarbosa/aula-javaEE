

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeiroServlet
 */
@WebServlet("/primeiroServlet")
public class PrimeiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

//    /**
//     * Default constructor. 
//     */
//    public PrimeiroServlet() {
//        // TODO Auto-generated constructor stub
//    }

//	/**
//	 * @see Servlet#init(ServletConfig)
//	 */
//	public void init(ServletConfig config) throws ServletException {
//		// TODO Auto-generated method stub
//		System.out.println("Iniciando o Servlet");
//	}

//	/**
//	 * @see Servlet#destroy()
//	 */
//	public void destroy() {
//		// TODO Auto-generated method stub
//		System.out.println("Matando o Servlet");
//		super.destroy();
//	}

//	/**
//	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		System.out.println("Chamando o service");
//		doGet(request, response);
//	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
//		PrintWriter resposta = response.getWriter();
//		resposta.append("<html>");
//		resposta.append("<head>");
//		resposta.append("</head>");
//		resposta.append("<body>");
//		resposta.append("<p>BEM VINDO.</p>");
//		resposta.append("</body>");
//		resposta.append("</html>");

//		destroy();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);

//		PrintWriter resposta = response.getWriter();
//		resposta.append("<html>");
//		resposta.append("<head>");
//		resposta.append("</head>");
//		resposta.append("<body>");
//		resposta.append("<p>BEM VINDO.</p>");
//		resposta.append("</body>");
//		resposta.append("</html>");
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		if(login.equals("rbcc") && senha.equals("123")) {
			//BEM-VINDO
			RequestDispatcher rd = request.getRequestDispatcher("bemvindo.jsp");
			request.setAttribute("login", login);
//			response.sendRedirect("bemvindo.jsp");
			rd.forward(request, response);
			
		} else {
			//NÃO SEJA BEM-VINDO
			RequestDispatcher rd = request.getRequestDispatcher("sempermissao.jsp");
			request.setAttribute("login", login);
//			response.sendRedirect("sempermissao.jsp");
			rd.forward(request, response);
		}
		
		System.out.println(login);
		System.out.println(senha);

	}

}
