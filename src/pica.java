
import javax.swing.JOptionPane;
public class pica {
public static void picasveide() {
	String picasVeids, topingi;
	int izmers;
	double cenaIzmers, cenaVeidu;
	do {
	izmers = Integer.parseInt(JOptionPane.showInputDialog("Kadu izmeru picu jus gribat?"));
}while(izmers<20 || izmers>50);
	cenaIzmers=izmers*0.05;
	do {
	picasVeids = JOptionPane.showInputDialog("Biezu,planu vai daudzgraudu?");
	picasVeids = picasVeids.toLowerCase();
	}while(!picasVeids.equals("biezu") && !picasVeids.equals("planu") && !picasVeids.equals("daudzgraudu"));
	if(picasVeids.equals("biezu")) {
		cenaVeidu = 3.58;
} else if(picasVeids.equals("planu")) {
	cenaVeidu = 7.32;
}else {
	cenaVeidu = 8.50;
}
	do {
	topingi=JOptionPane.showInputDialog("stop to stop");
}while(!topingi.equals("stop"));
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
