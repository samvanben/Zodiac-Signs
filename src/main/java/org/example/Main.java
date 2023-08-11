package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Program welcomes the user
        System.out.println("Welcome to What's your Zodiac Sign!");

        // Add scanner so user can provide input
        Scanner input = new Scanner(System.in);
        // Create a string to hold user's provided month
        String month;
        do{
            System.out.println("Let's get started! What month were you born? (Full month name)");
            // Get the users provided month and convert to lowercase to avoid errors
            month = input.nextLine().toLowerCase();
            // Repeat the loop if input is not equal to any of the months
        } while(!month.equals("january") && !month.equals("february") && !month.equals("march") && !month.equals("april")
                && !month.equals("may") && !month.equals("june") && !month.equals("july") && !month.equals("august")
                && !month.equals("september") && !month.equals("october") && !month.equals("november") && !month.equals("december"));

        // Switch statements repeating what the user provided
        switch(month){
            case "january":
                System.out.println("No better way to start your new year than with a birthday trip into the stars!");
                break;
            case "february":
                System.out.println("They say February is for love, let the stars guide you to your valentine!");
                break;
            case "march":
                System.out.println("Spring is sprung in March, and so was your star journey!");
                break;
            case "april":
                System.out.println("April showers bring flowers, and the stars brought you to take in the aroma!");
                break;
            case "may":
                System.out.println("May the stars guide you... sorry, too cheesy?");
                break;
            case "june":
                System.out.println("The summer time! June is the perfect time to lay out and watch the stars!");
                break;
            case "july":
                System.out.println("The stars won't be the only thing lighting up the sky in July!");
                break;
            case "august":
                System.out.println("An August birthday is great for trips... trips among the stars!");
                break;
            case "september":
                System.out.println("The leaves may be changing, but the stars are forever!");
                break;
            case "october":
                System.out.println("Trick or treat, smell my feet, give me some nice stars to see!");
                break;
            case "november":
                System.out.println("Gratitude is the attitude! Take a moment to appreciate the stars!");
                break;
            case "december":
                System.out.println("Twinkling lights and cozy evenings, maybe we can stargaze next to the fireplace!");
                break;
            default:
                System.out.println("Oops! I don't think that's a month, let's try again!");
        }

        System.out.println("So what day in " + month + " were you born?");
        //Create a scanner so user can input day
        Scanner scanner = new Scanner(System.in);
        // Create an int for users birth day
        int day = 0;
        // Parse users string input into an int
        day = Integer.parseInt(input.nextLine());

        // Create a string variable to hold the zodiac sign name
        String zodiacSign = "";

        // If statements for each sign
        if (month.equals("january")){
            if (day >= 20 && day <= 31){
                zodiacSign = "Aquarius";
                System.out.println("A birthday of " + month + " " + day + " makes you an " + zodiacSign + "!");
                System.out.println("Aquarius is an air sign known for its progressive thinking, humanitarian values, " +
                                    "and intellectual pursuits. Aquarians are often friendly, unconventional, " +
                                    "and have a strong sense of social justice.");
            } else if (day >= 1 && day <= 19) {
                zodiacSign = "Capricorn";
                System.out.println("A birthday of " + month + " " + day + " makes you an " + zodiacSign + "!");
                System.out.println("Capricorn is an earth sign associated with ambition, responsibility, and " +
                                    "discipline. Capricorns are often hardworking, practical, and strive " +
                                    "for long-term success.");
            }
        }
        if (month.equals("february")){
            if (day >= 19 && day <= 29){
                zodiacSign = "Pisces";
                System.out.println("A birthday of " + month + " " + day + " makes you an " + zodiacSign + "!");
                System.out.println(" Pisces is a water sign associated with empathy, creativity, and sensitivity." +
                                    " Pisceans are often compassionate, artistic, and deeply in tune " +
                                    "with their emotions and intuition.");
            } else if (day >= 1 && day <= 18) {
                zodiacSign = "Aquarius";
                System.out.println("A birthday of " + month + " " + day + " makes you an " + zodiacSign + "!");
                System.out.println("Aquarius is an air sign known for its progressive thinking, humanitarian values, " +
                                    "and intellectual pursuits. Aquarians are often friendly, unconventional, " +
                                    "and have a strong sense of social justice.");
            }
        }
        if (month.equals("march")){
            if (day >= 21 && day <= 31){
                zodiacSign = "Aries";
                System.out.println("A birthday of " + month + " " + day + " makes you an " + zodiacSign + "!");
                System.out.println("Aries is the first sign of the zodiac and is known for its boldness, " +
                                    "assertiveness, and leadership qualities. People born under this sign are often " +
                                    "energetic, competitive, and determined.");
            } else if (day >= 1 && day <= 20) {
                zodiacSign = "Pisces";
                System.out.println("A birthday of " + month + " " + day + " makes you an " + zodiacSign + "!");
                System.out.println(" Pisces is a water sign associated with empathy, creativity, and sensitivity." +
                                    " Pisceans are often compassionate, artistic, and deeply in tune " +
                                    "with their emotions and intuition.");
            }
        }
        if (month.equals("april")){
            if (day >= 20 && day <= 30){
                zodiacSign = "Taurus";
                System.out.println("A birthday of " + month + " " + day + " makes you an " + zodiacSign + "!");
                System.out.println("Taurus is an earth sign associated with stability, practicality, and " +
                                    "patience. Taureans are often reliable, persistent, and have a love " +
                                    "for comfort and the finer things in life.");
            } else if (day >= 1 && day <= 19) {
                zodiacSign = "Aries";
                System.out.println("A birthday of " + month + " " + day + " makes you an " + zodiacSign + "!");
                System.out.println("Aries is the first sign of the zodiac and is known for its boldness, " +
                                    "assertiveness, and leadership qualities. People born under this sign are often " +
                                    "energetic, competitive, and determined.");
            }
        }
        if (month.equals("may")){
            if (day >= 21 && day <= 31){
                zodiacSign = "Gemini";
                System.out.println("A birthday of " + month + " " + day + " makes you an " + zodiacSign + "!");
                System.out.println("Gemini is an air sign known for its adaptability, wit, and curiosity. " +
                                    "Geminis are often social, communicative, and can easily adapt to " +
                                    "different situations and environments.");
            } else if (day >= 1 && day <= 20) {
                zodiacSign = "Taurus";
                System.out.println("A birthday of " + month + " " + day + " makes you an " + zodiacSign + "!");
                System.out.println("Taurus is an earth sign associated with stability, practicality, and " +
                                    "patience. Taureans are often reliable, persistent, and have a love " +
                                    "for comfort and the finer things in life.");
            }
        }
        if (month.equals("june")){
            if (day >= 22 && day <= 30){
                zodiacSign = "Cancer";
                System.out.println("A birthday of " + month + " " + day + " makes you an " + zodiacSign + "!");
                System.out.println("Cancer is a water sign associated with emotions, nurturing, and empathy. " +
                                    "Cancers are often caring, intuitive, and deeply connected to their " +
                                    "family and loved ones.");
            } else if (day >= 1 && day <= 21) {
                zodiacSign = "Gemini";
                System.out.println("A birthday of " + month + " " + day + " makes you an " + zodiacSign + "!");
                System.out.println("Gemini is an air sign known for its adaptability, wit, and curiosity. " +
                                    "Geminis are often social, communicative, and can easily adapt to " +
                                    "different situations and environments.");
            }
        }
        if (month.equals("july")){
            if (day >= 23 && day <= 31){
                zodiacSign = "Leo";
                System.out.println("A birthday of " + month + " " + day + " makes you an " + zodiacSign + "!");
                System.out.println("Leo is a fire sign known for its confidence, charisma, and creativity. " +
                                    "Leos are often natural leaders, seeking attention and recognition, " +
                                    "and have a warm-hearted nature.");
            } else if (day >= 1 && day <= 22) {
                zodiacSign = "Cancer";
                System.out.println("A birthday of " + month + " " + day + " makes you an " + zodiacSign + "!");
                System.out.println("Cancer is a water sign associated with emotions, nurturing, and empathy. " +
                                    "Cancers are often caring, intuitive, and deeply connected to their " +
                                    "family and loved ones.");
            }
        }
        if (month.equals("august")){
            if (day >= 23 && day <= 31){
                zodiacSign = "Virgo";
                System.out.println("A birthday of " + month + " " + day + " makes you an " + zodiacSign + "!");
                System.out.println("Virgo is an earth sign associated with precision, practicality, " +
                                    "and attention to detail. Virgos are often analytical, " +
                                    "hardworking, and strive for perfection.");
            } else if (day >= 1 && day <= 22) {
                zodiacSign = "Leo";
                System.out.println("A birthday of " + month + " " + day + " makes you an " + zodiacSign + "!");
                System.out.println("Leo is a fire sign known for its confidence, charisma, and creativity. " +
                                    "Leos are often natural leaders, seeking attention and recognition, " +
                                    "and have a warm-hearted nature.");
            }
        }
        if (month.equals("september")){
            if (day >= 23 && day <= 30){
                zodiacSign = "Libra";
                System.out.println("A birthday of " + month + " " + day + " makes you an " + zodiacSign + "!");
                System.out.println("Libra is an air sign known for its sense of balance, diplomacy, and fairness. " +
                                    "Librans are often social, charming, and seek harmony and peace " +
                                    "in their relationships.");
            } else if (day >= 1 && day <= 22) {
                zodiacSign = "Virgo";
                System.out.println("A birthday of " + month + " " + day + " makes you an " + zodiacSign + "!");
                System.out.println("Virgo is an earth sign associated with precision, practicality, " +
                                    "and attention to detail. Virgos are often analytical, " +
                                    "hardworking, and strive for perfection.");
            }
        }
        if (month.equals("october")){
            if (day >= 23 && day <= 31){
                zodiacSign = "Scorpio";
                System.out.println("A birthday of " + month + " " + day + " makes you an " + zodiacSign + "!");
                System.out.println("Scorpio is a water sign associated with intensity, passion, and emotional depth. " +
                                    "Scorpios are often determined, mysterious, and possess strong " +
                                    "emotional and intuitive powers.");
            } else if (day >= 1 && day <= 22) {
                zodiacSign = "Libra";
                System.out.println("A birthday of " + month + " " + day + " makes you an " + zodiacSign + "!");
                System.out.println("Libra is an air sign known for its sense of balance, diplomacy, and fairness. " +
                                    "Librans are often social, charming, and seek harmony and peace " +
                                    "in their relationships.");
            }
        }
        if (month.equals("november")){
            if (day >= 22 && day <= 30){
                zodiacSign = "Sagittarius";
                System.out.println("A birthday of " + month + " " + day + " makes you an " + zodiacSign + "!");
                System.out.println("Sagittarius is a fire sign known for its adventurous spirit, optimism, and love " +
                                    "for freedom. Sagittarians are often open-minded, enthusiastic, and " +
                                    "seekers of knowledge and experiences.");
            } else if (day >= 1 && day <= 21) {
                zodiacSign = "Scorpio";
                System.out.println("A birthday of " + month + " " + day + " makes you an " + zodiacSign + "!");
                System.out.println("Scorpio is a water sign associated with intensity, passion, and emotional depth. " +
                                    "Scorpios are often determined, mysterious, and possess strong " +
                                    "emotional and intuitive powers.");
            }
        }
        if (month.equals("december")){
            if (day >= 22 && day <= 31){
                zodiacSign = "Capricorn";
                System.out.println("A birthday of " + month + " " + day + " makes you an " + zodiacSign + "!");
                System.out.println("Capricorn is an earth sign associated with ambition, responsibility, and " +
                                    "discipline. Capricorns are often hardworking, practical, and strive " +
                                    "for long-term success.");
            } else if (day >= 1 && day <= 21) {
                zodiacSign = "Sagittarius";
                System.out.println("A birthday of " + month + " " + day + " makes you an " + zodiacSign + "!");
                System.out.println("Sagittarius is a fire sign known for its adventurous spirit, optimism, and love " +
                                    "for freedom. Sagittarians are often open-minded, enthusiastic, and " +
                                    "seekers of knowledge and experiences.");
            }
        }
    }
}