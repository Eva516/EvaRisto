public class Cliente {

    private String id;
    private String nome;
    private String cognome;
    private String sesso;
    private String telefono;
    private String partita_iva;
    private String ragione_sociale;

    public Cliente(String id, String nome, String cognome, String sesso, String telefono, String partita_iva, String ragione_sociale){
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = sesso;
        this.telefono = telefono;
        this.partita_iva = partita_iva;
        this.ragione_sociale = ragione_sociale;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome(){
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getSesso(){
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getPartita_iva(){
        return partita_iva;
    }

    public void setPartita_iva(){
        this.partita_iva = partita_iva;
    }

    public String getRagione_sociale(){
        return ragione_sociale;
    }

    public void setRagione_sociale(){
        this.ragione_sociale = ragione_sociale;
    }
}
