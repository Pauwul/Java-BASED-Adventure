package tema;

public class Cavaler implements Erou {
	String nume, artefact, scop;
	Cavaler(String nume,String artefact, String scop){
		this.nume=nume;
		this.artefact=artefact;
		this.scop=scop;
	}
	Cavaler(String nume){
		this.nume=nume;

	}

	public void updateHeader() {
		System.out.println("ai ales calaver");
		
	}

	@Override
	public void updateScop(String scop) {
		this.scop=scop;
		System.out.println(scop);
		
	}

	@Override
	public void updateArtefact(String artefact) {
		// TODO Auto-generated method stub
		
	}
	
}
