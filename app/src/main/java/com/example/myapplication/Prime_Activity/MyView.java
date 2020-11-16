package com.example.myapplication.Prime_Activity;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;

import com.example.myapplication.R;

public class MyView extends View {
    public MyView(Context context, AttributeSet attr) {
        super(context, attr);
    }


    public void onDraw(Canvas canvas){
        Paint paint = new Paint();
        paint.setStrokeWidth(5f);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);

        Matrix matrix = new Matrix();
        matrix.preScale(2.5f, 2.5f);




        canvas.drawPoint(500,200,paint);


        canvas.drawLine(0,0,360,640,paint);

        Resources r = getResources();
        BitmapDrawable bitmapDrawable = (BitmapDrawable)r.getDrawable(R.drawable.prime_3f);

        Bitmap bitmap = bitmapDrawable.getBitmap();
        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);

        canvas.drawBitmap(bitmap, 0, 0, paint);

    }
}