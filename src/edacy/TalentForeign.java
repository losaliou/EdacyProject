package edacy;

public class TalentForeign extends Talent{

	private String pays;

	public TalentForeign(String nom, String prenom, int age, String niveau, String cours, String pays) {
		super(nom, prenom, age, niveau, cours);
		this.pays = pays;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	@Override
	public String toString() {
		return "TalentForeign [pays=" + pays + ", " + super.toString()+"]";
	}

	

}
