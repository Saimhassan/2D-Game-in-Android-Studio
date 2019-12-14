package com.example.a2dgame;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Background {
int x = 0,y = 0 ;
Bitmap background;

Background(int screenx, int screeny, Resources res)
{
background = BitmapFactory.decodeResource(res,R.drawable.background);
background = Bitmap.createScaledBitmap(background,screenx,screeny,false);
}

}
