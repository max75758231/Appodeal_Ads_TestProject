package zonov.max.appodeal_ads_testproject.callbacks;

import android.app.Activity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.appodeal.ads.InterstitialCallbacks;

import zonov.max.appodeal_ads_testproject.R;

public class AdInterstitialCallbacks implements InterstitialCallbacks {

    private ProgressBar progressBar;
    private Activity activity;

    public AdInterstitialCallbacks(ProgressBar progressBar, Activity activity) {
        this.progressBar = progressBar;
        this.activity = activity;
    }

    @Override
    public void onInterstitialLoaded(boolean b) {
        progressBar.setVisibility(View.INVISIBLE);
        Toast.makeText(activity, activity.getString(R.string.interstitial_loaded), Toast.LENGTH_LONG)
                .show();
    }

    @Override
    public void onInterstitialFailedToLoad() {
        progressBar.setVisibility(View.INVISIBLE);
        Toast.makeText(activity, activity.getString(R.string.interstitial_failed), Toast.LENGTH_LONG)
                .show();
    }

    @Override
    public void onInterstitialShown() {
        progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onInterstitialClicked() {

    }

    @Override
    public void onInterstitialClosed() {

    }
}
