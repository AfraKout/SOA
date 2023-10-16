package TP2service;

public class Compte {
	private int code;
	private double solde;
	private String Datecreation;
	public Compte(int code, double solde, String datecreation) {
		super();
		this.code = code;
		this.solde = solde;
		Datecreation = datecreation;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public String getDatecreation() {
		return Datecreation;
	}
	public void setDatecreation(String datecreation) {
		Datecreation = datecreation;
	}

}
