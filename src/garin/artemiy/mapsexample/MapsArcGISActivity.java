package garin.artemiy.mapsexample;

import android.app.Activity;
import android.os.Bundle;
import com.esri.android.map.MapView;
import com.esri.android.map.ags.ArcGISTiledMapServiceLayer;

/**
 * Author: Artemiy Garin
 * Date: 13.11.13
 */
public class MapsArcGISActivity extends Activity {

    private static final String MAP_URL =
            "http://services.arcgisonline.com/ArcGIS/rest/services/World_Street_Map/MapServer";
    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_arcgis_layout);

        mapView = (MapView) findViewById(R.id.mapView);
        mapView.addLayer(new ArcGISTiledMapServiceLayer(MAP_URL));
    }

    @Override
    protected void onPause() {
        super.onPause();
        mapView.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView.unpause();
    }

}
