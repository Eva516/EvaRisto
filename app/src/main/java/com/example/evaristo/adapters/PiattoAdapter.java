package com.example.evaristo.adapters;

import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.evaristo.R;

import java.util.List;

public class PiattoAdapter extends ArrayAdapter<Piatto> {

    private final Context context;

    public PiattoAdapter(Context context, List<Piatto> values) {
        super(context, R.layout.content_piatto, values);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /*
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.row_menu, parent, false);

        TextView title = rowView.findViewById(R.id.menu_title);
        TextView description = rowView.findViewById(R.id.menu_description);

        Menu menu = getItem(position);

        title.setText(menu.getNome());
        description.setText(menu.getDescrizione());

        return rowView;

         */

        return null;
    }
}
