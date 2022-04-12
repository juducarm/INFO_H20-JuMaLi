package be.julien.info_h20_jml

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentClavier: Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {

            //inflater transforme le xml en view
            val view = inflater!!.inflate(R.layout.fragment_clavier,container,false)

            val tv = view.findViewById<TextView>(R.id.fragment_clavier)


            return view
        }

        override fun onPause() {
            super.onPause()
        }

        override fun onAttach(context: Context) {
            super.onAttach(context)
        }

        override fun onDestroy() {
            super.onDestroy()
        }

        override fun onDetach() {
            super.onDetach()
        }

        override fun onStart() {
            super.onStart()
        }

        override fun onStop() {
            super.onStop()
        }
    }