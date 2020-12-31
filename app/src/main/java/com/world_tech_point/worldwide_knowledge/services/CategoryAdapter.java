package com.world_tech_point.worldwide_knowledge.services;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.world_tech_point.worldwide_knowledge.AnimationUtil;
import com.world_tech_point.worldwide_knowledge.R;
import com.world_tech_point.worldwide_knowledge.work_places.QuizActivity;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.QuestionActivity;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private Context context;
    private String category;
    private ListItem listItem;
    private List<ListItem>classList;
    private int previousPosition;

    public CategoryAdapter(Context context, List<ListItem> classList, String category) {
        this.context = context;
        this.classList = classList;
        this.category = category;
    }

    @NonNull
    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.model_category_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.ViewHolder holder, final int position) {

        listItem = classList.get(position);
        holder.categoryName.setText(listItem.getCategoryName());
        holder.imageView.setImageResource(listItem.getCategoryImage());

        if (position > this.previousPosition) {
            holder.itemView.setAnimation(AnimationUtils.loadAnimation(context,R.anim.slide_in_right));
        } else {
            holder.itemView.setAnimation(AnimationUtils.loadAnimation(context,R.anim.slide_in_left));
        }
        this.previousPosition = position;

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (category.equals("Quiz")){
                    listItem = classList.get(position);
                    Intent intent = new Intent(new Intent(context, QuizActivity.class));
                    intent.putExtra("category", listItem.getCategoryName());
                    intent.putExtra("position",String.valueOf(position));
                    context.startActivity(intent);

                }else if (category.equals("Question")){
                    listItem = classList.get(position);
                    Intent intent = new Intent(new Intent(context, QuestionActivity.class));
                    intent.putExtra("category", listItem.getCategoryName());
                    intent.putExtra("position",String.valueOf(position));
                    context.startActivity(intent);

                }
            }
        });

    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return classList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView categoryName;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            categoryName = itemView.findViewById(R.id.modelCategoryName);
            imageView = itemView.findViewById(R.id.modelCategoryImage);
        }
    }
}
