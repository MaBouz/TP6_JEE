package metier;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Etudiant {
	   
		@Id
		private Long CIN;
		private String Nom;
		private String Prenom;

		public Etudiant() {
			super();
		}   
		public Long getID() {
			return this.CIN;
		}

		public void setID(Long ID) {
			this.CIN = ID;
		}   
		public String getNom() {
			return this.Nom;
		}

		public void setNom(String Nom) {
			this.Nom = Nom;
		}   
		public String getPrenom() {
			return this.Prenom;
		}

		public void setPrenom(String Prenom) {
			this.Prenom = Prenom;
		}
	   
}
