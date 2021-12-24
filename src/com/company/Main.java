package com.company;

import java.util.ArrayList;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        /**Integer массивден жуп сандарды терип алынызда алардын квадраттарынын эн чонун табыныз.*/
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(64);
        arr.add(49);
        arr.add(25);

        Optional<Integer>max=arr.stream().filter(x->x%2==0).map(x->x*x).max(Integer::compare);
        System.out.println(max.get());

    }
        }


