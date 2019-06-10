package com.wuyazhou.roundimage;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.wuyazhou.roundimage.RoundImage.RoundedImageView;


public class MainActivity extends Activity {

    private RoundedImageView mRoundedImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRoundedImageView = (RoundedImageView) findViewById(R.id.round_image);

        if (true){
            //设置边角弧度
            mRoundedImageView.setCornerRadius(20);
            //设置为圆形
            mRoundedImageView.setOval(true);

            if (true){
                //设置周围边框
                mRoundedImageView.setBorderWidth(R.dimen.tab_user_border_width);
                mRoundedImageView.setBorderColor(0xff00008b);
            }
            if (false) {
                //换图片啊
                //mRoundedImageView.setImageResource(R.color.clear);
            } else {
                //网络设置图片
                mRoundedImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        }else {
            if (true) {
                mRoundedImageView.setBorderColor(0xff00008b);
                mRoundedImageView.setBorderWidth(R.dimen.tab_user_border_width);
                mRoundedImageView.setOval(false);
                mRoundedImageView.setCornerRadius(0);
                mRoundedImageView.setImageResource(R.mipmap.ic_user_normal_s);
            } else {
                mRoundedImageView.setImageResource(R.mipmap.ic_user_normal_s);
            }
        }
    }
}
