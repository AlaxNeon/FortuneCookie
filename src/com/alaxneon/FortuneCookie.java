package com.alaxneon;

import java.util.Random;
import java.util.Scanner;

public class FortuneCookie {

    public static void main(String[] args) {
        fortuneCookie();
    }

    public static void fortuneCookie(){
//The fortunes in the cookie
        String[] fortunes = {
                "The fortune you seek is in another cookie.",
                "The fortune you seek is in another cookie.",
                "A closed mouth gathers no feet.",
                "A conclusion is simply the place where you got tired of thinking.",
                "A cynic is only a frustrated optimist.",
                "If a turtle doesn’t have a shell, is it naked or homeless?",
                "It’s about time I got out of that cookie.",
                "Help! I am being held prisoner in a fortune cookie factory.",
                "Fortune not found? Abort, Retry, Ignore.",
                "Don’t forget you are always on our minds.",
                "Don’t behave with cold manners.",
                "Because of your melodic nature, the moonlight never misses an appointment.",
                "Because of your melodic nature, the moonlight never misses an appointment.",
                "Actions speak louder than fortune cookies.",
                "You can always find happiness at work on Friday.",
                "The road to riches is paved with homework.",
                "You will be hungry again in one hour.",
                "The world may be your oyster, but it doesn't mean you'll get its pearl.",
                "We don’t know the future, but here’s a cookie.",
                "The greatest danger could be your stupidity.",
                "Some men dream of fortunes, others dream of cookies.",
                "He who throws dirt is losing ground.",
                "He who laughs last is laughing at you.",
                "He who laughs at himself never runs out of things to laugh at.",
                "Flattery will go far tonight.",
                "Do not mistake temptation for opportunity.",
                "An alien of some sort will be appearing to you shortly.",
                "You will live long enough to open many fortune cookies.",
                "If you look back, you’ll soon be going that way.",
                "A fanatic is one who can't change his mind, and won't change the subject.",
                "You will die alone and poorly dressed.",
                "A foolish man listens to his heart. A wise man listens to cookies.",
                "Never forget a friend. Especially if he owes you.",
                "Never wear your best pants when you go to fight for freedom.",
                "Only listen to the fortune cookie; disregard all other fortune telling units.",
                "It is a good day to have a good day.",
                "All fortunes are wrong except this one." +
                        "You love Chinese food.",
                "Someone will invite you to a Karaoke party.",
                "You are not illiterate.",
                "Hard work pays off in the future. Laziness pays off now.",
                "You think it’s a secret, but they know."
        };

        Random random = new Random();
        int fortune = random.nextInt(fortunes.length);

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, I am a Fortune Cookie.");
        System.out.println("Break me to know your Fortune");
        System.out.println("Type 'Break' to open me up");
        String reply = input.nextLine();

        if (reply.equals("Break")){
            System.out.println("Your Fortune:");
            System.out.println(fortunes[fortune]);
            System.out.println();
            System.out.println("Thank You");
            System.out.println("Hope you liked your Fortune. ;)");
        }else {
            System.out.println("Thank You");
        }
    }
}