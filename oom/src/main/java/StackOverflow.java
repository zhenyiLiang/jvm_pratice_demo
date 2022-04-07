/**
 * @author lzy
 * @date 2022/2/5
 */
public class StackOverflow {
    private int stackLength=1;
    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        StackOverflow sof = new StackOverflow();
        try {
            sof.stackLeak();
        }catch (Throwable e){
            System.out.println(sof.stackLength);
            throw e;
        }
    }
}
