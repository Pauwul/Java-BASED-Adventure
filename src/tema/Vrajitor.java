package tema;

public class Vrajitor implements Erou {
	String nume, artefact, scop;
	
	Vrajitor(String nume, String artefact, String scop){
		this.nume=nume;
		this.artefact=artefact;
		this.scop=scop;
	}
	Vrajitor(String nume){
		this.nume=nume;

	}
	@Override
	public void updateHeader() {
		System.out.println("ai ales varjitor");
		
	}
	@Override
	public void updateScop(String scop) {
		this.scop=scop;
		System.out.println(scop);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateArtefact(String artefact) {
		// TODO Auto-generated method stub
		
	}

}
