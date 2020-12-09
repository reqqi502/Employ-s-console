package first_package;
//akram_reqqi
public class main_execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		personne[] personne = new personne[2];
		personne[0] = new Medecin("Maher",31);
		personne[1] = new Opticienne("Iman",33);
		
		for (int i = 0; i < personne.length; i++)
		personne[i].infoaffichage();
		}

	}


