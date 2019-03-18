import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentListSort
{
    public static void main(String[] args)
    {
        List<Student> list=new ArrayList<Student>();
        list.add(new Student("b",-2));
        list.add(new Student("a",1));
        list.add(new Student("a",-2));
        list.add(new Student("abc",10));
        Collections.sort(list);
        Iterator iter=list.iterator();
        while(iter.hasNext()){
            Student s=(Student)iter.next();
            System.out.println(s.id+"---"+s.age);
        }
    }
}
