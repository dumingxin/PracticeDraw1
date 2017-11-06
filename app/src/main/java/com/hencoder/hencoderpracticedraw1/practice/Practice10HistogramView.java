package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

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
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        canvas.drawLine(50, 50, 50, 400, paint);
        canvas.drawLine(50, 400, 800, 400, paint);
        String[] item = new String[]{"Froyo", "GB", "ICS", "JB", "Kitkat", "L", "M"};

        for (int i = 0; i < item.length; i++) {
            Rect rect = new Rect();
            paint.getTextBounds(item[0], 0, item[0].length(), rect);
            canvas.drawText(item[i], 90 + i * 80-rect.width()/2, 420, paint);
        }
        int[] values = new int[]{10, 30, 35, 70, 120, 210, 150};
        paint.setColor(Color.GREEN);
        for (int i = 0; i < values.length; i++) {
            canvas.drawRect(60 + i * 80, 400 - values[i], 60 + i * 80 + 60, 400, paint);
        }

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
    }
}
