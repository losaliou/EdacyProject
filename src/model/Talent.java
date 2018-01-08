package model;
// déclaration de la classe Talent
public class Talent {
	private String nom;
	private String prenom;
	private int age;
	private String niveau;
	private String cours;

// constructeur Talent
	public Talent(String nom, String prenom, int age, String niveau, String cours) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.niveau = niveau;
		this.cours = cours;
	}
	
	// recuperation du nom
	public String getNom() {
		return nom;
	}

	// recuperation du prenom
	public String getPrenom() {
		return prenom;
	}
	
	// recuperation de l'age
	public int getAge() {
		return age;
	}

	// recuperation du niveau
	public String getNiveau() {
		return niveau;
	}

	// recuperation du cours de spécialisation
	public String getCours() {
		return cours;
	}
	
	//print d'un Talent
	public String toString() {
		return "Le nom du talent est: " + nom + ", son prenom:" + prenom +
				", age:" + age + ", niveau: " + niveau + ", cours: " + cours;
	}

}
