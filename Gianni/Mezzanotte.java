package Gianni;

import java.sql.Time;

public class Mezzanotte {
    
Time mezzanotte;


    public Mezzanotte(Time mezzanotte) {
        this.mezzanotte = mezzanotte;
    }

    public Time ToMezzanotte(Time t){

        long msInDay= 24*60*60*1000;
        long msPassed= t.getTime() % msInDay;
        long msToMidnight= msInDay - msPassed;

        return new Time (msToMidnight);
    }


}
