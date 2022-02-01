package main;

import java.util.Random;

public class R {
    static Random r = new Random();
    public static String  getRandomNid(){
        return "1 " +(1980+r.nextInt(30))+" "+ (r.nextBoolean()?"8 ":"7 ")+String.format("%07d",r.nextInt(9999999))+ " "+ r.nextInt(9)+" "+String.format("%02d", r.nextInt(99));
    }
}
