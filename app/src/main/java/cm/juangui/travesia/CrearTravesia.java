package cm.juangui.travesia;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;

/**
 * Created by Juangui on 31/05/2017.
 */

public class CrearTravesia extends Activity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent();
        intent.putExtra("MESSAGE", "hola");
        setResult(12345, intent);
    }


}
