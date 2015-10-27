package model;

/**
 * Created by Administrator on 27-10-2015.
 */
public class DatumTijd {

    long startTime,endTime;
    double totalTime;

    public DatumTijd(){
        startTimer();
    }
    /**
     Start bezoek tijd
     */
    public void startTimer(){
        startTime = System.nanoTime();
    }

    /**
     Stop tijd
     */
    public void stopTimer(){
        endTime = System.nanoTime();
    }

    /**
     * Totaal tijd bezocht cafe
     */
    public double getTotalTime(){
        totalTime = (double)(endTime - startTime);
        return totalTime;
    }
}
