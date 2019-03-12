package cn.com.study.volatiles.endlessLoop;

public class Run {
    public static void main(String[] args) {
        PrintString printStringService = new PrintString();
        printStringService.printStringMethod();
        System.out.println("我要停止它! stop Thread="+ Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}
