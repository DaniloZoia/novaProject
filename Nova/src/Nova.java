import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Nova {	
	
	
	public static void main(String[] args) {		
		
		CentroRicerca alcatraz = new CentroRicerca("alcatraz");
		CentroRicerca ulixe = new CentroRicerca("ulixe");
		CentroRicerca orangim = new CentroRicerca("orangim");
		
		Progetto novaNative = new Progetto("NovaNative");
		
		Junior x23 = new Junior("Franco");
		Junior x27 = new Junior("Rosaria");
		Senior l40 = new Senior("Giovanni");
		
		Area Nanotecnologie = new Area("Nanotecnologie");
		Area Agricoltura = new Area("Agricoltura");
		
		ArrayList<CentroRicerca> centriRicerca = new ArrayList<>();
		ArrayList<Progetto> progetti = new ArrayList<>();
		ArrayList<Team> teams = new ArrayList<>();
		ArrayList<Ricercatori> ricercatori = new ArrayList<>();
		ArrayList<Area> aree = new ArrayList<>();
		
		centriRicerca.add(alcatraz);
		centriRicerca.add(ulixe);
		centriRicerca.add(orangim);
		
		progetti.add(novaNative);
		
		ricercatori.add(l40);
		ricercatori.add(x27);
		ricercatori.add(x23);
		
		aree.add(Nanotecnologie);
		aree.add(Agricoltura);


			Scanner in = new Scanner(System.in);
			System.out.println("Seleziona centro di ricerca (scrivi iniziale minuscola)");
			System.out.println(centriRicerca);
			char sceltaCentro = in.next().charAt(0);		
						
			
			boolean quit = false;
			
			while (!quit) {
				
				System.out.println("Immetti operazione(z per lista): ");			
				char operazione = in.next().charAt(0);			
				in.nextLine();
				
				switch (operazione) {			
				case 'z':			
					System.out.println("Lista opzioni:" + 
							"\n" + 
							"a = visualizza progetti\n" + 
							"b = visualizza ricercatori disponibili\n" + 
							"c = visualizza aree\n" + 
							"d = Crea nuovo progetto\n" + 							
							"e = aggiungi un ricercatore\n" + 							 
							"f = aggiungi nuova area\n" + 						
							"q = quit");

					break;
				case 'a':
					System.out.println("Progetti attivi: ");
					System.out.println(progetti);
					break;
					
				case 'b':
					System.out.println("Ricercatori disponibili: ");
					System.out.println(ricercatori);	
					break;
					
				case 'c':
					System.out.println("Aree disponibili: ");
					System.out.println(aree);	
					break;
					
				case 'd':
					System.out.println("Lista Opzioni: " + 
							"\n" + 
							"g = Nome progetto\n" + 
							"h = area progetto\n" + 
							"j = inserisci ricercatore\n" +
							"z = lista opzioni");								
					break;
					
				case 'g':
					System.out.println("Inserisci nome progetto: ");
					String nomeProgetto = in.nextLine();
					Progetto newProject = new Progetto(nomeProgetto);
					progetti.add(newProject);
					break;
					
				case 'f':
					System.out.println("Inserisci nome Area: ");
					String nomeArea = in.nextLine();
					Area newArea = new Area(nomeArea);
					aree.add(newArea);
					break;		
					
				case 'q':
					System.out.println("Programma Terminato ");
					quit = true;
					break;

				default:
					break;
				}						
			}					
		}
		
		
		
	}


