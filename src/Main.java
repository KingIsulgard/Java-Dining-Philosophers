import java.util.ArrayList;

public class Main {
    static ArrayList<Vork> vorken = new ArrayList<Vork>();
    static ArrayList<Filosoof> filosofen = new ArrayList<Filosoof>();
    static int aantalFilosofen = 5;
 
    public static void main(String[] args) {
    	// Maak vorken
    	for(int i = 0; i < aantalFilosofen; i++) {
    		vorken.add(new Vork(i+1));
    	}
    	
    	// Maak filosofen
        for(int i = 0; i < aantalFilosofen; i++) {
        	int volgendeVork = i+1;
        	if(volgendeVork == aantalFilosofen) volgendeVork = 0;
        	
        	filosofen.add(new Filosoof(i+1, vorken.get(i), vorken.get(volgendeVork)));
        }
       
        for (Filosoof f : filosofen) {
        	new Thread(f).start();
        }
    }
}