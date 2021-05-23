import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.evaristo.R;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Login extends Activity {

    Button b;
    EditText username, password;

    TextView tx1;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        b = (Button)findViewById(R.id.button);
        username = (EditText)findViewById(R.id.editText1);
        password = (EditText)findViewById(R.id.editText2);

        tx1 = (TextView)findViewById(R.id.textView3);
        tx1.setVisibility(View.GONE);

        b.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
                    public void onClick(View v){
                if (username.getText().toString().equals("admin")&& password.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(),"Redirecting..", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(),
                            "Wrong Credentials", Toast.LENGTH_SHORT).show();
                tx1.setVisibility(View.VISIBLE);
                tx1.setBackgroundColor(Color.RED);
                tx1.setText(Integer.toString(counter));

                if (counter == 0){
                    b.setEnabled(false);
                }
                }
                try {
                    URL paginaURL = new URL("http://www....");
                    HttpURLConnection client = (HttpURLConnection) paginaURL.openConnection();

                    InputStream risposta = new BufferedInputStream(client.getInputStream());

                    //String datiPost = URLEncoder.encode("", " ") + URLEncoder.encode();

                } catch (Exception e){
                    e.printStackTrace();
                }

                //StringdatiLetti = mostroDati (risposta);
                //Toast.makeText(getApplicationContext(),username, password, Toast.LENGTH_LONG).show();
            }
        });
    }

/*private static  String mostroDati (){
      StringBuilder sb = new StringBuilder();
      try (BufferedReader reader = new BufferedReader(new InputStreamReader(mostroDati()));){
          String nextLine = "";
          while ((nextLine = reader.readLine())!= null){
              sb.append(nextLine);
          }
    } catch (IOException e){
          e.printStackTrace();
      } return sb.toString(); */
}
//}












