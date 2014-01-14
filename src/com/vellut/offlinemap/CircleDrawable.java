package com.vellut.offlinemap;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;

public class CircleDrawable extends Drawable {

	private int radius;
	private Paint paint;
	
	public CircleDrawable(int color, int radius) {
		this.radius = radius;
		paint = new Paint();
		paint.setStyle(Style.FILL);
		paint.setColor(color);

		setBounds(-radius, -radius, radius, radius);
	}
	
	@Override
	public void draw(Canvas canvas) {
		float cx = (getBounds().right + getBounds().left) / 2;
		float cy = (getBounds().top + getBounds().bottom) / 2;
		canvas.drawCircle(cx, cy, radius, paint);
	}

	@Override
	public int getOpacity() {
		return PixelFormat.OPAQUE;
	}
	
	@Override
	public int getIntrinsicWidth() {
		return radius * 2;
	}
	
	@Override
	public int getIntrinsicHeight() {
		return radius * 2;
	}
	
	
	@Override
	public void setAlpha(int alpha) {
	}

	@Override
	public void setColorFilter(ColorFilter cf) {
	}

}