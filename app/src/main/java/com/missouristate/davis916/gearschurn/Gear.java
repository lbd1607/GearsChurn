package com.missouristate.davis916.gearschurn;

/**
 * Laura Davis CIS 262-902
 * 24 March 2018
 * This is the constructor for the
 * Gear object.
 */

public class Gear {
    private int mStartDegree;
    private int mEndDegree;

    public Gear(){
        mStartDegree = 0;
        mEndDegree = 0;
    }//end Gear()

    public void setStartDegree(int startDegree){
        mStartDegree = startDegree;
    }

    public int getStartDegree(){
        return mStartDegree;
    }

    public void setEndDegree(int endDegree){
        mEndDegree = endDegree;
    }

    public int getEndDegree(){
        return mEndDegree;
    }

}//end Gear class
