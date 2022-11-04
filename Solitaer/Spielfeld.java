package Solitaer;

public class Spielfeld {
	private String[][] array;

	public Spielfeld(String[][] array) {
		this.array = array;
	}

	public void starteSpiel(int z, int s) {
		array = new String[5][5];
		int counter =0;
		
		System.out.println("  01234");
		System.out.println("  -----");
		for (int i = 0; i < 5; i++) {
			System.out.print(counter +"|");
			counter++;
			
			for (int j = 0; j < 5; j++) {
				array[i][j] = "#";
				array[z][s] = " ";
				
				System.out.print(array[i][j]);
			}
			System.out.println();
		}

	}

	public boolean zug(int ze1, int sp1, int ze2, int sp2) {
		if ((sp1 < 0 || ze1 < 0 || sp2 < 0 || ze2 < 0 || sp1 < 5 || ze1 < 5 || sp2 < 5 || ze2 < 5)
				&& ((!(ze1 - ze2 == 2 || ze1 - ze2 == -2) && sp1 == sp2)
						|| (!(sp1 - sp2 == 2 || sp1 - sp2 == -2) && ze1 == ze2))) {
			return false;
		} else {
			if (array[ze1][sp1].equals("#") && array[ze2][sp2].equals(" ")) {

				return true;
			} else {
				return false;
			}
		}

	}

	public void ausgabeSpielfeld(int ze1, int sp1, int ze2, int sp2) {
		if (zug(ze1, sp1, ze2, sp2) == true) {
			array[(ze1 + ze2) / 2][(sp1 + sp2) / 2] = " ";
			array[ze1][sp1] = " ";
			array[ze2][sp2] = "#";
			int counter =0;
			
			System.out.println("  01234");
			System.out.println("  -----");
			for (int i = 0; i < 5; i++) {
				System.out.print(counter +"|");
				counter++;
				for (int j = 0; j < 5; j++) {
					
					System.out.print(array[i][j]);
				}
				System.out.println();
			}
		}
	}
	public boolean gewinn() {
		String bla= "#";
		int counter =0;
		for(int i=0; i<array.length;i++) {
			for(int j=0; j<array[i].length;j++) {
				
				if(array[i][j].equals(bla)==true) {
					
					counter++;
				}
				
			}
		}
		if (counter==1)return true;
		else return false;
	}

}
