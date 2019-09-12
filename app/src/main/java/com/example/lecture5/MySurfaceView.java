package com.example.lecture5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class MySurfaceView extends SurfaceView
{
    public MySurfaceView(Context context, AttributeSet attrs) //constructor
    {
        super(context, attrs);
        //tell the surfaceView to not NOT draw
        setWillNotDraw(false);
    }

    public void onDraw(Canvas canvas)
    {
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(5.0f);

        canvas.drawRect(20,20,500,200,paint);

        Bitmap rubberDuck = BitmapFactory.decodeResource((getResources()), R.drawable.rubber_duck);
        canvas.drawBitmap(rubberDuck,100,10,null);

    }
}
