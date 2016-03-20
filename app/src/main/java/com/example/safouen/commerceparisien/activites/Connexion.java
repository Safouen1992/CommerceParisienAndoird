package com.example.safouen.commerceparisien.activites;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.safouen.commerceparisien.R;

public class Connexion extends AppCompatActivity {

    /**
     * Initialisation des composants graphiques
     */
    ImageView logo = null ;
    EditText email = null ;
    EditText mdp = null ;
    Button connexion = null;
    TextView inscription = null ;
    TextView temail = null ;
    TextView tmdp = null ;
    TextView titre = null;

    /**
     * onCreate
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        /**
         *
         */
        titre = (TextView) findViewById(R.id.titre);
        email = (EditText) findViewById(R.id.email);
        mdp = (EditText) findViewById(R.id.mdp);
        connexion = (Button) findViewById(R.id.connexion);
        inscription = (TextView) findViewById(R.id.inscription);
        temail = (TextView) findViewById(R.id.Temail);
        tmdp = (TextView) findViewById(R.id.Tmdp);
        logo = (ImageView) findViewById(R.id.logo);

        /**
         * Gestion d'évènements
         */

        // Bouton de connexion
        connexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent accueil = new Intent(Connexion.this , AccueilUser.class);
                startActivity(accueil);


            }
        });





    }
}
