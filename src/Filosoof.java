
public class Filosoof implements Runnable {
	private int filosoof;
	private Vork links;
	private Vork rechts;
	private int aantalKeerGegeten;
	
	public Filosoof(int filosoof, Vork links, Vork rechts) {
		this.filosoof = filosoof;
		this.links = links;
		this.rechts = rechts;
		aantalKeerGegeten = 0;
		
		System.out.println("Filosoof " + filosoof + " krijgt vork " + links.getVork());
		System.out.println("Filosoof " + filosoof + " krijgt vork " + rechts.getVork());
	}
	
	public void run () {
		while(true) {
			boolean heeftVork;
			
			// Neem linkervork
			System.out.println("Filosoof " + filosoof + " wacht op vork " + links.getVork());
			do {
				heeftVork = links.neemVork(filosoof);
			} while(!heeftVork);
			System.out.println("Filosoof " + filosoof + " neemt vork " + links.getVork());
			
			// Neem rechtervork
			System.out.println("Filosoof " + filosoof + " wacht op vork " + rechts.getVork());
			do {
				heeftVork = rechts.neemVork(filosoof);
			} while(!heeftVork);
			System.out.println("Filosoof " + filosoof + " neemt vork " + rechts.getVork());
			
			// Eet
			System.out.println("Filosoof " + filosoof + " eet");
			aantalKeerGegeten++;
			System.out.println("voor de " + aantalKeerGegeten + " keer");
			
			// Leg vorken terug
			System.out.println("Filosoof " + filosoof + " legt vorken terug");
			links.legTerug();
			rechts.legTerug();
			
			// Lege lijn voor leesbaarheid
			System.out.println("");
		}
	}
}
