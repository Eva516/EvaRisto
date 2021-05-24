public class Ordine {

    private String id;
    private String id_tavolo;
    private String id_cliente;
    private String stato;
    private String note;
    private String piatti;

    public Ordine(String id, String id_tavolo, String id_cliente, String stato, String note, String piatti){
        this.id = id;
        this.id_tavolo = id_tavolo;
        this.id_cliente = id_cliente;
        this.stato = stato;
        this.note = note;
        this.piatti = piatti;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_tavolo(){
        return id_tavolo;
    }

    public void setId_tavolo(String id_tavolo) {
        this.id_tavolo = id_tavolo;
    }

    public String getId_cliente(){
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getStato(){
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public String getNote(){
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPiatti(){
        return piatti;
    }

    public void setPiatti(String piatti){
        this.piatti = piatti;
    }

}
