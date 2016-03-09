package alien95.cn.task.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import alien95.cn.task.R;
import alien95.cn.task.adapter.AwardAdapter;
import alien95.cn.task.model.RecordModel;

/**
 * Created by linlongxin on 2016/3/9.
 */
public class AwardRecordFragment extends Fragment {

    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_award_record,container,false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(container.getContext()));
        recyclerView.setAdapter(new AwardAdapter(getActivity(),RecordModel.getAwardReords()));
        return view;
    }
}
