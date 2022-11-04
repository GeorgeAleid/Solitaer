package Solitaer;
import java.util.Scanner;
public class Solitaer {
	public static void main(String[] args) {
		int moves = 0;
		String [][] array = new String [5][5];
		Spielfeld b = new Spielfeld(array);
		Scanner sc =new Scanner(System.in);
		System.out.println("wo willst du anfangen? Zeile und Spalte");
		int ze = sc.nextInt();
		int sp = sc.nextInt();
		b.starteSpiel(ze,sp);
		
		do {
			
			
			System.out.println("zeile 1?");
			int ze1 = sc.nextInt();
			System.out.println("Spalte 1?");
			int sp1 = sc.nextInt();
			
			System.out.println("zeile  2?");
			int ze2 = sc.nextInt();
			System.out.println("Spalte 2?");
			int sp2 = sc.nextInt();
			if(b.zug(ze1,sp1,ze2,sp2)) {
				b.ausgabeSpielfeld(ze1,sp1,ze2,sp2);
				moves++;
			}
			
			
			
			
			
		}while( !b.gewinn());
		
//		String [][] array = {
//			{"#","#","#","#","#",},
//			{"#","#","#","#","#",},
//			{"#","#"," ","#","#",},
//			{"#","#","#","#","#",},
//			{"#","#","#","#","#",}
//		};
//		Spielfeld b = new Spielfeld(array);
//		b.starteSpiel(2,2);
//		
//		System.out.println(b.zug(2, 0, 2, 2)); 
//		b.ausgabeSpielfeld(2, 0, 2, 2);
//		System.out.println();
//		b.ausgabeSpielfeld(4, 0, 2, 0);
		
	}
}
