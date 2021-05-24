import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.example.dto.R;

public class Ristorante extends Activity {

    private String id;
    private String nome;
    private String indirizzo;
    private String ragione_sociale;
    private String partita_iva;

public Ristorante(String id, String nome, String indirizzo, String ragione_sociale, String partita_iva){

    this.id = id;
    this.nome = nome;
    this.indirizzo = indirizzo;
    this.ragione_sociale = ragione_sociale;
    this.partita_iva = partita_iva;

}
   public String getId(){
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

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getRagione_sociale() {
        return ragione_sociale;
    }

    public void setRagione_sociale(String ragione_sociale) {
        this.ragione_sociale = ragione_sociale;
    }

    public String getPartita_iva() {
        return partita_iva;
    }

    public void setPartita_iva(String partita_iva) {
        this.partita_iva = partita_iva;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ristorante);

    }
}
