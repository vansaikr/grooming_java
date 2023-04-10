package com.sapient.w3;

import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TreeSortComparator {

    private String name;
    private Integer marks;

    public static void main(String[] args)
    {
        TreeMap<TreeSortComparator, Integer> map
                = new TreeMap<>(new MarksSort());

        map.put(new TreeSortComparator("RPS", 40), 1);
        map.put(new TreeSortComparator("SRH", 50), 2);
        map.put(new TreeSortComparator("CSK", 30), 3);

        map.forEach((k,v)->{System.out.println(k.getName()+" : "+k.getMarks()+" : "+v);});
    }
}


class MarksSort implements Comparator<TreeSortComparator> {
    public int compare(TreeSortComparator s1, TreeSortComparator s2)
    {
        return s1.getMarks().compareTo(s2.getMarks());
    }
}
