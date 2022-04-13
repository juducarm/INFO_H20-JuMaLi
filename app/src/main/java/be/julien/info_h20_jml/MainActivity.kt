package be.julien.info_h20_jml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.view.WindowManager
import android.view.WindowManager.LayoutParams.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setFlags(FLAG_FULLSCREEN, FLAG_FULLSCREEN); //cachage de la barre de status
        setContentView(R.layout.activity_main)


        //bouton de changement de fragment
        bouton_principal.setOnClickListener {
            if (bouton_principal.text == getString(R.string.afficher_clavier)) {
                bouton_principal.text = getString(R.string.afficher_menu )

                val fragmentClavier = FragmentClavier()  //creation du fragment clavier

                val manager = supportFragmentManager //appel au gestionnaire de fragment

                //transaction vers le nouveau fragment
                val transaction = manager.beginTransaction()
                transaction.replace(R.id.fragment_container,fragmentClavier)
                transaction.addToBackStack(null) //conserve le fragment en mémoire
                transaction.commit()
            }

            else {
                bouton_principal.text = getString(R.string.afficher_clavier)
                val fragmentMenu = FragmentMenu()  //creation du fragment clavier

                val manager = supportFragmentManager //appel au gestionnaire de fragment

                //transaction vers le nouveau fragment
                val transaction = manager.beginTransaction()
                transaction.replace(R.id.fragment_container,fragmentMenu)
                transaction.addToBackStack(null) //conserve le fragment en mémoire
                transaction.commit()
            }
        }
    }
}