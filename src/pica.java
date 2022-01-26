
import javax.swing.JOptionPane;
public class pica {
public static void picasveide() {
	int izmers;
	do {
	izmers = Integer.parseInt(JOptionPane.showInputDialog("Kadu izmeru picu jus gribat?"));
}while(izmers<20 || izmers>50);
}
	public static void main(String[] args) {
				String izvele;
				izvele = JOptionPane.showInputDialog("pica-izveidot picu | ");
				izvele = izvele.toLowerCase();
				do {
				switch(izvele) {
				case"pica":
					picasveide();
					break;
				case"stop":
				
				break;
				default: JOptionPane.showMessageDialog(null,"Komanda nepastav", "Error", JOptionPane.ERROR_MESSAGE);
				}
				}while(!izvele.equals("stop"));

			}
		
	}



	}
