package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {


        ArrayList<Human> children = new ArrayList<>();

        Human child1 = new Human("Ребенок1", true, 10);
        Human child2 = new Human("Ребенок2", true, 12);
        Human child3 = new Human("Ребенок3", true, 15);
        children.add( child1 );
        children.add( child2 );
        children.add( child3 );

        Human father = new Human("Отец", true, 50, children);
        Human mother = new Human("Мать", false, 50, children);

        ArrayList<Human> children2 = new ArrayList<>();
        children2.add( father );
        ArrayList<Human> children3 = new ArrayList<>();
        children3.add( mother );

        Human grandfather1 = new Human("Дед1", true, 99, children2);
        Human grandfather2 = new Human("Дед2", true, 90, children3);

        Human grandmother1 = new Human("Бабка1", false, 99, children2);
        Human grandmother2 = new Human("Бабка2", false, 99, children3);

        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(grandfather1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());


        //напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>(  );

        Human (String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }
        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
