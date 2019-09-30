public class Stop_Watch {
    private long startTime =0, endTime =0;
    private boolean running =false;


    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;

    }


    public void stop() {
        this.endTime = System.currentTimeMillis();
        this.running = false;
    }

    //tinh  mini
    public long getElapsedTime(){
        long elapsed;
        if(running){
            elapsed =System.currentTimeMillis() -startTime;
        }else{
            elapsed =endTime -startTime;
        }
        return  elapsed;
    }





}
