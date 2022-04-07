import java.util.ArrayList;
import java.util.List;

/**
 * @author lzy
 * @date 2022/2/4
 */
public class HeapOom {
    static class OomObject{

    }

    public static void main(String[] args) {
        List<OomObject> oomObjects = new ArrayList<OomObject>();
        while (true){
            oomObjects.add(new OomObject());
        }
    }
}
