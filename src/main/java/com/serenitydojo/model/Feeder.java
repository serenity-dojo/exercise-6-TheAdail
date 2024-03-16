package com.serenitydojo.model;

public class Feeder {
    public String feeds(String animal, boolean isPremium) {

        switch (animal) {
            case "Cat":
                return isPremium ? "Salmon": "Tuna";

            case "Dog":
                return isPremium ? "Deluxe Dog Food": "Dog Food";

            case "Hamster":
                return isPremium ? "Lettuce": "Cabbage";

            default:
                return "Food";
        }
    }
}
