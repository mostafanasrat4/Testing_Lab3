package watch;

public class DigitalWatch2 {

    public boolean setAlarm = false;

    public boolean set() {
        if (this.setAlarm) {
            return false;
        }
        this.setAlarm = true;
        return true;
    }

    public boolean unset() {
        if (!this.setAlarm) {
            return false;
        }
        this.setAlarm = false;
        return true;
    }

    public boolean check() {
        boolean tem = this.setAlarm;
        this.setAlarm = false;
        return tem;
    }
}