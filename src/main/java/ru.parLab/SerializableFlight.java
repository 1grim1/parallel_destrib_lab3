package ru.parLab;

import java.io.Serializable;

public class SerializableFlight implements Serializable {
    private int destAirportID;
    private float delay;
    private int primaryAirportID;
    private float cancelledFlag;

    public SerializableFlight(){}

    public SerializableFlight(int destAirportID, int delay, int primaryAirportID){
        this.delay = delay;
        this.primaryAirportID = primaryAirportID;
        this.destAirportID = destAirportID;
    }

    public int getDestAirportID(){
        return this.destAirportID;
    }

    public float wasCancelled(){
        return this.cancelledFlag;
    }

    public float getDelay(){
        return this.delay;
    }

    public int getPrimaryAirportID(){
        return this.primaryAirportID;
    }
}
