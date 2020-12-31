package com.world_tech_point.worldwide_knowledge;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public class AnimationUtil {
    public static void animate(ViewHolder viewHolder, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = viewHolder.itemView;
        float[] fArr = new float[2];
        fArr[0] = z ? 100.0f : -100.0f;
        fArr[1] = 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", fArr);
        ofFloat.setDuration(600);
        animatorSet.playTogether(new Animator[]{ofFloat});
        animatorSet.start();
    }
}
