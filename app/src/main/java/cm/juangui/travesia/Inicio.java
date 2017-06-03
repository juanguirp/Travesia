package cm.juangui.travesia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Juangui on 31/05/2017.
 */

public class Inicio extends Fragment {

    static final int request = 12345;

    private Button crearTravesia;
    private Button buscarGrupo;
    private Button miPerfil;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.inicio, container, false);
        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Toast.makeText(getActivity(), "aaaaaaaaaa", Toast.LENGTH_LONG).show();
        if(requestCode == request){
            String message = data.getStringExtra("MESSAGE");
            Toast.makeText(getActivity(), message, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        crearTravesia = (Button) getView().findViewById(R.id.crearTravesia);
        buscarGrupo = (Button) getView().findViewById(R.id.buscarGrupo);
        miPerfil = (Button) getView().findViewById(R.id.miPerfil);

        crearTravesia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Seleccione los puntos de partida y llegada", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getActivity(), CrearTravesia.class);
                getActivity().startActivityForResult(intent,  request);
            }
        });

        buscarGrupo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Busque un grupo y unase a su travesia", Toast.LENGTH_LONG).show();
            }
        });

        miPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Este es su perfil", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getActivity(), MiPerfil.class);
                startActivity(intent);
            }
        });
    }
}
