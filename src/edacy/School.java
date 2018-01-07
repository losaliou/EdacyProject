package edacy;
//import java.util.Scanner;

import java.util.ArrayList;

public class School {
	//private Talent [] talents;
	ArrayList<Talent> talents = new ArrayList<Talent>();
	public static int nbrtalent;
	
	
	public School(ArrayList<Talent> talents) {
		super();
		this.talents = talents;
	}
	@Override
	public String toString() {
		return "School [talents=" + talents + "]";
	}
	public void addTalent(ArrayList<Talent> edacy, Talent t) {
			edacy.add(t);
			nbrtalent++;
	}
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		ArrayList<Talent> mytalents= new ArrayList<Talent>();
		
		School edacy = new School(mytalents);
		
			Talent t1 = new Talent("lo","saliou",24,"m2","java");
				System.out.println(t1);
		edacy.addTalent(mytalents,t1);
		
			TalentForeign t2 = new TalentForeign("ndiaye","fatou",24,"l2","java","gambie");
				System.out.println(t2);
		edacy.addTalent(mytalents,t2);
		
		System.out.println(edacy);
		
		System.out.println(nbrtalent);
		
			Talent t3 = new Talent("diop","daro",24,"l3","java");
		edacy.addTalent(mytalents,t3);
		
		System.out.println(edacy);
		
		System.out.println(nbrtalent);
		

	}
	


}
