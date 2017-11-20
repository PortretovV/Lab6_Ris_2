package com.student.portretov.lab6_ris_2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DrawView(this));
    }

    class DrawView extends View {
        //*******************************
//
//        Задание 1:
//
//******************************
//        Paint p;
//        Rect rect;
//
//        public DrawView(Context context) {
//            super(context);
//            p = new Paint();
//            rect = new Rect();
//        }
//
//        protected void onDraw(Canvas canvas) {
//            canvas.drawARGB(80, 102, 204, 255);
//
//            p.setColor(Color.RED);
//            p.setStrokeWidth(10);
//            canvas.drawPoint(50, 50, p);
//            canvas.drawLine(100, 100, 500, 50, p);
//            canvas.drawCircle(100, 200, 50, p);
//            canvas.drawRect(200, 150, 400, 200, p);
//            rect.set(259, 300, 350, 500);
//            canvas.drawRect(rect, p);
//        }
//    }


        //*******************************
//
//        Задание 2:
//
//******************************
//
//
//        Paint p;
//        RectF rectF;
//        float[] points;
//        float[] points1;
//
//        public DrawView(Context context) {
//            super(context);
//            p = new Paint();
//            rectF = new RectF(700, 100, 800, 150);
//            points = new float[]{100, 50, 150, 100, 150, 200, 50, 200, 50, 100};
//            points1 = new float[]{300, 200, 600, 200, 300, 300, 600, 300, 400, 100, 400, 400, 500, 100, 500, 400};
//        }
//
//        protected void onDraw(Canvas canvas) {
//            canvas.drawARGB(80, 102, 204, 255);
//            p.setColor(Color.RED);
//            p.setStrokeWidth(10);
//            canvas.drawPoints(points, p);
//            canvas.drawLines(points1, p);
//
//            p.setColor(Color.GREEN);
//            canvas.drawRoundRect(rectF, 20, 20, p);
//            rectF.offset(0, 150);
//            canvas.drawOval(rectF, p);
//            rectF.offset(0, 150);
//            rectF.inset(0, -25);
//            canvas.drawArc(rectF, 90, 270, true, p);
//            rectF.offset(0, 150);
//            canvas.drawArc(rectF, 90, 270, false, p);
//            p.setStrokeWidth(3);
//            canvas.drawLine(150, 450, 150, 600, p);
//
//            p.setColor(Color.BLUE);
//            p.setTextSize(30);
//            canvas.drawText("text left", 150, 500, p);
//            p.setTextAlign(Paint.Align.CENTER);
//            canvas.drawText("text center", 150, 520, p);
//            p.setTextAlign(Paint.Align.RIGHT);
//            canvas.drawText("text right", 150, 550, p);
//
//        }
//    }

//***************************************
//
//        Задание 3 и самостоятельная:
//
//***************************************
//
//
        Paint p;
        Rect rect;
        StringBuilder sb;

        public DrawView(Context context) {
            super(context);
            p = new Paint();
            rect = new Rect(100, 200, 200, 300);
            sb = new StringBuilder();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawARGB(80 ,102, 204, 255);

            p.setColor(Color.BLUE);
            p.setStrokeWidth(10);

            p.setTextSize(30);
            sb.append("width = ").
                    append(canvas.getWidth()).
                    append(", height = ").
                    append(canvas.getHeight());
            canvas.drawText(sb.toString(), 100, 100, p);

            p.setStyle(Paint.Style.FILL);
            canvas.drawRect(rect, p);

            p.setStyle(Paint.Style.STROKE);
            rect.offset(150, 0);
            canvas.drawRect(rect, p);

            p.setStyle(Paint.Style.FILL_AND_STROKE);
            rect.offset(150, 0);
            canvas.drawRect(rect, p);

            float[] five = new float[]{290,615,255,530,255,530,335,460,335,460,415,530,415,530,380,615,380,615,290,615};
            canvas.drawLines(five, p);

        }
    }

}
