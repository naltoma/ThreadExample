package jp.ac.uryukyu.ie.tnal;

public class ExecThreadCount {
    public static void main(String[] args){
        ThreadCount tc = new ThreadCount("勇者");
        ThreadCount tc2 = new ThreadCount("スライム");
        tc.start();
        tc2.start();
    }

}
