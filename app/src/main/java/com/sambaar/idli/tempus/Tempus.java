package com.sambaar.idli.tempus;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;

/**
 * Created by binitshah on 11/5/17.
 */

public class Tempus extends View {

    // android stuffs
    private Context context;
    private final String TAG = "IDLIAPP";

    // stuff about dates
    private int numDisplayDays;
    private float headerHeight;
    private float widthPerDay;

    // drawing!
    private Paint headerDaysTextPaint;
    private Paint headerNumsTextPaint;

    public Tempus(Context context) {
        this(context, null);
    }

    public Tempus(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public Tempus(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);

        this.context = context;
        setup();
    }

    private void setup() {
        this.numDisplayDays = 7; // the whole week pls
        this.headerHeight = 32; // guessing that a default height of 32dp would be alright
        this.widthPerDay = getRuntimeWidth() / numDisplayDays;

        headerDaysTextPaint = new Paint();
        headerDaysTextPaint.setTextAlign(Paint.Align.CENTER);
        headerDaysTextPaint.setTextSize(120); // 32sp font
        headerDaysTextPaint.setTypeface(Typeface.DEFAULT);
        headerDaysTextPaint.setColor(Color.DKGRAY);

        headerNumsTextPaint = new Paint();
        headerNumsTextPaint.setTextAlign(Paint.Align.CENTER);
        headerNumsTextPaint.setTextSize(40);
        headerNumsTextPaint.setTypeface(Typeface.DEFAULT_BOLD);
        headerNumsTextPaint.setColor(Color.DKGRAY);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawHeader(canvas);
    }

    @Override
    public void invalidate() {
        super.invalidate();
    }

    private void drawHeader(Canvas canvas) {
        int offset = 60;
        int daysTopOffset = 120;
        canvas.drawText("S", widthPerDay*0 + offset, daysTopOffset, headerDaysTextPaint);
        canvas.drawText("M", widthPerDay*1 + offset, daysTopOffset, headerDaysTextPaint);
        canvas.drawText("T", widthPerDay*2 + offset, daysTopOffset, headerDaysTextPaint);
        canvas.drawText("W", widthPerDay*3 + offset, daysTopOffset, headerDaysTextPaint);
        canvas.drawText("T", widthPerDay*4 + offset, daysTopOffset, headerDaysTextPaint);
        canvas.drawText("F", widthPerDay*5 + offset, daysTopOffset, headerDaysTextPaint);
        canvas.drawText("S", widthPerDay*6 + offset, daysTopOffset, headerDaysTextPaint);

        int numOffset = 120;
        int numTopOffset = 150;
        for (int i = 0; i < widthPerDay; i++) {
            int start = 20;
            int realDate = start + i;
            String message = realDate + "";
            canvas.drawText(message, widthPerDay*i + numOffset, numTopOffset, headerNumsTextPaint);
        }
    }

    private int getRuntimeWidth() {
        if (this.context == null) {
            return 540;
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.widthPixels;
        }
    }

    private int getRuntimeHeight() {
        if (this.context == null) {
            return 1080;
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.heightPixels;
        }
    }
}
