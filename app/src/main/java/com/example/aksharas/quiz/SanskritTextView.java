package com.example.aksharas.quiz;


import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SanskritTextView extends androidx.appcompat.widget.AppCompatTextView {
    public SanskritTextView(@NonNull Context context) {
        super(context);
        initTypeFace(context);
    }

    public SanskritTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initTypeFace(context);
    }

    public SanskritTextView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initTypeFace(context);
    }

    private void initTypeFace(Context context) {
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "sanskbi.ttf");
        this.setTypeface(typeface);
    }
}