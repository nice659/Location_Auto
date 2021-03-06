package sn.Illoki.domain;

public class Commande {
    private String id;
    private Client client;
    private Voiture voiture;
    private String date_location;
    private String date_retour;
    private String prix;

    public Commande() {

    }

    public Commande(String id, Client client, Voiture voiture, String date_location, String date_retour, String prix) {
        this.id = id;
        this.client = client;
        this.voiture = voiture;
        this.date_location = date_location;
        this.date_retour = date_retour;
        this.prix = prix;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    public String getDate_location() {
        return date_location;
    }

    public void setDate_location(String date_location) {
        this.date_location = date_location;
    }

    public String getDate_retour() {
        return date_retour;
    }

    public void setDate_retour(String date_retour) {
        this.date_retour = date_retour;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }
}
