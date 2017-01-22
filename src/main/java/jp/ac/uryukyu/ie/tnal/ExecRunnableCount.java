package jp.ac.uryukyu.ie.tnal;

public class ExecRunnableCount {
    public static void main(String[] args){
        RunnableCount rc = new RunnableCount("勇者");
        RunnableCount rc2 = new RunnableCount("スライム");
        Thread[] threads = new Thread[2];
        threads[0] = new Thread(rc);
        threads[1] = new Thread(rc2);
        for(Thread th : threads){
            th.start();
        }
    }

}
