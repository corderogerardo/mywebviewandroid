package com.example.gerardo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import im.delight.android.webview.AdvancedWebView;

public class MainActivity extends AppCompatActivity {

    AdvancedWebView miWebView;
    //WebView miWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        miWebView = (AdvancedWebView) findViewById(R.id.wv);
        miWebView.loadUrl("http://172.10.0.95:4200/app?data=ceb874b74455b025bf5c0fb7850e76a5a20cca793754dd6f82cb4fdef5687b467447f00aaa766995179497997d16e77e3226ae7d19970b0b327c7f9d769fb4a0365a74bc20c35bfeddc33ea87a2723ad497d4d93863c8f60a777aa728f21fc93d93e692a135e7ddbb1a0f0d9d315380ef19fed8ad43700a616b308bed7a2ded2b445870dd0de124d0bdc98a21e34f7f4b561da9dd5ca1664fdff4cb37f0c935a0cd0737e9a2bf4abd7c7475d6e5b733a7da6d7142d5864102a123616df89468d639f8e900f377117634324c94a5b5f6dc803b23540f8715a101663ae119388ef9952a2fcb2d78f0ece36816fd31d26bed9eea7e051a6a1cf6fdba554b6ddaad914e1f4df2747810b601cc0918aa97b6f07cb60b765672cec8721ca40fbe22765ace6ff63846e0e967640d3fb6926f2effd2bb4b4c7f47aa25afda9eac07cfd3fdb861fbf18fc407deefed79c8a4a4b656ce3d4007d39386a392fec3b225c2946da35e81bd0b22e865c9637ae9fbdb9d90ec4f95617260eefb6d422bdaee1a6c191227268315e796440bb21dc5d2e4c7861caa65bf36332f52e076feaa14a85dcbf295c9ab9a7cb6b3872dcdef1d3c2fd9d039fbee256d26cda14c456fd8a8fcef5c20bc3f494c2ecd47eccd3740f9a9d");
        //miWebView.loadUrl("https://google.com");

//        miWebView = (WebView) findViewById(R.id.wv);
//        miWebView.setWebViewClient(new WebViewClient());
//        miWebView.setWebChromeClient(new WebChromeClient());



//        WebSettings settings = miWebView.getSettings();
//        settings.setJavaScriptCanOpenWindowsAutomatically(true);
//        settings.setDefaultTextEncodingName("utf-8");
//        settings.setJavaScriptEnabled(true);
//        settings.setAllowUniversalAccessFromFileURLs(false);
//        settings.setDomStorageEnabled(true);
//        settings.setAppCacheEnabled(false);
//        settings.setAllowFileAccess(true);
//        settings.setDatabaseEnabled(false);
        //miWebView.loadUrl("https://172.10.0.95:4200/app?data=ceb874b74455b025bf5c0fb7850e76a5a20cca793754dd6f82cb4fdef5687b467447f00aaa766995179497997d16e77e3226ae7d19970b0b327c7f9d769fb4a0365a74bc20c35bfeddc33ea87a2723ad497d4d93863c8f60a777aa728f21fc93d93e692a135e7ddbb1a0f0d9d315380ef19fed8ad43700a616b308bed7a2ded2b445870dd0de124d0bdc98a21e34f7f4b561da9dd5ca1664fdff4cb37f0c935a0cd0737e9a2bf4abd7c7475d6e5b733a7da6d7142d5864102a123616df89468d639f8e900f377117634324c94a5b5f6dc803b23540f8715a101663ae119388ef9952a2fcb2d78f0ece36816fd31d26bed9eea7e051a6a1cf6fdba554b6ddaad914e1f4df2747810b601cc0918aa97b6f07cb60b765672cec8721ca40fbe22765ace6ff63846e0e967640d3fb6926f2effd2bb4b4c7f47aa25afda9eac07cfd3fdb861fbf18fc407deefed79c8a4a4b656ce3d4007d39386a392fec3b225c2946da35e81bd0b22e865c9637ae9fbdb9d90ec4f95617260eefb6d422bdaee1a6c191227268315e796440bb21dc5d2e4c7861caa65bf36332f52e076feaa14a85dcbf295c9ab9a7cb6b3872dcdef1d3c2fd9d039fbee256d26cda14c456fd8a8fcef5c20bc3f494c2ecd47eccd3740f9a9d");
//      //miWebView.loadUrl("http://techslides.com/demos/samples/sample.webm");
        //miWebView.loadUrl("http://172.10.0.95:4200/app?data=ceb874b74455b025bf5c0fb7850e76a5a20cca793754dd6f82cb4fdef5687b467447f00aaa766995179497997d16e77e3226ae7d19970b0b327c7f9d769fb4a0365a74bc20c35bfeddc33ea87a2723ad497d4d93863c8f60a777aa728f21fc93d93e692a135e7ddbb1a0f0d9d315380ef19fed8ad43700a616b308bed7a2ded2b445870dd0de124d0bdc98a21e34f7f4b561da9dd5ca1664fdff4cb37f0c935a0cd0737e9a2bf4abd7c7475d6e5b733a7da6d7142d5864102a123616df89468d639f8e900f377117634324c94a5b5f6dc803b23540f8715a101663ae119388ef9952a2fcb2d78f0ece36816fd31d26bed9eea7e051a6a1cf6fdba554b6ddaad914e1f4df2747810b601cc0918aa97b6f07cb60b765672cec8721ca40fbe22765ace6ff63846e0e967640d3fb6926f2effd2bb4b4c7f47aa25afda9eac07cfd3fdb861fbf18fc407deefed79c8a4a4b656ce3d4007d39386a392fec3b225c2946da35e81bd0b22e865c9637ae9fbdb9d90ec4f95617260eefb6d422bdaee1a6c191227268315e796440bb21dc5d2e4c7861caa65bf36332f52e076feaa14a85dcbf295c9ab9a7cb6b3872dcdef1d3c2fd9d039fbee256d26cda14c456fd8a8fcef5c20bc3f494c2ecd47eccd3740f9a9d");

    }
}
