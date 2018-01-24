package zonov.max.appodeal_ads_testproject.callbacks;

import android.app.Activity;
import android.view.View;
import android.widget.ProgressBar;

import com.appodeal.ads.Appodeal;
import com.appodeal.ads.MrecCallbacks;

public class AdMrecCallbacks implements MrecCallbacks {

    private ProgressBar progressBar;
    private Activity activity;

    public AdMrecCallbacks(ProgressBar progressBar, Activity activity) {
        this.progressBar = progressBar;
        this.activity = activity;
    }

    @Override
    public void onMrecLoaded(boolean b) {
        progressBar.setVisibility(View.INVISIBLE);
        Appodeal.show(activity, Appodeal.MREC);
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
