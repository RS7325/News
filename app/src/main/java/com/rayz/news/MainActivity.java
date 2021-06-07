package com.rayz.news;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {
    private RecyclerView mrv;
    private String url="http://c.m.163.com/nc/article/headline/T1348647853363/0-40.html";
    private MyAdapter md;
    private OKHttp http;
    private ArrayList<Bean.Data> mlist=new ArrayList<>();
    @SuppressLint("HandlerLeak")
    public Handler hand=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what==1){
                Gson gson=new Gson();
                Bean bean = gson.fromJson(msg.obj.toString(), Bean.class);
                // mlist=(ArrayList<NewsData.DataBean>) newsData.getData();
                mlist=(ArrayList<Bean.Data>) bean.getData();
                md.setdata((ArrayList<Bean.Data>) mlist);
                md.notifyDataSetChanged();

            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mrv=(RecyclerView)findViewById(R.id.recy);
        initdata();
        mrv.setLayoutManager(new LinearLayoutManager(this));
        md=new MyAdapter(this,mlist);
        mrv.setAdapter(md);

        //RecyclerView条目的点击事件
        md.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int postion) {
                Toast.makeText(MainActivity.this, mlist.get(postion).getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void initdata() {
        OKHttp http=new OKHttp();
        http.getdata(url, this);
    }
    public void callback(String str) {
        Message msg = Message.obtain();
        msg.what=1;
        msg.obj=str;
        hand.sendMessage(msg);

    }
    public void err(int code, String s) {

    }
}
