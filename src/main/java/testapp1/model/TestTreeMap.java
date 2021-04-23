package testapp1.model;


import java.util.TreeMap;

public class TestTreeMap {

    public static void main(String args[]){
        TreeMap<String,String> treeMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        treeMap.put("test1","value1");
        treeMap.put("tesT1","value2");

        System.out.println(treeMap.keySet().size());




    }

}
