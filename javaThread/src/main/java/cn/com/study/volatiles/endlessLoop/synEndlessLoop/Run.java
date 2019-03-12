package cn.com.study.volatiles.endlessLoop.synEndlessLoop;


public class Run {
    public static void main(String[] args) throws Exception{
        PrintString printStringService = new PrintString();
        new Thread(printStringService).start();
        System.out.println("我要停止它! stop Thread="+ Thread.currentThread().getName());
        Thread.sleep(1000);
        printStringService.setContinuePrint(false);
    }
}
