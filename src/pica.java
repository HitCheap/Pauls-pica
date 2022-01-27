
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
				do {
				izvele = JOptionPane.showInputDialog("picas-izveidot picu | stop ");
				izvele = izvele.toLowerCase();
				switch(izvele) {
				case"picas":
					picasveide();
					break;
				case"stop":
					JOptionPane.showMessageDialog(null, "Programma aptureta","Info",JOptionPane.INFORMATION_MESSAGE);
				break;
				default: JOptionPane.showMessageDialog(null,"Komanda nepastav", "Error", JOptionPane.ERROR_MESSAGE);
				}
				}while(!izvele.equals("stop"));

			}
		
	}



