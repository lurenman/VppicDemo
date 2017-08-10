package com.example.administrator.vppicdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
// "http://img.huayuewy.com/Estate/Reservation/Image/2017/07/13/File/20170713080638280A34877A940357417D8105C556E67D05B2.jpg?ut=20170713120549",
//         "http://img.huayuewy.com/Estate/Reservation/Image/2017/07/13/File/20170713080638740A4E0A34BB454944B48869957B4165F0A9.jpg?ut=20170713120549",
//         "http://img.huayuewy.com/Estate/Reservation/Image/2017/07/13/File/20170713080639393A9BF4F2751214447FA7869022233919AC.jpg?ut=20170713120549",
//         "http://img.huayuewy.com/Estate/Reservation/Image/2017/07/13/File/20170713080640003A566CCDBB40ED47FFBB8EAACAC64AD02E.jpg?ut=20170713120549",
//         "http://img.huayuewy.com/Estate/Reservation/Image/2017/07/13/File/20170713080640780A58693FD0F75242729D2DFFA88CB16F00.jpg?ut=20170713120549",
//         "http://img.huayuewy.com/Estate/Reservation/Image/2017/07/13/File/20170713080641547A251575DDC9B447359194BDF379202819.jpg?ut=20170713120549"

public class MainActivity extends AppCompatActivity
{
    private TextView tv_click;
    private ArrayList<String> urls2=new ArrayList<String>();//图片的集合
    private int index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initVariables();
        initViews();
    }

    private void initVariables()
    {
        //获取图片数据集合
        urls2.add("http://img.huayuewy.com/Estate/Reservation/Image/2017/07/13/File/20170713080638280A34877A940357417D8105C556E67D05B2.jpg?ut=20170713120549");
        urls2.add("http://img.huayuewy.com/Estate/Reservation/Image/2017/07/13/File/20170713080638740A4E0A34BB454944B48869957B4165F0A9.jpg?ut=20170713120549");
        urls2.add("http://img.huayuewy.com/Estate/Reservation/Image/2017/07/13/File/20170713080639393A9BF4F2751214447FA7869022233919AC.jpg?ut=20170713120549");
        urls2.add("http://img.huayuewy.com/Estate/Reservation/Image/2017/07/13/File/20170713080640003A566CCDBB40ED47FFBB8EAACAC64AD02E.jpg?ut=20170713120549");
        urls2.add("http://img.huayuewy.com/Estate/Reservation/Image/2017/07/13/File/20170713080640780A58693FD0F75242729D2DFFA88CB16F00.jpg?ut=20170713120549");
    }

    private void initViews()
    {
        tv_click= (TextView) findViewById(R.id.tv_click);
        tv_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                //这块把点击图片的位置及图片数组传过去
                if (urls2!=null&&!urls2.isEmpty())
                {
                    Intent intent = new Intent(MainActivity.this, ImagePagerActivity.class);
                    intent.putExtra(ImagePagerActivity.EXTRA_IMAGE_URLS, urls2);
                    intent.putExtra(ImagePagerActivity.EXTRA_IMAGE_INDEX, index);
                    MainActivity.this.startActivity(intent);
                }
            }
        });
    }
}
