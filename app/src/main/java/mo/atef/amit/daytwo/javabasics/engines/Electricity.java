package mo.atef.amit.daytwo.javabasics.engines;

public class Electricity extends Engine{

    public int amh;
    private int volt;

    public int getAmh() {
        return amh;
    }

    public void setAmh(int amh) {
        this.amh = amh;
    }

    public int getVolt() {
        return volt;
    }

    //different signature
    public void setVolt(int volt) {
        this.volt = volt;
    }

    // method overloading
    public void setVolt(){

    }

    public void setVolt(int vole, int amph){

    }

    void setSpeed(int speed) {
        int newSpeed= speed*9;
        this.speed = newSpeed;
    }
}