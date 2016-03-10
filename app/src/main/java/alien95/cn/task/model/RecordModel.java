package alien95.cn.task.model;

import java.util.ArrayList;
import java.util.List;

import alien95.cn.task.R;
import alien95.cn.task.model.bean.AwardRecord;
import alien95.cn.task.model.bean.IndianaRecord;

/**
 * Created by linlongxin on 2016/3/9.
 */
public class RecordModel {

    public static List<AwardRecord> getAwardReords() {
        List<AwardRecord> data = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            data.add(new AwardRecord(R.drawable.ic_demo, "10元话费", "积分夺宝11月15日 第十二场", "王思聪", "2015年11月15日06:00 已开奖"));
        }
        return data;
    }

    public static IndianaRecord[] getIndianaRecordS() {
        return new IndianaRecord[]{
                new IndianaRecord(R.drawable.ic_demo, "10元话费", "积分夺宝11月15日 第十二场", "参与中", "满20人次即开奖", 70, 20)
        };
    }
}
