package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by n.cooray on 5/05/2018.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {
    public EarthquakeLoader(Context context, String url) {
        super(context);
        // TODO: Finish implementing this constructor
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        // TODO: Implement this method
    }
}
