package com.launchoptions;

import android.os.Bundle;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.shell.MainReactPackage;

public class MainActivity extends ReactActivity {

    private ReactRootView mReactRootView;

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "LaunchOptions";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mReactRootView = new ReactRootView(this);
        ReactInstanceManager mReactInstanceManager = ReactInstanceManager.builder().setApplication(getApplication())
                .setJSBundleFile("/sdcard/Download/lo.jsbundle")
                .addPackage(new MainReactPackage())
                .setUseDeveloperSupport(false)
                .setInitialLifecycleState(LifecycleState.RESUMED)
                .build();

        Bundle initialProps = new Bundle();
        initialProps.putString("text", "haha");
        mReactRootView.startReactApplication(mReactInstanceManager, "LaunchOptions", initialProps);
        setContentView(mReactRootView);
    }
}