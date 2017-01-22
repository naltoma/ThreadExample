package jp.ac.uryukyu.ie.tnal;

/** 通常のコード（スレッドなし）
 * 単に上から順番に処理される。
 */
public class NormalCount {
    private String name;
    private final int rounds = 5;

    public NormalCount(String name) {
        this.name = name;
    }

    public void work() {
        for(int count=1; count<=rounds; count++){
            System.out.println(name + "は" + count + "個目の課題を終えた！");
        }
    }
}
