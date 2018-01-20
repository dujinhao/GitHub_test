package com.dh.apptest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dh.apptest.view.CustomTitleBar;

import java.util.ArrayList;
import java.util.List;

public class ClassifyActivity extends AppCompatActivity {

	private RecyclerView mRecyclerView;
	private List<String> mDatas;
	private HomeAdapter mAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rclayout);
//		CustomTitleBar ct_text = (CustomTitleBar) findViewById(R.id.ct_text);
//		//ct_text.setPaintColor(Color.argb(255,250,0,0));
//		ct_text.setText_classify("原理题");
//		ct_text.setText_num_ques("5000题");
		initData();
		initDasss();
		mRecyclerView = (RecyclerView) findViewById(R.id.rc);
		mRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
		mRecyclerView.setAdapter(mAdapter = new HomeAdapter());
	}

	private void initDasss() {
	}

	private void initData() {
		mDatas = new ArrayList<String>();
		for (int i = 'A'; i < 'z'; i++)
		{
			mDatas.add("" + (char) i);
		}
		mDatas.add("2000题");
		mDatas.add("主观题");
	}

	class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder>
	{

		@Override
		public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
		{
			MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
					ClassifyActivity.this).inflate(R.layout.activity_classify1, parent,
					false));
			return holder;
		}

		@Override
		public void onBindViewHolder(MyViewHolder holder, int position)
		{
			//holder.tv.setText(mDatas.get(position));
			holder.customt.setText_classify(mDatas.get(position));
			holder.customt.setText_num_ques(mDatas.get(position));
		}

		@Override
		public int getItemCount()
		{
			return mDatas.size();
		}

		class MyViewHolder extends RecyclerView.ViewHolder
		{

			//TextView tv;
			//TextView tv_num;
			CustomTitleBar customt;
			public MyViewHolder(View view)
			{
				super(view);
				customt = (CustomTitleBar) view.findViewById(R.id.ct_text);
				//tv_num = (TextView) view.findViewById(R.id.tv_questions_num;
			}
		}
	}

}
