package first_package;

public class Medecin extends personne {

		// TODO Auto-generated method stub
    String name;
    int age ;



	public Medecin(String name , int age) {
		super();
		this.age = age;
		this.name = name;
		// TODO Auto-generated constructor stub
	}


	
	public String infoaffichage() {
		 System.out.println("le nom de medcin est : " + name + "votre age est " + age );
		return name;
	}

}
