package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    Paint paint = new Paint();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        paint.setStyle(Paint.Style.FILL); // 填充模式
        paint.setColor(Color.RED);
        canvas.drawArc(200, 100, 600, 500, -180, 130, true, paint); // 绘制扇形

        paint.setColor(Color.BLUE);
        canvas.drawArc(210, 120, 610, 520, -180, -120, true, paint);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(210, 115, 610, 515, 0, -50, true, paint);

        paint.setColor(Color.WHITE);
        canvas.drawArc(210, 115, 610, 515, 2, 7, true, paint);

        paint.setColor(Color.GRAY);
        canvas.drawArc(210, 115, 610, 515, 11, 5, true, paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(210, 115, 610, 515, 18, 40, true, paint);

        paint.setColor(Color.WHITE);
        paint.setTextSize(45);
        canvas.drawText("饼图", 500, 620, paint);
    }
}
