package collectiondemo;

import java.util.ArrayList;

/**
 * @Author: Rocky
 * @Date: 2019-06-17
 * @Description:
 */
public class ListDemo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.iterator();
        list.add("1");
        list.add("2");
        // 测试在循环中用这种方式去删除元素，分析源码，分析报错的原因。
        for (String item : list) {
            if ("2".equals(item)) {
                list.remove(item);
            }
        }
    }
}
