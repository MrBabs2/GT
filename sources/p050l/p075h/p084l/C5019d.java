package p050l.p075h.p084l;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

/* renamed from: l.h.l.d */
/* compiled from: GravityCompat */
public final class C5019d {
    /* renamed from: a */
    public static void m8934a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        } else {
            Gravity.apply(i, i2, i3, rect, rect2);
        }
    }

    /* renamed from: a */
    public static int m8933a(int i, int i2) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & -8388609;
    }
}
