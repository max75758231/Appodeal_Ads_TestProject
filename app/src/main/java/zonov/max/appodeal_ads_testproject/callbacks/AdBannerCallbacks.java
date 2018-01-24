package zonov.max.appodeal_ads_testproject.callbacks;

import android.view.View;
import android.widget.ProgressBar;

import com.appodeal.ads.BannerCallbacks;

public class AdBannerCallbacks implements BannerCallbacks {

    private ProgressBar progressBar;

    public AdBannerCallbacks(ProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    @Override
    public void onBannerLoaded(int i, boolean b) {
        progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onBannerFailedToLoad() {
        progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onBannerShown() {
        progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onBannerClicked() {

    }
}
