package day28;

import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        //Collection<Item> items= new TreeSet<Item>(Comparator.comparing(Item::getPrice));
        //Collection<Item> items= new TreeSet<Item>();
        Collection<Item> items= new ArrayList<>();
        items.add(new Item("Pen","Stationary",200,2010));
        items.add(new Item("Laptop","Gadget",500,2012));
        items.add(new Item("Car","Vehicle",20000,2020));
        items.add(new Item("Plate","Kitchen",300,2015));
        items.add(new Item("TV","Entertainment",200,2019));
        items.add(new Item("Car","Vehicle",20000,2020));


        //Creating Stream
        Stream<Integer> nuStream=Stream.of(1,2,4,6,7);
        List<Integer> numStream = nuStream.map(x->x*x).collect(Collectors.toList());
        System.out.println(numStream);
        //flatmap
        List<Integer> lst1=Arrays.asList(1,2,5,7,9);
        List<Integer> lst2=Arrays.asList(4,2,7,9);
        List<List<Integer>> lsts=Arrays.asList(lst1,lst2);
        List<Integer> flatmapStream= lsts.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(flatmapStream);
        //Stream<Item> itemStream= items.stream();
       // List<Item> itemStream1= items.stream().toList();
        //List<String> itemStream1= items.stream().map(x-> x.getName()).toList();
        //List<String> itemStream1= items.stream().map(x-> x.getName()).collect(Collectors.toCollection(ArrayList::new));
        //List<Item> itemStream1= items.stream().filter(x-> x.getType().startsWith("G")).collect(Collectors.toList());
        //List<Item> itemStream1= items.stream().sorted(Comparator.comparing(Item::getPrice)).collect(Collectors.toList());
       // List<Item> itemStream1= items.stream().distinct().collect(Collectors.toList());
       // List<Item> itemStream1=items.stream().distinct().peek(x-> System.out.println(x)).collect(Collectors.toList());
       /* for (Item i: itemStream1){
           // Logger.getGlobal().info(String.valueOf(i));
            System.out.println(i);
        }*/
        //long countStream = items.stream().count();
        //long countStream = items.stream().distinct().count();
        //boolean countStream = items.stream().allMatch(x->x.getType().startsWith("G"));
        //boolean countStream = items.stream().anyMatch(x->x.getName()=="Pen");
        //Logger.getGlobal().info(String.valueOf(countStream));
        items.stream().filter(x->x.getPrice()>300).forEach(System.out::println);
    }
}
