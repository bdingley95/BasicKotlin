package com.example.education;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class myDraw extends View {

    Canvas c;
    Bitmap bmp;
    public Paint paint;
    float oldX, oldY;
    int strokeWidth;
    int colour;

    public myDraw(Context context) {
        super(context);

        Bitmap.Config conf = Bitmap.Config.ARGB_8888;
        bmp = Bitmap.createBitmap (1440, 900, conf);

        paint = new Paint ();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(3);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);

        c = new Canvas (bmp);
        c.drawColor(Color.WHITE);


        this.setOnTouchListener (new OnTouchListener()
        {
            public boolean onTouch (View v, MotionEvent event)
            {
                int h, w, R, G, B, A;
                float x, y;


                x = event.getX ();
                y = event.getY ();

                switch (event.getAction() & MotionEvent.ACTION_MASK)
                {
                    case MotionEvent.ACTION_DOWN:

                        oldX = x;
                        oldY = y;
                        break;

                    case MotionEvent.ACTION_MOVE:

                        c.drawLine(oldX, oldY, x, y, paint);

                        oldX = x;
                        oldY = y;

                        break;
                }

                invalidate();

                return true;
            }
        });



    }

    public void setStrokeWidth(int strokeWidth) {
        paint.setStrokeWidth(strokeWidth);
        invalidate();
    }

    public void setColour(int colour) {
        paint.setColor(colour);
        invalidate();
    }

    public void reset() {
        bmp.eraseColor(Color.WHITE);
    }


    @Override
    protected void onDraw (Canvas c)
    {
        super.onDraw (c);
        c.drawBitmap (bmp, 0, 0, paint);
    }

}

