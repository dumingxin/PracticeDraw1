package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        String[] item = new String[]{"Froyo", "GB", "ICS", "JB", "Kitkat", "L", "M"};
        int[] values = new int[]{10, 30, 35, 70, 120, 210, 150};
        int[] colors = new int[]{Color.BLACK, Color.BLUE, Color.CYAN, Color.GRAY, Color.GREEN, Color.RED, Color.YELLOW};
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        int startAngle = 0;
        for (int i = 0; i < values.length; i++) {
            float angle = 360f * values[i] / sum;
            paint.setColor(colors[i]);
            canvas.drawArc(200, 100, 400, 300, startAngle, angle, true, paint);
            startAngle += angle;
        }

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
    }
}
