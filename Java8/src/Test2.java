import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        String s="I:love,java:8,programme:98";

        String[] str=s.split(",");

        Map<Object, Object> map=Arrays.stream(str).map(e->e.split(":")).collect(Collectors.toMap(
                e1->e1[0],e2->e2[1],(o,n)->o
        ));

        map.entrySet().forEach(i->System.out.println(" "+i));
        map.keySet().forEach(i->System.out.print(" "+i));
        map.values().forEach(i->System.out.print(" "+i));

    }
}
