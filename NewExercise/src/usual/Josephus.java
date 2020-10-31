package usual;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Josephus {

    // 数组的实现一
    // count 人数
    // k 杀掉第 k 个人
    public static Integer[] solution(int count,int k){
        Integer[] live=new Integer[Math.min(count,k-1)];

        // 如果 k>count，就直接把所有人的编号返回即可，不再删除
        if(count<k){
            int index=0;
            while(index<count){
                live[index++]=index;
            }
            return live;
        }

        // 生成 1~count 的所有值 [1,count]
        List<Integer> mList=new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            mList.add(i+1);
        }

        int point=0;
        int number=0;
        while(mList.size()>=k){
            number++;
            if(point>=mList.size()){
                point=0;
            }
            if(number%k==0){
                mList.remove(point);
                continue;
            }
            point++;
        }
        return mList.toArray(live);
    }

    // 数组的实现二
    public static Integer[] solution02(int count,int k){
        Integer[] live=new Integer[Math.min(count,k-1)];
        if(count<k){
            int index=0;
            while(index<count){
                live[index++]=index;
            }
            return live;
        }

        List<Integer> mList=new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            mList.add(i+1);
        }

        int point=0;
        int number=0;
        int total=count-k+1;   // 记录总共删除的个数
        while(true){
            if(total<=0){
                break;
            }
            if(point>=mList.size()){
                point=0;
            }
            if(mList.get(point)<0){
                point++;
                continue;
            }
            number++;
            if(number%k==0){
                mList.set(point,-1);   // 如果是第 k 个，就把他变为负数
                total--;
                continue;
            }
            point++;
        }
        int index=0;
        for (int i = 0; i < mList.size(); i++) {
            if(mList.get(i)>0){
                live[index++]=mList.get(i);
            }
        }
        return live;
    }

    // 链表实现
    public static Integer[] solution03(int count,int k){
        Integer[] live=new Integer[Math.min(count,k-1)];
        if(count<k){
            int index=0;
            while(index<count){
                live[index++]=index;
            }
            return live;
        }

        LinkedList<Integer> mList=new LinkedList<>();
        for (int i = 0; i < count; i++) {
            mList.addLast(i+1);
        }

        int point=0;
        int number=0;
        while(mList.size()>=k){
            number++;
            if(point>=mList.size()){
                point=0;
            }
            if(number%k==0){
                mList.remove(point);
                continue;
            }
            point++;
        }
        return mList.toArray(live);
    }
}
