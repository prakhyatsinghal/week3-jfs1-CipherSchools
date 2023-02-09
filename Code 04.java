import java.util.List;

public class Test2 {
    public static void main(String[] args){
        
        List<Integer>mylist = Arrays(1,2,3,4,5,6,7,8,9,10);
        List<Integer>result = mylist.stream().mao(e->e*e).collect(Collectors.toList());
        System.out.println("result");
        
    }
}