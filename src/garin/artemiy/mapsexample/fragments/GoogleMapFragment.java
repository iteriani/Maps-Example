package garin.artemiy.mapsexample.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.SupportMapFragment;

/**
 * Author: Artemiy Garin
 * Date: 13.11.13
 */
public class GoogleMapFragment extends SupportMapFragment {

    @Override
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, null, bundle);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(getActivity()) == ConnectionResult.SUCCESS) {
            View view = super.onCreateView(inflater, container, savedInstanceState);
            setRetainInstance(true);
            return view;
        } else {
            return new View(inflater.getContext());
        }
    }

}
