package javaTaskOne.Controller.Misc;

public class Random {
    public static short getRandom(int q, int w) {
        return (short) (Math.random() * q + w);
    }
}
