package alien95.cn.task.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import alien95.cn.task.R;
import alien95.cn.task.model.bean.IndianaRecord;

/**
 * Created by linlongxin on 2016/3/9.
 */
public class AwardAdapter extends RecyclerView.Adapter {


    @Override
    public int getItemViewType(int position) {
        if(position == 0){
            return 1;
        }else
            return 0;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView;
        if(viewType == 0){
            itemView= inflater.inflate(R.layout.item_award,parent,false);
            return new AwardViewHolder(itemView);
        }else{
            itemView = inflater.inflate(R.layout.item_indiana,parent,false);
            return new IndianaViewHolder(itemView);
        }

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(position == 0){

        }else {

        }
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class AwardViewHolder extends RecyclerView.ViewHolder{

        private ImageView image;
        private TextView award;
        private TextView time;
        private TextView winner;
        private TextView lotteryTime;

        public AwardViewHolder(View itemView) {
            super(itemView);
        }
    }

    class IndianaViewHolder extends RecyclerView.ViewHolder{

        private ImageView image;
        private TextView award;
        private TextView time;
        private TextView state;
        private TextView joinCount;
        private TextView condition;
        private ProgressBar progress;

        public IndianaViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.image);
            award = (TextView) itemView.findViewById(R.id.award);
            time = (TextView) itemView.findViewById(R.id.time);
            state = (TextView) itemView.findViewById(R.id.state);
            joinCount = (TextView) itemView.findViewById(R.id.join_count);
            condition = (TextView) itemView.findViewById(R.id.condition);
            progress = (ProgressBar) itemView.findViewById(R.id.progress);
        }

        public void setData(IndianaRecord data){
            image.setBackgroundResource(data.getImg());
            award.setText(data.getReward());
            time.setText(data.getTime());
            state.setText(data.getState());
            joinCount.setText("以参与人次" + data.getJoinCount());
            condition.setText(data.getCondition());
            progress.setProgress(data.getProgress());
        }
    }
}
