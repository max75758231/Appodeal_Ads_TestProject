package zonov.max.appodeal_ads_testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.appodeal.ads.Appodeal;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import zonov.max.appodeal_ads_testproject.callbacks.AdBannerCallbacks;
import zonov.max.appodeal_ads_testproject.callbacks.AdInterstitialCallbacks;
import zonov.max.appodeal_ads_testproject.callbacks.AdMrecCallbacks;
import zonov.max.appodeal_ads_testproject.callbacks.AdRewardedVideoCallbacks;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.pb_banner) ProgressBar pb_banner;
    @BindView(R.id.pb_rewarded_video) ProgressBar pb_rewarded;
    @BindView(R.id.pb_mrec) ProgressBar pb_mrec;
    @BindView(R.id.pb_interstitial) ProgressBar pb_interstitial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Appodeal.disableLocationPermissionCheck();
        Appodeal.disableWriteExternalStoragePermissionCheck();
        Appodeal.initialize(this,
                getString(R.string.sdk_key),
                Appodeal.NONE);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Appodeal.onResume(this, Appodeal.BANNER);
        Appodeal.onResume(this, Appodeal.MREC);
    }

    @OnClick (R.id.btn_banner)
    void onBannerButtonClick() {
        pb_banner.setVisibility(View.VISIBLE);
        Appodeal.initialize(this, getString(R.string.sdk_key), Appodeal.BANNER);
        Appodeal.setBannerCallbacks(new AdBannerCallbacks(pb_banner));
        Appodeal.show(this, Appodeal.BANNER_BOTTOM);
    }

    @OnClick (R.id.btn_rewarded_video)
    void onRewardedVideoButtonClick() {
        pb_rewarded.setVisibility(View.VISIBLE);
        Appodeal.initialize(this, getString(R.string.sdk_key), Appodeal.REWARDED_VIDEO);
        Appodeal.setRewardedVideoCallbacks(new AdRewardedVideoCallbacks(pb_rewarded, this));
        Appodeal.show(this, Appodeal.REWARDED_VIDEO);
    }

    @OnClick (R.id.btn_mrec_video)
    void onMrecButtonClick() {
        pb_mrec.setVisibility(View.VISIBLE);
        Appodeal.setMrecViewId(R.id.view_mrec);
        Appodeal.initialize(this, getString(R.string.sdk_key), Appodeal.MREC);
        Appodeal.setMrecCallbacks(new AdMrecCallbacks(pb_mrec));
        Appodeal.show(this, Appodeal.MREC);
    }

    @OnClick (R.id.btn_interstitial)
    void onInterstitialButtonClick() {
        pb_interstitial.setVisibility(View.VISIBLE);
        Appodeal.initialize(this, getString(R.string.sdk_key), Appodeal.INTERSTITIAL);
        Appodeal.setInterstitialCallbacks(new AdInterstitialCallbacks(pb_interstitial, this));
        Appodeal.show(this, Appodeal.INTERSTITIAL);
    }
}
