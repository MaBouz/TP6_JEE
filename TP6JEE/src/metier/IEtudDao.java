package metier;

import java.util.List;

public interface IEtudDao {
	public Etudiant save(Etudiant p);
	public List<Etudiant> EtudiantsParMC(String mc);
	public Etudiant getEtudiant(Long id);
	public Etudiant updateEtudiant(Etudiant p);
	public void deleteEtudiant(Long id);
}
