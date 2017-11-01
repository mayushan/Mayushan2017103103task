package com.example.com.mayushan2017103103task.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.example.com.mayushan2017103103task.R;

/**
 * Created by 怪胎 on 2017/10/31.
 */

public class MyView extends View {
    private Paint paint;
    private Bitmap bitmap;
    private int resourceId = 0;
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        paint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        paint.setColor(Color.parseColor("#ADADAD"));
        paint.setStrokeWidth(10);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(300,300,200,paint);

        paint.setColor(Color.parseColor("#F0F0F0"));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(300,300,200,paint);

        paint.setColor(Color.parseColor("#00EC00"));
        paint.setStrokeWidth(3);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(300,300,70,paint);

        paint.setColor(Color.parseColor("#FFFFFF"));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(300,300,70,paint);

        paint.setStrokeWidth(0);
        paint.setColor(Color.GREEN);
        paint.setTextSize(40);
        canvas.drawText("OK", 278, 318, paint);
        resourceId = R.mipmap.ic_launcher;
        bitmap = BitmapFactory.decodeResource(getResources(), resourceId);
        canvas.drawBitmap(bitmap, 150, 270, null);
        canvas.drawBitmap(bitmap, 390, 270, null);
        canvas.drawBitmap(bitmap, 270, 150, null);
        canvas.drawBitmap(bitmap, 270, 390, null);
    }
}
