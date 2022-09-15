package mo.atef.amit.daytwo.javabasics.models;

import android.graphics.drawable.Drawable;

public class Talabat {

    public Drawable image;
    public int delivery;
    public String location;

    public Talabat(Drawable image, int delivery, String location) {
        this.image = image;
        this.delivery = delivery;
        this.location = location;
    }
}
