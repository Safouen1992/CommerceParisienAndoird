package com.example.safouen.commerceparisien.activites;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.safouen.commerceparisien.R;

public class Accueil extends AppCompatActivity {
    /**
     * Attributs
     */
    final Context context = this;

    /**
     *  Instanciation des composants
     */
    ImageView logo = null ;
    TextView titre = null ;
    Button connexion = null;
    Button inscription = null ;
    Button offres = null ;
    Button ajout = null ;
    Button mesannonces = null ;
    Button recherche = null ;
    ListView annonces = null ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        /**
         *
         */
        logo = (ImageView) findViewById(R.id.logo);
        titre = (TextView) findViewById(R.id.titre);
        connexion = (Button) findViewById(R.id.connexion);
        inscription = (Button) findViewById(R.id.inscription);
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

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);

                // set title
                alertDialogBuilder.setTitle("Connexion recquise !!");

                // set dialog message
                alertDialogBuilder
                        .setMessage("Appuyez sur Connexion pour vous connecter")
                        .setCancelable(false)
                        .setPositiveButton("Connexion",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                // if this button is clicked, close
                                // current activity
                                Intent connexion = new Intent(Accueil.this, Connexion.class);
                                startActivity(connexion);
                            }
                        })
                        .setNegativeButton("Retour",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                // if this button is clicked, just close
                                // the dialog box and do nothing
                                dialog.cancel();
                            }
                        });

                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                // show it
                alertDialog.show();


            }
        });
        // Bouton Ajouter Annonce
        ajout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);

                // set title
                alertDialogBuilder.setTitle("Connexion recquise !!");

                // set dialog message
                alertDialogBuilder
                        .setMessage("Appuyez sur Connexion pour vous connecter")
                        .setCancelable(false)
                        .setPositiveButton("Connexion",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                // if this button is clicked, close
                                // current activity
                                Intent connexion = new Intent(Accueil.this, Connexion.class);
                                startActivity(connexion);
                            }
                        })
                        .setNegativeButton("Retour",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                // if this button is clicked, just close
                                // the dialog box and do nothing
                                dialog.cancel();
                            }
                        });

                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                // show it
                alertDialog.show();



            }
        });
        // Bouton Ajouter Annonce
        mesannonces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);

                // set title
                alertDialogBuilder.setTitle("Connexion recquise !!");

                // set dialog message
                alertDialogBuilder
                        .setMessage("Appuyez sur Connexion pour vous connecter")
                        .setCancelable(false)
                        .setPositiveButton("Connexion",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                // if this button is clicked, close
                                // current activity
                                Intent connexion = new Intent(Accueil.this, Connexion.class);
                                startActivity(connexion);
                            }
                        })
                        .setNegativeButton("Retour",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                // if this button is clicked, just close
                                // the dialog box and do nothing
                                dialog.cancel();
                            }
                        });

                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                // show it
                alertDialog.show();



            }
        });
        // Bouton Rechercher
        recherche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);

                // set title
                alertDialogBuilder.setTitle("Connexion recquise !!");

                // set dialog message
                alertDialogBuilder
                        .setMessage("Appuyez sur Connexion pour vous connecter")
                        .setCancelable(false)
                        .setPositiveButton("Connexion",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                // if this button is clicked, close
                                // current activity
                                Intent connexion = new Intent(Accueil.this, Connexion.class);
                                startActivity(connexion);
                            }
                        })
                        .setNegativeButton("Retour",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                // if this button is clicked, just close
                                // the dialog box and do nothing
                                dialog.cancel();
                            }
                        });

                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                // show it
                alertDialog.show();



            }
        });
        // Bouton Rechercher
        recherche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);

                // set title
                alertDialogBuilder.setTitle("Connexion recquise !!");

                // set dialog message
                alertDialogBuilder
                        .setMessage("Appuyez sur Connexion pour vous connecter")
                        .setCancelable(false)
                        .setPositiveButton("Connexion",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                // if this button is clicked, close
                                // current activity
                                Intent connexion = new Intent(Accueil.this, Connexion.class);
                                startActivity(connexion);
                            }
                        })
                        .setNegativeButton("Retour",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                // if this button is clicked, just close
                                // the dialog box and do nothing
                                dialog.cancel();
                            }
                        });

                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                // show it
                alertDialog.show();


            }
        });
        // Bouton Inscription
        inscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inscription = new Intent(Accueil.this, Inscription.class);
                startActivity(inscription);
            }
        });
        // Bouton Inscription
        connexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent connexion = new Intent(Accueil.this, Connexion.class);
                startActivity(connexion);
            }
        });


    }
}
