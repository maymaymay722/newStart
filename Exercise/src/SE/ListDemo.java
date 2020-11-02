package SE;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.*;

public class ListDemo {


    /*
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        int[] nums=new int[]{1,5,3,2,1,3,5};
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                res=nums[i];
                break;
            }
        }
        System.out.println(res);
    }
    */

    /*
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("Hello");
        set.add("World");
        set.add("!!!");
        set.add("Hello");
        System.out.println(set);

        Iterator<String> it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    */

    /*
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"hello");
        map.put(1,"Hello");
        map.put(2,"Java");
        map.put(3,"BIt");
        System.out.println(map);

        System.out.println(map.get(2));
        System.out.println(map.get(99));

        for (Integer key:map.keySet()){
            System.out.println(key);
        }

        for (String value:map.values()){
            System.out.println(value);
        }

        for (Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
    */

    /*
    public static void main(String[] args) {
        List<String> courses=new ArrayList<>();
        courses.add("C语言");
        courses.add("Java SE");
        courses.add("Java Web");
        courses.add("Java EE");

        // 和数组一样，允许添加重复元素
        courses.add("C语言");

        // 按照添加顺序打印
        System.out.println(courses);

        // 访问
        System.out.println(courses.get(0));
        System.out.println(courses);

        // 将 C语言 修改为 计算机基础
        courses.set(0,"计算机基础");
        System.out.println(courses);

        // 截取部分[1,3)
        List<String> subCourses=courses.subList(1,3);
        System.out.println(subCourses);

        // 重新构造
        List<String> courses2=new ArrayList<>(courses);
        System.out.println(courses2);

        List<String> courses3=new LinkedList<>(courses);
        System.out.println(courses3);

        // 引用的转换
        ArrayList<String> courses4=(ArrayList<String>)courses2;
        System.out.println(courses4);
        LinkedList<String> courses5=(LinkedList<String>)courses3;
        System.out.println(courses5);
    }
    */
}
