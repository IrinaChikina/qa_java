package com.example;

import java.util.List;


public class LionAlex extends Lion {
    private Predator predator;
    private Feline feline;

    public LionAlex (Predator predator,Feline feline) {
        super(predator,feline);
        //this.predator = predator;
       // this.feline = feline;
    }


    @Override
    public Object lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            return hasMane = true;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец");
        }
    }

    @Override
    public int getKittens() {
        return 0;
    }
    @Override
    public boolean doesHaveMane() {
        return true;
    }

    public List<String> getFriends(){
        return List.of ("Marty","Gloria","Melman");
    }

    public String getPlaceOfLiving(){
        return "New York Zoo";
    }
}


