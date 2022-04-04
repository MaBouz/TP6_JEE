package metier;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class EtudDaoImp implements IEtudDao{
		private EntityManager entityManager=JPAutil.getEntityManager("TP6_JEE");
		
		@Override
		public Etudiant save(Etudiant p) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(p);
		tx.commit();
		return p;
		}
		
		@Override
		public List<Etudiant> EtudiantsParMC(String mc) {
		List<Etudiant> prods = 
				 entityManager.createQuery("select p from Etudiant p where p.Nom =:mc")
				 .setParameter("mc", "%"+mc+"%")
				 .getResultList();
				 return prods;
				}
		
		@Override
				public Etudiant getEtudiant(Long id) {
				 return entityManager.find(Etudiant.class, id);
				}
		@Override
				public Etudiant updateEtudiant(Etudiant p) {
				EntityTransaction tx = entityManager.getTransaction();
				tx.begin();
				entityManager.merge(p);
				tx.commit();
				return p;
				}
				
		@Override
				public void deleteEtudiant(Long id) {
					Etudiant produit = entityManager.find(Etudiant.class, id);
				entityManager.getTransaction().begin();
				entityManager.remove(produit);
				entityManager.getTransaction().commit();
				}
}
