package com.footballanalysis.app;
import android.app.Activity; import android.os.Bundle; import android.webkit.*; import android.view.ViewGroup;
public class MainActivity extends Activity {
 WebView w;
 public void onCreate(Bundle b){super.onCreate(b); w=new WebView(this); w.setLayoutParams(new ViewGroup.LayoutParams(-1,-1)); WebSettings s=w.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setDatabaseEnabled(true); s.setAllowFileAccess(true); s.setAllowContentAccess(true); w.setWebViewClient(new WebViewClient()); w.setWebChromeClient(new WebChromeClient()); setContentView(w); w.loadUrl("file:///android_asset/index.html");}
 @Override public void onBackPressed(){if(w.canGoBack())w.goBack();else super.onBackPressed();}
}