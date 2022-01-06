package web;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.CatalogueMetierImpl;
import metier.ICatalogueMetier;

public class ControleurServlet extends HttpServlet {
	private ICatalogueMetier metier;
	
	@Override
	public void init() throws ServletException {
		metier = new CatalogueMetierImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("VueProduit.jsp");
		forward(req, resp);
	}

	protected void doPost() {
	}
}
