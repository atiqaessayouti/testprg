package javasql;

public class Connexion {
	
	    public void chargePilote() {
	        try {
	        	  Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("Le pilote a été chargé avec succès");
	        } 
	        catch (ClassNotFoundException e) {
	            System.err.println("Erreur de chargement du pilote");
	        }
	    }

}