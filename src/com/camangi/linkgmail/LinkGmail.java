package com.camangi.linkgmail;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class LinkGmail extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        Uri uri = Uri.parse(getString(R.string.link_page));
		Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		startActivity(intent);
		finish();
    }
}