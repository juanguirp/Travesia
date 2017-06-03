package cm.juangui.travesia;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;


/**
 * Created by Juangui on 31/05/2017.
 */

public class Travesia extends Fragment {

    Button creart;

    private boolean tieneTravesia = false;

    public boolean tieneUnaTravesia() {
        return tieneTravesia;
    }

    public void setTieneTravesia(boolean tieneTravesia) {
        this.tieneTravesia = tieneTravesia;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.no_travesia, container, false);
        creart = (Button) view.findViewById(R.id.creart);

        creart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content, new MapsActivity() ).commit();
            }
        });
        return view;
    }
}
