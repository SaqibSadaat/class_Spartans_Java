package week_10_06042024.day_2.RandomNumbersProcessor;

import week_10_06042024.day_2.gift_game.GiftAssigner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Objects
        GiftAssigner giftAssigner = new GiftAssigner();

        // Assign Students
        giftAssigner.addStudent("");
        giftAssigner.addStudent("");
        giftAssigner.addStudent("");
        giftAssigner.addStudent("");
        giftAssigner.addStudent("");

        // Assign Gifts
        giftAssigner.assignGifts();
        // Reveal Winners
        giftAssigner.revealWinners();

    }
}
