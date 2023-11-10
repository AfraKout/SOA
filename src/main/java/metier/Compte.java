package metier;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import java.util.*;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code;
    private double solde;
    @XmlTransient
    private Date date;
    public Compte(int code, double solde, Date date) {
        super();
        this.code = code;
        this.solde = solde;
        this.date = date;
    }
    public Compte() {
       //li ntesti alih fih prob lezm nhot constructeur vide
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public int getSolde() {
        return (int) solde;
    }
    public void setSolde(int solde) {
        this.solde = solde;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
}