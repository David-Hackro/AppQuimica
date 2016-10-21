package pue.mtz.pau.appquimica.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import pue.mtz.pau.appquimica.Models.Topic;
import pue.mtz.pau.appquimica.R;

/**
 * Created by david on 21/10/16.
 */

public class TopicsAdapter extends  RecyclerView.Adapter<TopicsAdapter.ViewHolder> implements View.OnClickListener{

    private List<Topic> listTopics;
    private int itemLayout;


    public TopicsAdapter(int itemLayout) {
        this.itemLayout = itemLayout;
    }

    public void setListTopics(List<Topic> listTopics) {
        this.listTopics = listTopics;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(itemLayout,parent,false);
        v.setOnClickListener(this);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Topic item = listTopics.get(position);
        holder.itemView.setTag(item);
        holder.name.setText(item.getName());
        holder.description.setText(item.getDescription());

    }

    @Override
    public int getItemCount() {
        if (listTopics != null)
            return listTopics.size();
        else
            return 0;
    }

    @Override
    public void onClick(View view) {

    }


    public void add(Topic item, int position) {
        listTopics.add(position, item);
        //notifyItemInserted(position);

    }

    public void remove(Topic item) {
        int position = listTopics.indexOf(item);
        listTopics.remove(position);
        //notifyItemRemoved(position);
        notifyDataSetChanged();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.card_topic_name)
        TextView name;
        @BindView(R.id.card_topic_description)
        TextView description;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }

}
