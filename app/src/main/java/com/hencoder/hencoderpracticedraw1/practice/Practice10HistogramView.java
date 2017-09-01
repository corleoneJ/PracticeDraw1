package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    Paint paint = new Paint();
    Path path = new Path();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        // 画坐标系
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(2);
        canvas.drawLine(150, 100, 150, 500, paint);
        paint.setStrokeWidth(2);
        canvas.drawLine(150, 500, 900, 500, paint);
        canvas.drawPath(path, paint);

        // 画柱状图
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(180, 499, 260, 500, paint);
        canvas.drawRect(280, 485, 360, 500, paint);
        canvas.drawRect(380, 485, 460, 500, paint);
        canvas.drawRect(480, 350, 560, 500, paint);
        canvas.drawRect(580, 250, 660, 500, paint);
        canvas.drawRect(680, 150, 760, 500, paint);
        canvas.drawRect(780, 360, 860, 500, paint);

        // 画文字
        paint.setColor(Color.WHITE);
        paint.setTextSize(25);
        canvas.drawText("Froya", 200, 520, paint);
        canvas.drawText("GB", 300, 520, paint);
        canvas.drawText("ICS", 400, 520, paint);
        canvas.drawText("JB", 500, 520, paint);
        canvas.drawText("KitKat", 600, 520, paint);
        canvas.drawText("L", 700, 520, paint);
        canvas.drawText("M", 800, 520, paint);

        paint.setTextSize(35);
        canvas.drawText("直方图", 500, 620, paint);

    }
}
