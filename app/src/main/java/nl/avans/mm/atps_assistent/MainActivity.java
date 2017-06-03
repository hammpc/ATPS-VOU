package nl.avans.mm.atps_assistent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
	
	public final String GlobalUrl = "http://188.205.24.245/pctwa/login.aspx";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		WebView webView = (WebView)findViewById(R.id.webView);
		loadWebViewLoad(webView);
	}
	
	private void loadWebViewLoad(WebView webview) {
		webview.getSettings().setJavaScriptEnabled(true);
		webview.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
		webview.getSettings().setSupportMultipleWindows(true);
		webview.setWebViewClient(new WebViewClient());
		webview.setWebChromeClient(new WebChromeClient());
		webview.loadUrl(GlobalUrl);
	}
}
