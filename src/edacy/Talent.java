/**
 * 
 */
package edacy;

/**
 * @author ndia
 *
 */
public class Talent {
	private String nom;
	private String prenom;
	private int age;
	private String niveau;
	private String cours;

	public Talent(String nom, String prenom, int age, String niveau, String cours) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.niveau = niveau;
		this.cours = cours;
	}
	@Override
	public String toString() {
		return "Talent [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", niveau=" + niveau + ", cours=" + cours
				+ "]";
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public String getCours() {
		return cours;
	}

	public void setCours(String cours) {
		this.cours = cours;
	}


}
