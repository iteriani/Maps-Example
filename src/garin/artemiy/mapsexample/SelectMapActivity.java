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
    public void onClickMapGoogle(View view) {
        startActivity(new Intent(this, MapGoogleActivity.class));
    }

    @SuppressWarnings("unused")
    public void onClickMapYandex(View view) {
        startActivity(new Intent(this, MapYandexActivity.class));
    }

    @SuppressWarnings("unused")
    public void onClickMapAmazon(View view) {
        startActivity(new Intent(this, MapAmazonActivity.class));
    }

    @SuppressWarnings("unused")
    public void onClickMapBing(View view) {
        startActivity(new Intent(this, MapBingActivity.class));
    }

    @SuppressWarnings("unused")
    public void onClickMapArcGIS(View view) {
        startActivity(new Intent(this, MapArcGISActivity.class));
    }

}
