package model;

//déclaration de la classe TalentForeign qui étend Talent
public class TalentForeign extends Talent{

	private String pays;

    //constructeur de TalentForeign
	public TalentForeign(String nom, String prenom, int age, String niveau, String cours, String pays) {
		//appel du constructeur Talent 
		super(nom, prenom, age, niveau, cours);
		this.pays = pays;
	}
    
	//recuperation du pays
	public String getPays() {
		return pays;
	}

	//print d'un talent étanger avec l'appellation de la méthode print de Talent
	public String toString() {
		return  super.toString()+ " son pays:" + pays;
	}
}
