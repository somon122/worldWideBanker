package com.world_tech_point.worldwide_knowledge.work_places.short_question;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.world_tech_point.worldwide_knowledge.AnimationUtil;
import com.world_tech_point.worldwide_knowledge.R;

import java.util.List;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.ViewHolder> {

    private Context context;
    private List<ThreeItemModel> threeItemModelList;
    private ThreeItemModel threeItemModel;
    private int previousPosition;
    private String category;

    public QuestionAdapter(Context context, List<ThreeItemModel> threeItemModelList, String category) {
        this.context = context;
        this.threeItemModelList = threeItemModelList;
        this.category = category;
    }
    @NonNull
    @Override
    public QuestionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.short_question_model,parent,false);
       return new ViewHolder(view);
    }
    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull QuestionAdapter.ViewHolder holder, final int position) {

        threeItemModel = threeItemModelList.get(position);
        holder.questionNoModel.setText("Q."+(position+1));
        holder.questionTV.setText(threeItemModel.getmQuestion());

        if (position > this.previousPosition) {
            AnimationUtil.animate(holder, true);
        } else {
            AnimationUtil.animate(holder, false);
        }
        this.previousPosition = position;

        holder.questionShowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                threeItemModel = threeItemModelList.get(position);

                if (threeItemModel.getmMoreQ() != null){
                    containShowAlert(threeItemModel.getmQuestion(), threeItemModel.getmAns()+"\n"+"Ans:  "+threeItemModel.getmMoreQ(),position);
                }else if (threeItemModel.getmAns() != null){
                    containShowAlert(threeItemModel.getmQuestion(), "Ans:  "+threeItemModel.getmAns(),position);
                }else {
                    containShowAlert(threeItemModel.getmQuestion(), threeItemModel.getmAns(),position);
                }

            }
        });

    }

    private void containShowAlert(final String name,final String meaning, int position) {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context,
                R.style.Theme_Design_BottomSheetDialog);
        final View bottomSheetView = LayoutInflater.from(context).inflate(R.layout.category_popup_model,
                bottomSheetDialog.findViewById(R.id.containShowPopUp_id));

        TextView favouriteBtn = bottomSheetView.findViewById(R.id.popUpFavouriteBtn);
        TextView popUpNumberBtn = bottomSheetView.findViewById(R.id.popUpNumberBtn);
        TextView nameTV = bottomSheetView.findViewById(R.id.popUpNameBtn);
        TextView meaningTV = bottomSheetView.findViewById(R.id.popUpMeaningBtn);
        TextView shareBtn = bottomSheetView.findViewById(R.id.popUpShareBtn);
        TextView copyBtn = bottomSheetView.findViewById(R.id.popCopyBtn);

        nameTV.setText("Q: "+name);
        meaningTV.setText(meaning);
        favouriteBtn.setText(category);
        popUpNumberBtn.setText("No:"+(position+1));

        shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareNameMeaning(name,meaning);
            }
        });
        copyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name!= null && meaning != null){
                    ClipboardManager clipboard = (ClipboardManager)
                            context.getSystemService(Context.CLIPBOARD_SERVICE);
                    ClipData clip = ClipData.newPlainText("text", name+"\n\n"+meaning);
                    clipboard.setPrimaryClip(clip);
                    Toast.makeText(context, "Copied!", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(context, "Text Empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }
    private void shareNameMeaning(String name,String meaning) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT,name);
        intent.putExtra(Intent.EXTRA_TEXT,meaning);
        context.startActivity(Intent.createChooser(intent,"Modern Baby Name"));

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
        return threeItemModelList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView questionTV, questionShowBtn, questionNoModel;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            questionTV = itemView.findViewById(R.id.questionModel_id);
            questionShowBtn = itemView.findViewById(R.id.questionShowBtn);
            questionNoModel = itemView.findViewById(R.id.questionNoModel);

        }
    }
}
