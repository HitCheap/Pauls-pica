import java.util.ArrayList;

import javax.swing.JOptionPane;

public class pica {
	static ArrayList<String> sastavdalas = new ArrayList<String>();
	static double cena, cenaIzmers, cenaVeidu,cenaTop;
public static void picasveide() {
	sastavdalas.clear();
	String picasVeids;
	int izmers;
cena=0;
cenaIzmers=0;
cenaVeidu=0; 
cenaTop=0;
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
} if(picasVeids.equals("planu")) {
	cenaVeidu = 7.32;
}if(picasVeids.equals("daudzgraudu")) {
	cenaVeidu = 8.50;
}
taisit();
}
public static void taisit() {
String topingi;
	do {
topingi=JOptionPane.showInputDialog("SIERS-2.25 | VEGANU SIERS-4.89 | ZILAIS SIERS-2.49 | LIELLOPU SKINKIS-5.49 | LASIS-5.99 | VISTAS FILEJA-4.59 | MALTA GALA-5.49 | BEKONS-4.19 | SKINKIS-4.19 | SALAMI DESA-3.99 | \nKONSERVETI ANANASI-2.19 | SENES-2.19 | TOMATI-2.19 | KUKURUZA-1.69 | PAPRIKA-2.19 | MARINETI GURKI-2.19 | KIRSU TOMATI-2.49 | OLIVES-2.19 | PERSIKI-2.19 | DILLE-0.49 | SIPOLI-0.49 | BBQ MERCE-3.29 | TALAK-Atgriez atpakal");
topingi = topingi.toUpperCase();
if (topingi.equals("SIERS")) {
	cenaTop=cenaTop+2.25;
	sastavdalas.add("Siers");
	System.out.println("siers");
}
if (topingi.equals("VEGANU SIERS") || topingi.equals("VEGANUSIERS")) {
	cenaTop=cenaTop+4.89;
	sastavdalas.add("Veganu siers");
}
if (topingi.equals("ZILAIS SIERS") || topingi.equals("ZILAISSIERS")) {
	cenaTop=cenaTop+2.49;
	sastavdalas.add("Zilais siers");
}
if (topingi.equals("LIELLOPU SKINKIS") || topingi.equals("LIELLOPUSKINKIS")) {
	cenaTop=cenaTop+5.49;
	sastavdalas.add("Liellopu skinkis");
}
if (topingi.equals("LASIS")) {
	cenaTop=cenaTop+5.99;
	sastavdalas.add("Lasis");
}
if (topingi.equals("VISTAS FILEJA") || topingi.equals("VISTASFILEJA")) {
	cenaTop=cenaTop+4.59;
	sastavdalas.add("Vistas Fileja");
}
if (topingi.equals("MALTA GALA") || topingi.equals("MALTAGALA")) {
	cenaTop=cenaTop+5.49;
	sastavdalas.add("Malta gala");
}
if (topingi.equals("BEKONS")) {
	cenaTop=cenaTop+4.19;
	sastavdalas.add("Bekons");
}
if (topingi.equals("SKINKIS")) {
	cenaTop=cenaTop+4.19;
	sastavdalas.add("Skinkis");
}
if (topingi.equals("SALAMI DESA") || topingi.equals("SALAMIDESA")) {
	cenaTop=cenaTop+3.99;
	sastavdalas.add("Salami desa");
}
if (topingi.equals("KONSERVETI ANANASI") || topingi.equals("KONSERVETIANANASI")){
	cenaTop=cenaTop+2.19;
	sastavdalas.add("Konserveti ananasi");
}
if (topingi.equals("SENES")){
	cenaTop=cenaTop+2.19;
	sastavdalas.add("Senas");
}
if (topingi.equals("TOMATI")) {
	cenaTop=cenaTop+2.19;
	sastavdalas.add("Tomati");
}
if (topingi.equals("KUKURUZA")) {
	cenaTop=cenaTop+1.69;
	sastavdalas.add("Kukuruza");
}
if (topingi.equals("PAPRIKA")) {
	cenaTop=cenaTop+2.19;
	sastavdalas.add("Paprika");
}
if (topingi.equals("MARINETI GURKI") || topingi.equals("MARINETIGURKI")) {
	cenaTop=cenaTop+2.19;
	sastavdalas.add("Marineti gurki");
}
if (topingi.equals("KIRSU TOMATI")|| topingi.equals("KIRSUTOMATI")) {
	cenaTop=cenaTop+2.49;
	sastavdalas.add("Kirsu tomati");
}
if (topingi.equals("OLIVES")) {
	cenaTop=cenaTop+2.19;
	sastavdalas.add("Olives");
}
if (topingi.equals("PERSIKI")) {
	cenaTop=cenaTop+2.19;
	sastavdalas.add("Persiki");
}
if (topingi.equals("DILLE")) {
	cenaTop=cenaTop+0.49;
	sastavdalas.add("Dille");
}
if (topingi.equals("SIPOLI")) {
	cenaTop=cenaTop+0.49;
	sastavdalas.add("Sipoli");
}
if (topingi.equals("BBQ MERCE") || topingi.equals("BBQMERCE")) {
	cenaTop=cenaTop+3.29;
	sastavdalas.add("BBQ Merce");
}
}while(!topingi.equals("TALAK"));
cena=cenaIzmers+cenaVeidu+cenaTop;

	}
	public static void main(String[] args) {
				String izvele;
				izvele = JOptionPane.showInputDialog("picas-izveidot picu | apskatit-apskatit sastavdalas un cenu | stop");
				izvele = izvele.toLowerCase();
				do {
				switch(izvele) {
				case"picas":
					picasveide();
					break;
				case"apskatit":
					for(int i=0; i<sastavdalas.size(); i++) {
						System.out.print(sastavdalas.get(i)+" ");
					}
					System.out.println("Sis ir jusu sastavdalas un tas izmaksas "+cena+" EUR");
					break;
				case"stop":
					JOptionPane.showMessageDialog(null, "Programma aptureta");
					break;
				default: JOptionPane.showMessageDialog(null,"Komanda nepastav", "Error", JOptionPane.ERROR_MESSAGE);
				}
				}while(!izvele.equals("stop"));
	}
	}
