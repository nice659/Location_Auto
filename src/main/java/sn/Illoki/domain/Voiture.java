package sn.Illoki.domain;

public class Voiture {
    private String id;
    private String marque;
    private String model;
    private String type;
    private String prix_jour;
    private boolean disponibilite;

    public Voiture() {
    }

    public Voiture(String id, String marque, String model, String type, String prix_jour, boolean disponibilite) {
        this.id = id;
        this.marque = marque;
        this.model = model;
        this.type = type;
        this.prix_jour = prix_jour;
        this.disponibilite = disponibilite;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrix_jour() {
        return prix_jour;
    }

    public void setPrix_jour(String prix_jour) {
        this.prix_jour = prix_jour;
    }

    public boolean isDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }
}
