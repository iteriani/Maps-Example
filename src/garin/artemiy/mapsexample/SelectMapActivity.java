package garin.artemiy.mapsexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectMapActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_map_layout);
    }

    @SuppressWarnings("unused")
    public void onClickMapsGoogle(View view) {
        startActivity(new Intent(this, MapsGoogleActivity.class));
    }

    @SuppressWarnings("unused")
    public void onClickMapsYandex(View view) {
        startActivity(new Intent(this, MapsYandexActivity.class));
    }

    @SuppressWarnings("unused")
    public void onClickMapsArcGIS(View view) {
        startActivity(new Intent(this, MapsArcGISActivity.class));
    }

}
