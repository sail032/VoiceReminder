package com.sail.voicereminder.ui;

import com.sail.voicereminder.R;
import com.sail.voicereminder.adapter.MyRecordAdapter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;


public class MainVoiceReminderActivity extends Activity implements OnClickListener {

    private ImageView ivMenu;
    private TextView tvClassify;
    private ImageView ivSearch;
    private ImageView ivAddNewReminder;
    private ListView lvRecord;
    private MyRecordAdapter myRecordAdapter;
    
    private void findViews() {
        ivMenu = (ImageView)findViewById( R.id.iv_menu );
        tvClassify = (TextView)findViewById( R.id.tv_classify );
        ivSearch = (ImageView)findViewById( R.id.iv_search );
        ivAddNewReminder = (ImageView)findViewById( R.id.iv_add_new_reminder );
        lvRecord = (ListView)findViewById( R.id.listView1 );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main_voice_reminder);
        
        findViews();
        //设置按钮监听
        ivAddNewReminder.setOnClickListener(this);
        ivSearch.setOnClickListener(this);
        //设置 listview 适配器
        myRecordAdapter = new MyRecordAdapter(this);
        lvRecord.setAdapter(myRecordAdapter);
    }

    @Override
    public void onClick(View v) {
        if(v == ivAddNewReminder){
            Intent addIntent = new Intent(MainVoiceReminderActivity.this, AddNewReminderActivity.class);
            startActivity(addIntent);
        }
    }

}