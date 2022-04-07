/**
 * @author lzy
 * @date 2022/2/5
 */
public class StackOom {
    private void dontStop(){
        while (true){

        }
    }
    public void stackLeanByThread(){
        while (true){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        StackOom stackOom = new StackOom();
        stackOom.stackLeanByThread();
    }
}
