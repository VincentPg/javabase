package cn.com.study.volatiles.endlessLoop.synEndlessLoop;

public class PrintString implements Runnable{
    private boolean isContinuePrint = true;

    public boolean isContinuePrint(){
        return isContinuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }

    public void printStringMethod(){
        try{
            while(isContinuePrint == true){
                System.out.println("run printStringMethod threadName=" + Thread.currentThread().getName());
                Thread.sleep(1);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public void run(){
        printStringMethod();
    }
}

