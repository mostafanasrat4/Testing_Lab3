package watch;

public class DigitalWatchStub {
        public boolean set(){
            System.out.println("Alarm Set");
            return true;
        }

        public boolean unset(){
            System.out.println("Alarm Unset");
            return true;
        }

        public boolean check(){
            System.out.println("Alarm Checked");
            return true;
        }
}
