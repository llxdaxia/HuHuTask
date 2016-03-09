package alien95.cn.task.model.bean;

/**
 * Created by linlongxin on 2016/3/9.
 */
public class IndianaRecord {

    private int img;
    private String reward;
    private String state;
    private String time;
    private String condition;
    private int progress;
    private int joinCount;

    public IndianaRecord(int img, String reward, String state, String time, String condition, int progress, int joinCount) {
        this.img = img;
        this.reward = reward;
        this.state = state;
        this.time = time;
        this.condition = condition;
        this.progress = progress;
        this.joinCount = joinCount;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getJoinCount() {
        return joinCount;
    }

    public void setJoinCount(int joinCount) {
        this.joinCount = joinCount;
    }
}
