package web;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.EtudDaoImp;
import metier.Etudiant;
import metier.IEtudDao;
@WebServlet (name="MB",urlPatterns= {"/controleur"})
public class ControleurServlet extends HttpServlet {
private IEtudDao metier;
@Override
public void init() throws ServletException {
metier=new EtudDaoImp();
}
@Override
protected void doPost(HttpServletRequest request,
 HttpServletResponse response)
 throws ServletException, IOException {
	String mc=request.getParameter("motCle");
	EtudiantModele mod = new EtudiantModele();
	mod.setMotCle(mc);
	List<Etudiant> etuds = metier.EtudiantsParMC(mc);
	mod.setEtudiants(etuds);
	request.setAttribute("modele", mod);
	request.getRequestDispatcher("EtudiantsView.jsp").forward(request,response);
	}
	}

