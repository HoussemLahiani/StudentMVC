package com.houssem.lahiani.studentmvc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter  extends ArrayAdapter<Etudiant> {

    ArrayList<Etudiant> dataSet;
    Context mContext;

        public CustomAdapter(@NonNull Context context,ArrayList<Etudiant> dataSet ) {
        super(context, R.layout.item,dataSet);

        this.dataSet=dataSet;
        this.mContext=context;

    }

    private static class ViewHolder
    {
        TextView txtNom;
        TextView txtClasse;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            Etudiant etudiant=getItem(position);
            ViewHolder viewHolder =new ViewHolder();
            if(convertView==null)
            {

                LayoutInflater inflater=LayoutInflater.from(getContext());
                convertView = inflater.inflate(R.layout.item,parent,false);
                viewHolder.txtNom= convertView.findViewById(R.id.nom);
                viewHolder.txtClasse=convertView.findViewById(R.id.classe);
               convertView.setTag(viewHolder);
            }
            else
            {
                convertView.getTag();
            }

            viewHolder.txtNom.setText(etudiant.getNom());
            viewHolder.txtClasse.setText(etudiant.getClasse());

        return convertView ;
    }
}
