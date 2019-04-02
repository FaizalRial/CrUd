package com.izol.caripom;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by IZOL on 3/10/2019.
 */

public class ObjekAdapter extends ArrayAdapter<Objek> {

    public ObjekAdapter(Activity context, ArrayList<Objek> objeks){
        super(context, 0, objeks);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Objek currentObjek = getItem(position);

        TextView objekName = (TextView) listItemView.findViewById(R.id.txt_title);
        objekName.setText(currentObjek.getObjekName());

        TextView objekKet = (TextView) listItemView.findViewById(R.id.txt_ket);
        objekKet.setText(currentObjek.getKetObjek());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.img_tmb);
        if (currentObjek.hasImage()) {
            iconView.setImageResource(currentObjek.getImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        } else {
            iconView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
