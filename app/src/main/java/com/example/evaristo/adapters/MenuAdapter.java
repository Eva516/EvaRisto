package com.example.evaristo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.evaristo.R;
import com.example.evaristo.dto.PiattoDto;
import com.example.evaristo.models.Menu;

import java.text.BreakIterator;
import java.util.List;

public class MenuAdapter extends ArrayAdapter<Menu> {

    private final Context context;

    public MenuAdapter(Context context, List<Menu> values) {
        super(context, R.layout.content_menu, values);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.row_menu, parent, false);

        TextView title = rowView.findViewById(R.id.menu_title);
        TextView description = rowView.findViewById(R.id.menu_description);

        Menu menu = getItem(position);

        title.setText(menu.getNome());
        description.setText(menu.getDescrizione());

        return rowView;
    }

    public static class CustomAdapter extends ArrayAdapter<PiattoDto>{

        public CustomAdapter(Context context, int textViewResourceId,
                             List <PiattoDto> objects) {
            super(context, textViewResourceId, objects);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.activity_menu, null);
            TextView id = (TextView)convertView.findViewById(R.id.id);
            TextView nome = (TextView)convertView.findViewById(R.id.nome);
            TextView descrizione = (TextView)convertView.findViewById(R.id.menu_description);
            TextView prezzo = (TextView)convertView.findViewById(R.id.prezzo);
            TextView stato = (TextView)convertView.findViewById(R.id.stato);
            TextView tipo = (TextView)convertView.findViewById(R.id.tipo);
            TextView vegetariano = (TextView)convertView.findViewById(R.id.vegetariano);
            TextView vegano = (TextView)convertView.findViewById(R.id.vegano);
            TextView allergeni = (TextView)convertView.findViewById(R.id.allergeni);
            PiattoDto c = getItem(position);

            id.setText(c.getmId());
            nome.setText(c.getmNome());
            descrizione.setText(c.getmDescrizione());
            prezzo.setText(c.getmPrezzo());
            stato.setText(c.getmStato());
            tipo.setText(c.getmTipo());
            vegetariano.setText(c.getmVegetariano());
            vegano.setText(c.getmVegano());
            allergeni.setText(c.getmAllergeni());
            return convertView;
        }

}
}

