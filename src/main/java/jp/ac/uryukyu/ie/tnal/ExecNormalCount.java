package jp.ac.uryukyu.ie.tnal;

public class ExecNormalCount {
    public static void main(String[] args){
        NormalCount nc = new NormalCount("勇者");
        NormalCount nc2 = new NormalCount("スライム");
        nc.work();
        nc2.work();
    }
}
