package zonov.max.appodeal_ads_testproject.callbacks;

import android.view.View;
import android.widget.ProgressBar;

import com.appodeal.ads.MrecCallbacks;

public class AdMrecCallbacks implements MrecCallbacks {

    private ProgressBar progressBar;

    public AdMrecCallbacks(ProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    @Override
    public void onMrecLoaded(boolean b) {
        progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onMrecFailedToLoad() {
        progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onMrecShown() {
        progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onMrecClicked() {

    }
}
