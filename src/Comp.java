import java.util.Comparator;

public class Comp implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1, Integer o2)
    {
        int result =o1-o2;
        if(result<0)
            return 1;
        else if(result>0)
            return -1;
        else
            return 0;
    };
}
