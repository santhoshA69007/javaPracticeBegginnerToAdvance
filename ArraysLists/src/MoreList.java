import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreList {

    static void main() {
        String[] items={"apples","bannans","milk","eggs"};
        List<String> list=List.of(items);
        System.out.println(list);
        System.out.println(list.getClass().getName());

        ArrayList<String> grociers=new ArrayList<>(list);
        System.out.println(grociers);

        ArrayList<String> g2=new ArrayList<>(List.of("milkk","orange"));
        g2.addAll(list);
        System.out.println(g2);
        System.out.println(g2.contains("milk"));
        g2.add("yogurt");
System.out.println("first="+g2.indexOf("yogurt"));
System.out.println("last="+g2.lastIndexOf("yogurt"));

        System.out.println(g2);
        g2.remove(1);
        System.out.println(g2);
        g2.remove("yogurt");
        System.out.println(g2);

        g2.removeAll(List.of("milk","eggs"));
        System.out.println(g2);
        g2.retainAll(List.of("milkk","apples"));
        System.out.println(g2);

        g2.clear();
        System.out.println(g2.isEmpty());
        g2.addAll(List.of("apples","milk"));
        g2.addAll(Arrays.asList("eggs","pickcles","mustard","ham"));
        System.out.println(g2);
        g2.sort(Comparator.naturalOrder());
        g2.sort(Comparator.reverseOrder());
        System.out.println(g2);
        var res=g2.toArray(new String[g2.size()]);
        System.out.println(Arrays.toString(res));

    }
}
