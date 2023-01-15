package tema;

public class Arcas implements Erou {
	String nume, artefact, scop;
	
	Arcas(String nume, String artefact, String scop){
		this.nume=nume;
		this.artefact=artefact;
		this.scop=scop;
	}
	Arcas(String nume){
		this.nume=nume;
	}
	@Override
	public void updateHeader() {
		System.out.println("ai ales arcas");
		
	}
	@Override
	public void updateScop(String sc) {
		scop=sc;
		System.out.println(scop);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateArtefact(String artefact) {
		// TODO Auto-generated method stub
		
	}

}
