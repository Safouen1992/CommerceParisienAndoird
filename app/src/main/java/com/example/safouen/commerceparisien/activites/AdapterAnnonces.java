package com.example.safouen.commerceparisien.activites;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.safouen.commerceparisien.javaClass.Annonce;
import com.example.safouen.commerceparisien.R;

public class AdapterAnnonces extends BaseAdapter {

    /**
     * Attributs
     */
    private Context context = null ;
    private Annonce[] annonces = null;

    /**
     * Constructeur avec parametres
     */
    public AdapterAnnonces(Context context, Annonce[] annonces) {
        this.context = context;
        this.annonces = annonces;
    }

    /**
     * Surcharge des méthodes de la classe BaseAdapter
     */
    @Override
    public int getCount() {
        return annonces.length;
    }

    @Override
    public Object getItem(int position) {
        return annonces[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //on inflate le XML
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.activity_adapter_annonces, parent, false);
        //si la vue précédente n'existe pas, il faut la fabriquer et la retourner
        if( convertView == null ) {
                    /** instanciation des 3 widget du fichiers mes_items3.xml
                     * et affectation du texte et image
                     * le paramètrage de l'aspect graphique est fait dans XML
                     * il pourrait être fait par codage
                     */
            ImageView imageAnnonce  = (ImageView) rowView.findViewById(R.id.imageAnnonce);
            TextView titreAnnonce = (TextView) rowView.findViewById(R.id.titreAnnonce);
            TextView prixAnnonce = (TextView) rowView.findViewById(R.id.prixAnnonce);
            TextView descriptionAnnonce = (TextView) rowView.findViewById(R.id.descriptionAnnonce);
            TextView chiffreAffaire = (TextView) rowView.findViewById(R.id.chiffreAffaire);

            imageAnnonce.setImageResource(annonces[position].getIdImageAnnonce());
            titreAnnonce.setText(annonces[position].getTitreAnnonce());
            prixAnnonce.setText(annonces[position].getPrixAnnonce());
            descriptionAnnonce.setText(annonces[position].getDescriptifAnnonce());
            chiffreAffaire.setText(annonces[position].getChiffreAffire());

        }else {
            rowView = (View)convertView;
        }
        return rowView;
    }
}
