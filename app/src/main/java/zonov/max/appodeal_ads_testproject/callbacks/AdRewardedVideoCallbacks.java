package zonov.max.appodeal_ads_testproject.callbacks;

import android.app.Activity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.appodeal.ads.RewardedVideoCallbacks;

import zonov.max.appodeal_ads_testproject.R;

public class AdRewardedVideoCallbacks implements RewardedVideoCallbacks {

    private ProgressBar progressBar;
    private Activity activity;

    public AdRewardedVideoCallbacks(ProgressBar progressBar, Activity activity) {
        this.progressBar = progressBar;
        this.activity = activity;
    }

    @Override
    public void onRewardedVideoLoaded() {
        progressBar.setVisibility(View.INVISIBLE);
        Toast.makeText(activity, activity.getString(R.string.rewarded_loaded), Toast.LENGTH_LONG)
                .show();
    }

    @Override
    public void onRewardedVideoFailedToLoad() {
        progressBar.setVisibility(View.INVISIBLE);
        Toast.makeText(activity, activity.getString(R.string.rewarded_failed), Toast.LENGTH_LONG)
                .show();
    }

    @Override
    public void onRewardedVideoShown() {
        progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onRewardedVideoFinished(int i, String s) {

    }

    @Override
    public void onRewardedVideoClosed(boolean b) {

    }
}
