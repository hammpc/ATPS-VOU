package nl.avans.mm.atps_assistent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		WebView webView = (WebView)findViewById(R.id.webView);
//you can load an html code
		//webView.loadData("yourCode Html to load on the webView " , "text/html" , "utf-8");
// you can load an URL
		webView.loadUrl("http://188.205.24.245/pctwa/login.aspx");

	}
}
