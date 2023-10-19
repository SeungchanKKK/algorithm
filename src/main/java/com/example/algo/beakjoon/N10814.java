package com.example.algo.beakjoon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class N10814 {

    public static void main(String[] args) {
        class Person{
            int age;
            String name;

            public Person( int age,String name) {
                this.age = age;
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public String getName() {
                return name;
            }
        }

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Person>people = new ArrayList<>();
        for (int i=0; i<N; i++){
            people.add(new Person(sc.nextInt(),sc.next()));
        }
        List<Person> sorted = people.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());

        for (int i=0; i<sorted.size(); i++){
            System.out.println(sorted.get(i).age+" "+sorted.get(i).getName());
        }
    }
}
