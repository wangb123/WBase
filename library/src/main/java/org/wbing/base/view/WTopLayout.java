package org.wbing.base.view;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import org.wbing.base.util.StatusBarUtils;

/**
 * @author wangbing
 * @date 2018/9/1
 */
public class WTopLayout extends FrameLayout {
    public WTopLayout(@NonNull Context context) {
        super(context);
        init();
    }

    public WTopLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public WTopLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            setPadding(getPaddingLeft(), getPaddingTop() + StatusBarUtils.getHeight(getContext()), getPaddingRight(), getPaddingBottom());
        }
    }

}
