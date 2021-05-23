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


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ristorante);

    }
}
