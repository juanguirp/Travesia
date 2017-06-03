package cm.juangui.travesia;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Juangui on 31/05/2017.
 */

public class Grupo extends Fragment {

    public boolean tieneUnGrupo() {
        return tieneGrupo;
    }

    public void setTieneGrupo(boolean tieneGrupo) {
        this.tieneGrupo = tieneGrupo;
    }

    private boolean tieneGrupo = false;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.no_grupo, container, false);
        Button crearg = (Button) view.findViewById(R.id.crearg);

        crearg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content, new Lista() ).commit();
            }
        });
        return view;
    }
}

