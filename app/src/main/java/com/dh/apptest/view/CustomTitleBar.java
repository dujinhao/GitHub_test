package com.dh.apptest.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dh.apptest.R;

import java.util.Random;

/**
 * Created by Administrator on 2018/1/18.
 */

public class CustomTitleBar extends LinearLayout {
	private Color paintColor;

//	public void setPaintColor(int paintColor) {
//		//this.paintColor = paintColor;
//		paint = new Paint();
//		paint.setColor(paintColor);
//		//paint.setColor(Color.GRAY);
//		paint.setAntiAlias(true);
//		paint.setStrokeWidth(5.0f);
//		invalidate();
//	}

	public void setText_classify(String title)
	{
		tv_classifyi.setText(title);
	}

	public void setText_num_ques(String title)
	{
		tv_num_ques.setText(title);
	}

	private TextView tv_classifyi;
	private TextView tv_num_ques;

	private Paint paint;

	public CustomTitleBar(Context context, AttributeSet attrs) {
		super(context, attrs);
		paint = new Paint();
		LayoutInflater.from(context).inflate(R.layout.activity_classify, this, true);

		tv_classifyi = (TextView) findViewById(R.id.tv_classifyname);
		tv_num_ques = (TextView) findViewById(R.id.tv_questions_num);

		//TypedArray attributes = context.obtainStyledAttributes(attrs, R.styleable.CustomTitleBar);
		//if (attributes != null) {
			//设置左边按钮的文字
//			String leftText = attributes.getString(R.styleable.CustomTitleBar_title_classify);
//			String rightText = attributes.getString(R.styleable.CustomTitleBar_title_num_ques);
//			tv_classifyi.setText(leftText);
//			tv_num_ques.setText(rightText);
			//attributes.recycle();
		//}
	}


	@Override
	protected void dispatchDraw(Canvas canvas) {
		super.dispatchDraw(canvas);
		//Paint paint = new Paint();
		myCanvasDraw(paint,canvas);
	}

	private void myCanvasDraw(Paint paint,Canvas canvas)
	{
		paint.setColor(getRandColorCode());
		paint.setAntiAlias(true);
		paint.setStrokeWidth(5.0f);
		canvas.drawLine(0, 0, this.getWidth(), 0, paint);
		canvas.drawLine(0, this.getHeight()-2, this.getWidth(), this.getHeight(), paint);
		canvas.drawLine(0, 0, 0, this.getHeight(), paint);
		canvas.drawLine(this.getWidth(), 0, this.getWidth(), this.getHeight(), paint);
	}

	/**
	 * 获取十六进制的颜色代码.例如  "#6E36B4" , For HTML ,
	 * @return String
	 */
	public static int getRandColorCode(){
		Random random = new Random();
		int r = random.nextInt(256)%(256-50+1) + 50;
		int g = random.nextInt(256)%(256-50+1) + 50;
		int b = random.nextInt(256)%(256-50+1) + 50;
		return Color.rgb(r,g,b);
	}
}