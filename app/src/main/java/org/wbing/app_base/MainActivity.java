package org.wbing.app_base;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.widget.CompoundButton;

import org.wbing.app_base.databinding.ActivityMainBinding;
import org.wbing.base.ui.impl.WAct;
import org.wbing.base.util.StatusBarUtils;

public class MainActivity extends WAct<ActivityMainBinding> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getBinding().translucent.setOnCheckedChangeListener((buttonView, isChecked) -> StatusBarUtils.setTranslucent(getActivity(), isChecked));
        getBinding().color.setOnCheckedChangeListener((buttonView, isChecked) -> StatusBarUtils.setStyle(getActivity(), isChecked));
        getBinding().bg.setOnCheckedChangeListener((buttonView, isChecked) -> StatusBarUtils.setBackgroundColor(getActivity(), getRandomColor(), isChecked));
    }

    @Override
    public void loadData() {

    }

    @Override
    public void recycle() {

    }

    @Override
    public int layoutId() {
        return R.layout.activity_main;
    }


    private int[] colors = {
            Color.BLACK,
            Color.DKGRAY,
            Color.GRAY,
            Color.LTGRAY,
            Color.WHITE,
            Color.RED,
            Color.GREEN,
            Color.BLUE,
            Color.YELLOW,
            Color.CYAN,
            Color.MAGENTA
    };

    private int getRandomColor() {
        int random = (int) (Math.random() * 9);
        return colors[random];
    }
}
