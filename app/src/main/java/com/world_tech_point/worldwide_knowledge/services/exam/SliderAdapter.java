package com.world_tech_point.worldwide_knowledge.services.exam;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.world_tech_point.worldwide_knowledge.R;
import com.world_tech_point.worldwide_knowledge.work_places.ExamActivity;

import java.util.List;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.ViewHolder> {

    private Context context;
    private List<SliderClass> sliderClassList;
    private ViewPager2 viewPager2;
    private SliderClass sliderClass;

    public SliderAdapter(Context context, List<SliderClass> sliderClassList, ViewPager2 viewPager2) {
        this.context = context;
        this.sliderClassList = sliderClassList;
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public SliderAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.slide_view_cointainer,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SliderAdapter.ViewHolder holder, final int position) {

        sliderClass = sliderClassList.get(position);
       holder.roundedImageView.setBackgroundResource(sliderClass.getmImage());

        holder.btnTitle.setText(sliderClass.getmBtnTitle());
        holder.title.setText(sliderClass.getmTitle());
        holder.modelSliderDesc.setText(sliderClass.getmDesc());

        holder.btnTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goMethod(position);
            }
        });
    }


    private void goMethod(int position) {

        if (position==0){
            Intent intent = new Intent(context, ExamActivity.class);
            intent.putExtra("quiz_number","10");
            context.startActivity(intent);
        } else if (position == 1) {
            Intent intent = new Intent(context, ExamActivity.class);
            intent.putExtra("quiz_number","25");
            context.startActivity(intent);
        }else if (position == 2) {
            Intent intent = new Intent(context, ExamActivity.class);
            intent.putExtra("quiz_number","50");
            context.startActivity(intent);
        }else if (position == 3) {
            Intent intent = new Intent(context, ExamActivity.class);
            intent.putExtra("quiz_number","75");
            context.startActivity(intent);
        }else if (position == 4) {
            Intent intent = new Intent(context, ExamActivity.class);
            intent.putExtra("quiz_number","100");
            context.startActivity(intent);
        }else if (position == 5) {
            Intent intent = new Intent(context, ExamActivity.class);
            intent.putExtra("quiz_number","200");
            context.startActivity(intent);
        }else {
            Toast.makeText(context, "No Match", Toast.LENGTH_SHORT).show();
        }
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
        return sliderClassList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView roundedImageView;
        TextView title ,modelSliderDesc;
        Button btnTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            roundedImageView = itemView.findViewById(R.id.roundedImageView);
            title = itemView.findViewById(R.id.title_id);
            modelSliderDesc = itemView.findViewById(R.id.modelSliderDesc);
            btnTitle = itemView.findViewById(R.id.btnTitle);

        }
    }
}
