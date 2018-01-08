package model;

import java.util.ArrayList;

//declaration de la classe School
public class School {
	//delacaration du tableau Talent
	ArrayList<Talent> talents = new ArrayList<Talent>();
	public static int nbrtalent;
	
	//constructeur de la classe School
	public School(ArrayList<Talent> talents) {
		super();
		this.talents = talents;
	}
	
	//print de la classe School
	public String toString() {
		return "Les talents du School sont :" + talents + " le nombre de talent est:"+nbrtalent;
	}
	
	//ajout d'un talent dans School
	public void addTalent(ArrayList<Talent> edacy, Talent t) {
			edacy.add(t);
			nbrtalent++;
	}
}
