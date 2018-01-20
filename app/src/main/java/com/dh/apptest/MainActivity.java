package com.dh.apptest;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends Activity implements View.OnClickListener {
	//private EditText et_message;
	//private Button btn_send;
	static String TAG = "MainActivity";
	private ExecutorService executorService;
	private WebView web_view;
	private WebSettings webSettings;
	private WebSettings webSettings_jiexi;
	/** 视频全屏参数 */
	protected static final FrameLayout.LayoutParams COVER_SCREEN_PARAMS = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
	private View customView;
	private FrameLayout fullscreenContainer;
	private WebChromeClient.CustomViewCallback customViewCallback;
	private WebView web_view_jiexi;
	//String TAG = "MainActivity";
	String htmlData = "";
	String htmlData_jiexi = "";
	private TextView tv_text;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		et_message = (EditText) findViewById(R.id.et_message);
//		btn_send = (Button) findViewById(R.id.btn_send);
		//btn_send.setOnClickListener(this);
		web_view = (WebView) findViewById(R.id.web_view_tigan);
		web_view_jiexi = (WebView) findViewById(R.id.web_view_jiexi);
		tv_text = (TextView) findViewById(R.id.tv_test);
		initView();
		Log.i(TAG,"onCreate");
	}

	private void initView() {
		webSettings = web_view.getSettings();
		webSettings.setJavaScriptEnabled(true);
		webSettings.setUseWideViewPort(true); // 关键点
		webSettings.setAllowFileAccess(true); // 允许访问文件
		webSettings.setLoadWithOverviewMode(true);
		webSettings.setCacheMode(WebSettings.LOAD_NO_CACHE); // 不加载缓存内容
		//webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);


		webSettings_jiexi = web_view_jiexi.getSettings();
		webSettings_jiexi.setJavaScriptEnabled(true);
		webSettings_jiexi.setUseWideViewPort(true); // 关键点
		webSettings_jiexi.setAllowFileAccess(true); // 允许访问文件
		webSettings_jiexi.setLoadWithOverviewMode(true);
		webSettings_jiexi.setCacheMode(WebSettings.LOAD_NO_CACHE); // 不加载缓存内容
//		webSettings_jiexi.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
		//webSettings.setSupportZoom(true);
		//webSettings.setBuiltInZoomControls(true);
		//webSettings.setDisplayZoomControls(false);//不显示缩放控制条

		//设置不用系统浏览器打开,直接显示在当前Webview
		web_view.setWebViewClient(new WebViewClient() {
			@Override
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				view.loadUrl(url);
				return true;
			}
		});
		web_view_jiexi.setWebViewClient(new WebViewClient(){
			@Override
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				view.loadUrl(url);
				return true;
			}
		});
//		web_view.setWebChromeClient(new WebChromeClient(){
//
//			@Override
//			public View getVideoLoadingProgressView() {
//				FrameLayout frameLayout = new FrameLayout(MainActivity.this);
//				frameLayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
//				return frameLayout;
//			}
//
//			@Override
//			public void onShowCustomView(View view, CustomViewCallback callback) {
//				super.onShowCustomView(view,callback);
//				// if a view already exists then immediately terminate the new one
//				if (customView != null) {
//					callback.onCustomViewHidden();
//					return;
//				}
//				if(getRequestedOrientation()!= ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE){
//					MainActivity.this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
//				}
//				view.setBackgroundColor(MainActivity.this.getResources().getColor(android.R.color.black));
//
//				FrameLayout decor = (FrameLayout) getWindow().getDecorView();
//				fullscreenContainer = new FrameLayout(MainActivity.this);
//				fullscreenContainer.addView(view, COVER_SCREEN_PARAMS);
//				decor.addView(fullscreenContainer, COVER_SCREEN_PARAMS);
//
//
//				MainActivity.this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//						WindowManager.LayoutParams.FLAG_FULLSCREEN);
//
//				//view.getParent()
//				//fullscreenContainer.getContext()
//				if(getRequestedOrientation()!= ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE){
//					MainActivity.this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
//				}
//				customView = view;
//				setStatusBarVisibility(false);
//				customViewCallback = callback;
//
//			}
//
//			@Override
//			public void onHideCustomView() {
//				super.onHideCustomView();
//				hideCustomView();
//			}
//		});
		//web_view.loadUrl("http://www.study119.com/show-18-2-1.html");
		htmlData="<style type=\"text/css\">\n" +
				"body {font-family:sans-serif;letter-spacing: 10px;line-height: 150%;font-size: 46px; padding:0 3%; text-align:justify}\n" +
				"img {width:100%}" +
				"</style>" +
				"<p><img style=\"width: 150px;\\height: 50px\" src=\"file:///android_asset/主观题.png\" data-filename=\"filename\">"+
				decode("dm\u00b2")+
				" dm\\u00b23. 某公共建筑，建筑高度60m，设置有三部防烟楼梯间，其中两部防烟楼梯间A和B设置有独立前室，其前室加压送风口设置在正对前室入口的墙面上，楼梯间采用自然通风排烟方式；剩余一部防烟楼梯间C，其前室与消防电梯前室共用，并用敞开式凹廊作为前室，楼梯间内未设置排烟系统。该建筑的排烟口和吸风口均设计于楼顶，水平间隔3m，防烟风机和送风风机各自设置在独立的设备用房内，采用耐火极限为2.00h的防火隔墙和1.00h的楼板及乙级防火门与其他部位分隔。</p>\n" +
				"\n" +
				"\n" +
				"<img src=\"http://fire.mcykj.com/uploads/20180108/d5c25f4640436124aaea524e76ae1e0c.jpg\" data-filename=\"filename\">\n" +
				"<img src=\"http://fire.mcykj.com/uploads/20180103/c4f29fb1c66eb40a1b184f578189810f.jpg\" data-filename=\"filename\">"+
				"<img src=\"file:///android_asset/案例分析2015年真题第一题解析01.png\" data-filename=\"filename\">"+
				"<p>&nbsp;&nbsp;&nbsp;&nbsp;该建筑采用排烟和通风合用系统，其排烟系统逻辑设计为：由同一防烟分区内两只独立</p>\n" +
				"\n" +
				"<p>的火灾探测器报警信号作为联动触发信号，由消防联动控制器联动控制排烟口、排烟阀、排</p>\n" +
				"\n" +
				"<p>烟风机的启动，同时停止该防烟分区的空气调节系统；其挡烟垂壁设计为位于电动挡烟垂壁附近一只感温探测器加一只感烟探测器作为挡烟垂壁的联动触发信号，由消防联动控制器联动控制电动挡烟垂壁的降落。</p>\n" +
				"\n" +
				"<p>根据以上材料，回答下列问题:</p>\n" +
				"\n" +
				"<p style=\"margin-left:18pt;\">1．&nbsp;该建筑前室和防烟楼梯间防烟设施设置是否合理。如不合理，提出相应改进措施。</p>\n" +
				"\n" +
				"<p style=\"margin-left:18pt;\">2．&nbsp;指出防烟系统风口和风机设置中的问题。</p>\n" +
				"\n" +
				"<p style=\"margin-left:18pt;\">3．&nbsp;指出排烟系统和挡烟垂壁逻辑设计中存在的问题。</p>\n";
		htmlData_jiexi = "3. 某公共建筑，建筑高度60m，设置有三部防烟楼梯间，其中两部防烟楼梯间A和B设置有独立前室，";
		//web_view.loadDataWithBaseURL("",htmlData_jiexi,"text/html", "utf-8",null);
		web_view.loadUrl("http://www.study119.com/wap/list_zhuce.php");
		web_view_jiexi.loadDataWithBaseURL("",decode(htmlData),"text/html","",null);
		tv_text.setText(decode("dm\u300a2, \u2264"));
	}

	@Override
	public void onClick(View v) {

	}
	void TreadManage()
	{
		//int core_size = Runtime.getRuntime().availableProcessors();
		executorService = Executors.newFixedThreadPool(1);
		Runnable syncRunnable = new Runnable() {
			@Override
			public void run() {
				Log.e(TAG,Thread.currentThread().getName());
			}
		};
		executorService.execute(syncRunnable);
		//BlockingQueue<Runnable>
	}

	@Override
	protected void onDestroy() {
		if (web_view != null) {
			web_view.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
			web_view.clearHistory();

			((ViewGroup) web_view.getParent()).removeView(web_view);
			web_view.destroy();
			web_view = null;
		}
		super.onDestroy();
	}

	/** 全屏容器界面 */
	static class FullscreenHolder extends FrameLayout {

		public FullscreenHolder(Context ctx) {
			super(ctx);
			setBackgroundColor(ctx.getResources().getColor(android.R.color.black));
		}

		@Override
		public boolean onTouchEvent(MotionEvent evt) {
			return true;
		}
	}

	private void setStatusBarVisibility(boolean visible) {
		int flag = visible ? 0 : WindowManager.LayoutParams.FLAG_FULLSCREEN;
		getWindow().setFlags(flag, WindowManager.LayoutParams.FLAG_FULLSCREEN);
	}

	@Override
	public boolean onKeyUp(int keyCode, KeyEvent event) {
		switch (keyCode) {
			case KeyEvent.KEYCODE_BACK:
				/** 回退键 事件处理 优先级:视频播放全屏-网页回退-关闭页面 */
				if (customView != null) {
					hideCustomView();
				} else if (web_view.canGoBack()) {
					web_view.goBack();
				} else {
					finish();
				}
				return true;
			default:
				return super.onKeyUp(keyCode, event);
		}
	}

	private void hideCustomView() {
		if (customView == null) {
			return;
		}
		if(getRequestedOrientation()!= ActivityInfo.SCREEN_ORIENTATION_PORTRAIT){
			MainActivity.this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		}
		customView = null;
		setStatusBarVisibility(true);
		FrameLayout decor = (FrameLayout) getWindow().getDecorView();
		decor.removeView(fullscreenContainer);
		fullscreenContainer = null;
		customView = null;
		customViewCallback.onCustomViewHidden();
		web_view.setVisibility(View.VISIBLE);
	}

	public void fullScreen(){

	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
		{
			//land
			Toast.makeText(this,"横屏了",Toast.LENGTH_LONG).show();
		}
		else if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
		{
			//port
			Toast.makeText(this,"竖屏了",Toast.LENGTH_LONG).show();
		}
	}

	public static String decode(String unicodeStr) {
		if (unicodeStr == null) {
			return null;
		}
		StringBuffer retBuf = new StringBuffer();
		int maxLoop = unicodeStr.length();
		for (int i = 0; i < maxLoop; i++) {
			if (unicodeStr.charAt(i) == '\\') {
				if ((i < maxLoop - 5) && ((unicodeStr.charAt(i + 1) == 'u') || (unicodeStr.charAt(i + 1) == 'U')))
					try {
						retBuf.append((char) Integer.parseInt(unicodeStr.substring(i + 2, i + 6), 16));
						i += 5;
					} catch (NumberFormatException localNumberFormatException) {
						retBuf.append(unicodeStr.charAt(i));
					}
				else
					retBuf.append(unicodeStr.charAt(i));
			} else {
				retBuf.append(unicodeStr.charAt(i));
			}
		}
		return retBuf.toString();
	}
}
