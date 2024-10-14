package GestioneOrologio;

public class Orologio1 {
	
	private int minuti;
	private int ora;
	
	
	public int getMinuti() {
		return minuti;
	}

	public int getOra() {
		return ora;
	}

	public void setMinuti(int min) {
		
		if(min<0) {
			System.out.println("minuti errati");
		}
		else {
			int minAtt = min + this.minuti;
			if(minAtt >= 60) {
				this.minuti = minAtt % 60;
				this.setOra(minAtt/60);
			}
			else {
				this.minuti = minAtt;
			}
		}
	}
	
	public void setOra(int ora) {
		
		if(ora<0) {
			System.out.println("Orario sbagliato");
		}
		else {
			int oraAtt = ora + this.ora;
			if(oraAtt >= 24) {
				this.ora = oraAtt % 24;
			}
			else {
				this.ora = oraAtt;
			}
		}
		
	}
	
	public String toString() {
	    return "Sono le ore " + this.ora + " e " + this.minuti + " minuti";
	}
}
