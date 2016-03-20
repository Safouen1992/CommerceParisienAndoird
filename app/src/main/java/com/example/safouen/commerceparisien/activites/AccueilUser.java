package com.example.safouen.commerceparisien.activites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.safouen.commerceparisien.R;

public class AccueilUser extends AppCompatActivity {
    /**
     *
     */
    ImageView logo = null ;
    TextView titre = null ;
    Button offres = null ;
    Button ajout = null ;
    Button mesannonces = null ;
    Button recherche = null ;
    ListView annonces = null ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil_user);

        /**
         *
         */
        logo = (ImageView) findViewById(R.id.logo);
        titre = (TextView) findViewById(R.id.titre);
        offres = (Button) findViewById(R.id.offres);
        ajout = (Button) findViewById(R.id.ajout);
        mesannonces = (Button) findViewById((R.id.mesannonces));
        recherche = (Button) findViewById(R.id.recherche);

        /**
         * Gestion d'évènements
         */

        // Bouton Offres
        offres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent offres = new Intent(AccueilUser.this, Offres.class);
                startActivity(offres);


            }
        });
        // Bouton Ajouter Annonce
        ajout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ajout = new Intent(AccueilUser.this, Ajout.class);
                startActivity(ajout);


            }
        });
        // Bouton Ajouter Annonce
        mesannonces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mesannonces = new Intent(AccueilUser.this, MesAnnonces.class);
                startActivity(mesannonces);


            }
        });
        // Bouton Rechercher
        recherche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recherche = new Intent(AccueilUser.this, Recherche.class);
                startActivity(recherche);


            }
        });

    }
}
