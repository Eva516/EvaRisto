import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.evaristo.R;

import java.util.ArrayList;

public class Menu extends AppCompactActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate (savedInstanceState);
        setContentView(R.layout.activity_list);

        String[] nameproducts = new String[]{"primo", "secondo", "contorno"};
        final ArrayList <String>listp = new ArrayList<String>();
        for(int i = 0; i< nameproducts.length; i++){
            listp.add(nameproducts[i]);
        }
        final Menu mylist = (Menu)findViewByld(R.id.listView1);

        final ArrayAdapter <String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,listp);

        mylist.setAdapter(adapter);
    }

    @Override
    protected void setAdapter(ArrayAdapter<String> adapter) {

    }


    private void setContentView(int activity_list) {
    }


}
