package alien95.cn.task;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by linlongxin on 2016/3/9.
 */
public class RecordAdapter extends RecyclerView.Adapter {


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
            itemView= inflater.inflate(R.layout.item_snatch,parent,false);
            return new RecordViewHolder(itemView);
        }else{
            itemView = inflater.inflate(R.layout.item_snatch_state,parent,false);
            return new StateViewHolder(itemView);
        }

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class RecordViewHolder extends RecyclerView.ViewHolder{

        public RecordViewHolder(View itemView) {
            super(itemView);
        }
    }

    class StateViewHolder extends RecyclerView.ViewHolder{


        public StateViewHolder(View itemView) {
            super(itemView);
        }
    }
}
