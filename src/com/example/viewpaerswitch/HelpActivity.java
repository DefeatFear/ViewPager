package com.example.viewpaerswitch;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.example.viewpaerswitch.ViewPagerAdapter;

/**
 * 
 * @{# GuideActivity.java Create on 2013-5-2 涓??10:59:08
 * 
 *     class desc: 寮?????
 * 
 *     <p>
 *     Copyright: Copyright(c) 2013
 *     </p>
 * @Version 1.0
 * @Author <a href="mailto:gaolei_xj@163.com">Leo</a>
 * 
 * 
 */
public class HelpActivity extends Activity implements OnPageChangeListener {

	private ViewPager vp;
	private ViewPagerAdapter vpAdapter;
	private List<View> views;

	// 搴??灏???剧?
	private ImageView[] dots;

	// 璁板?褰????腑浣?疆
	private int currentIndex;
	private CirclePageIndicator mIndicator;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// ?????〉??
		initViews();

		// ???????ㄥ???
//		initDots();
	}

	private void initViews() {
		LayoutInflater inflater = LayoutInflater.from(this);

		views = new ArrayList<View>();
		// ??????瀵煎????琛?
		
		views.add(inflater.inflate(R.layout.what_new_two, null));
		views.add(inflater.inflate(R.layout.what_new_three, null));
		views.add(inflater.inflate(R.layout.what_new_five, null));
		views.add(inflater.inflate(R.layout.what_new_six, null));

		// ?????dapter
		vpAdapter = new ViewPagerAdapter(views, this);
		
		vp = (ViewPager) findViewById(R.id.pager);
		vp.setAdapter(vpAdapter);
		// 缁?????
		vp.setOnPageChangeListener(this);
		
		CirclePageIndicator indicator = (CirclePageIndicator)findViewById(R.id.circle);
	     mIndicator = indicator;
	     indicator.setViewPager(vp);
	     indicator.setSnap(true);
	}

//	private void initDots() {
//		LinearLayout ll = (LinearLayout) findViewById(R.id.ll);
//
//		dots = new ImageView[views.size()+1];
//        
//		// 寰?????灏???剧?
//		for (int i = 0; i < views.size(); i++) {
//			dots[i] = (ImageView) ll.getChildAt(i);
//			dots[i].setEnabled(true);// ?借?涓虹???
//		}
//
//		currentIndex = 0;
//		dots[currentIndex].setEnabled(false);// 璁剧疆涓虹??诧??抽?涓????
//	}
//
//	private void setCurrentDot(int position) {
//		if (position < 0 || position > views.size() - 1
//				|| currentIndex == position) {
//			return;
//		}
//
//		dots[position].setEnabled(false);
//		dots[currentIndex].setEnabled(true);
//
//		currentIndex = position;
//	}

	// 褰???ㄧ???????璋??
	@Override
	public void onPageScrollStateChanged(int arg0) {
	}

	// 褰????〉?㈣?婊???惰???
	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
	}

	// 褰????〉?㈣???腑?惰???
	@Override
	public void onPageSelected(int arg0) {
		// 璁剧疆搴??灏????腑?舵?
//		setCurrentDot(arg0);
	}

}
