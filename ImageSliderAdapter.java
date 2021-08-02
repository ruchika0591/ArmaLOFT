package com.icat.armaloft;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;

public class ImageSliderAdapter extends SliderViewAdapter<SliderViewHolder> {
    Context context;
    List<ImageSliderModel> imageSliderModelList;

    public ImageSliderAdapter(Context context, List<ImageSliderModel> imageSliderModelList) {
        this.context = context;
        this.imageSliderModelList = imageSliderModelList;
    }

    @Override
    public SliderViewHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item,parent,false);
        return new SliderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SliderViewHolder viewHolder, int position) {
        viewHolder.SliderImageView.setImageResource(imageSliderModelList.get(position).getImage());

    }

    @Override
    public int getCount() {
        return imageSliderModelList.size();
    }
}
class SliderViewHolder extends SliderViewAdapter.ViewHolder {
    ImageView SliderImageView;
    public SliderViewHolder(View itemView) {
        super(itemView);
        SliderImageView = itemView.findViewById(R.id.imageView);
    }
}