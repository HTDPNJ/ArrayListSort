import java.util.*;

public class ListSort
{
    public static void main(String[] args)
    {
        List list=new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(1);
        list.sort(new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                if (o1>o2)
                    return 1;
                else if(o1<o2)
                    return -1;
                else return 0;
            }
        });
        Iterator iter =list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("###########");
        list.sort(new Comp());
        Iterator iter2 =list.iterator();
        while(iter2.hasNext()){
            System.out.println(iter2.next());
        }

    }
}
