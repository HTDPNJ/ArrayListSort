public class Student implements Comparable<Student>
{
    String id;
    int age;

    public Student(String id, int age)
    {
        this.id = id;
        this.age = age;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public int compareTo(Student o)
    {
        String s="";
        if(this.id.compareTo(o.id)<0){
            return -1;
        }else if(this.id.compareTo(o.id)>0){
            return 1;
        }else{
            if(this.age<o.age){
                return 1;
            }else if(this.age>o.age){
                return -1;
            }else{
                return 0;
            }
        }
    };
}
