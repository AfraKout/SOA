package client;

import proxy.BanqueService;
import proxy.BanqueServiceService;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService banqueservice = new BanqueServiceService().getBanqueServicePort();
        System.out.println(banqueservice.conversion(11.11));
        List<Compte> listeComptes = BanqueService.getComptes();
        for (Compte compte : listeComptes) {
            System.out.println("Solde : " + compte.getSolde());
            System.out.println("code : " + compte.getCode());
        }
    }
}