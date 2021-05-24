public class Piatto {

    private String id;
    private String id_ristorante;
    private String descrizione;
    private String prezzo;
    private String stato;
    private String tipo;

    public Piatto(String id, String id_ristorante, String descrizione, String prezzo, String stato, String tipo){

        this.id = id;
        this.id_ristorante = id_ristorante;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.stato = stato;
        this.tipo = tipo;

    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId_ristorante(){
        return id_ristorante;
    }

    public void setId_ristorante(String id_ristorante){
        this.id_ristorante = id_ristorante;
    }

    public String getDescrizione(){
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(String prezzo) {
        this.prezzo = prezzo;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
