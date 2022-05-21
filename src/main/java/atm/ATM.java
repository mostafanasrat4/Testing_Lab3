package atm;

public class ATM extends ATM2{

    public String state = "LOGGEDOUT";

    public Boolean input(char c){
        if(this.state.equals("LOGGEDOUT")){
            if(c == 'l'){
                this.state = "LOGGEDIN";
                return true;
            }else if(c == 'u'){
                this.state = "UNLOCKED";
                return true;
            }
        }else if(this.state.equals("LOGGEDIN")){
            if(c == 'w'){
                return this.withdraw();
            }else if(c == 'd') {
                this.deposit(1);
                return true;
            }else if(c == 'o') {
                this.state = "LOGGEDOUT";
                return true;
            }
        }else if(this.state.equals("UNLOCKED")){
            if(c == 'f'){
                this.deposit(1);
                return true;
            }else if(c == 'l') {
                this.state = "LOGGEDOUT";
                return true;
            }
        }
        return false;
    }
}
