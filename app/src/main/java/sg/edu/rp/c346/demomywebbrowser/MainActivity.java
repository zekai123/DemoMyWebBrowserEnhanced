package sg.edu.rp.c346.demomywebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button btnloadURL;
WebView wvMypage;
EditText editxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnloadURL=findViewById(R.id.buttonLoad);
        wvMypage=findViewById(R.id.WebViewMypage);
        editxt=findViewById(R.id.editTexturl);
        wvMypage.setWebChromeClient(new WebChromeClient());
        wvMypage.getSettings().setJavaScriptEnabled(true);
        wvMypage.getSettings().setAllowFileAccess(false);
        wvMypage.getSettings().setBuiltInZoomControls(true);

        btnloadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url =editxt.getText().toString();
                editxt.setVisibility(View.GONE);
                wvMypage.loadUrl(url);

            }
        });
    }
}
