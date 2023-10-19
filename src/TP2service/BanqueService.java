package TP2service;
import java.util.ArrayList;
import java.util.List;

public class BanqueService {
		List<Compte> comptes = new ArrayList<Compte>();
		public List<Compte> getComptes(){
			return comptes;
		}
		
		public Compte getCompte (int x) {
			return comptes.get(x);
		}
      public double conversion (double montant) {
    	  return montant *3.36;
      }
}
