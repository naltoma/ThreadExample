package jp.ac.uryukyu.ie.tnal;

/** Runnableを用いたスレッド実装例。
 * run()メソッド内の処理は（見かけ上）並列実行される。
 */
public class RunnableCount implements Runnable {
    private String name;
    private final int rounds = 5;

    public RunnableCount(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int count=1; count<=rounds; count++){
            System.out.println(name + "は" + count + "個目の課題を終えた！");
        }
    }

}
