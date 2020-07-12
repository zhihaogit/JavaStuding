package Package19ListAndSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Collections
 * collection类的工具类
 */

public class Demo07Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // 一次添加多个元素
        Collections.addAll(list, "1", "a", "b", "c", "d", "e");
        System.out.println(list);

        // 打乱元素顺序
        Collections.shuffle(list);
        System.out.println(list);

        // sort方法需要使用的数据类，必须impel Comparable
        Collections.sort(list);

        ArrayList<Persion> list1 = new ArrayList<>();
        list1.add(new Persion("haha", 12));
        list1.add(new Persion("hasha", 11));
        list1.add(new Persion("zahda", 14));
        list1.add(new Persion("hahda", 14));
        Collections.sort(list1);
        System.out.println(list1);

        // sort方法使用第二个参数 comparator
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(0) - o2.charAt(0);
            }
        });
        System.out.println(list);

        Collections.sort(list1, new Comparator<Persion>() {
            @Override
            public int compare(Persion o1, Persion o2) {
                int result = o1.getAge() - o2.getAge();
                if (result == 0) {
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list1);

    }
}
