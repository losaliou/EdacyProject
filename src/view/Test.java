package view;

import java.util.ArrayList;

import model.School;
import model.Talent;
import model.TalentForeign;

//déclaration de la classe Test
public class Test {
	
	public static void main(String[] args) {
		//déclaration du tableau de type de Talent
		ArrayList<Talent> mytalents= new ArrayList<Talent>();
		//objet School qui prend en paramétre le tableau mytalents
		School edacy = new School(mytalents);
			//objet Talent
			Talent t1 = new Talent("lo","saliou",24,"m2","java");
				System.out.println(t1);
				//add d'un talent dans School 
		edacy.addTalent(mytalents,t1);
			//ojbet TalentForeign
			TalentForeign t2 = new TalentForeign("ndiaye","fatou",24,"l2","java","gambie");
				System.out.println(t2);
		edacy.addTalent(mytalents,t2);
		
		System.out.println(edacy);
		
			Talent t3 = new Talent("diop","daro",24,"l3","java");
		edacy.addTalent(mytalents,t3);
		
		System.out.println(edacy);
		
	}

}
