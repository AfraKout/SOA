package service;

import metier.Compte;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class BanqueService {
    List<Compte> comptes = new ArrayList<Compte>();

    @WebMethod
    public double conversion(@WebParam double montant) {
        return montant * 3.36;}
    @WebMethod
    public List<Compte> getComptes() {
        Compte c1 = new Compte(0, 0, new Date());
        Compte c2 = new Compte(1, 0, new Date());
        comptes.add(c1);
        comptes.add(c2);
        return comptes;
    }
}