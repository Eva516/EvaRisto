public class Tavolo {

    private String id;
    private String numero;
    private String coperti;
    private String descrizione;
    private String stato;

    public Tavolo(String id, String numero, String coperti, String descrizione, String stato){
        this.id = id;
        this.numero = numero;
        this.coperti = coperti;
        this.descrizione = descrizione;
        this.stato = stato;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCoperti() {
        return coperti;
    }

    public void setCoperti(String coperti) {
        this.coperti = coperti;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }
}
