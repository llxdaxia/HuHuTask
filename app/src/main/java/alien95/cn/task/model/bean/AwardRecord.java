package alien95.cn.task.model.bean;

/**
 * Created by linlongxin on 2016/3/9.
 */
public class AwardRecord {

    private int img;
    private String reward;
    private String time;
    private String winner;
    private String lotteryTime;

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

    public void setSnatch(String snatch) {
        this.reward = snatch;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getLotteryTime() {
        return lotteryTime;
    }

    public void setLotteryTime(String lotteryTime) {
        this.lotteryTime = lotteryTime;
    }
}
