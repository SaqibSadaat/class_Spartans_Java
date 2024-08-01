package week_11_06102024.day_3.AbstractExample;

import week_11_06102024.day_3.AbstractExample.Animal;

public class Husky extends Animal {

    @Override
    public void eat() {
        System.out.println("Eating meat");
    }

    @Override
    public void breath() {
        System.out.println("Breaths Air!");
    }
}
