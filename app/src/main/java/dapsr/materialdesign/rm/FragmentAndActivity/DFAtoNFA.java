package dapsr.materialdesign.rm.FragmentAndActivity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import dapsr.materialdesign.rm.R;

/**
 * Created by rajanmaurya on 21/4/15.
 */
public class DFAtoNFA extends ActionBarActivity{

    public static Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dfatonfa);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setTitle("RE TO NFA");

        final WebView webview = (WebView) findViewById(R.id.webview);

        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url)
            {
                webview.loadUrl("javascript:(function() { " +
                        "document.getElementsById('primary').style.display=\"none\"; " +
                        "})()");
            }
        });
        webview.loadUrl("http://hackingoff.com/compilers/nfa-to-dfa-conversion");
    }
}
