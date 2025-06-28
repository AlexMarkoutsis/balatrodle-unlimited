public class executor {

    public static void main(String[] args) {

        printWelcome();
    }

    private static void printWelcome() {
        System.out.println("========================= BALATRODLE UNLIMITED =========================");
        System.out.println();
        System.out.println("HOW TO PLAY:");
        System.out.println("Guess Jokers to reveal clues to help you figure out the chosen Joker!");
        System.out.println();
        System.out.println("There are three clues:");
        System.out.println("1. Correct: This is the correct answer.");
        System.out.println("2. Close: This is similar to the correct answer.");
        System.out.println("3. Incorrect: This is a complete wrong answer.");
        System.out.println();
        System.out.println("The clues correspond to 5 criteria:");
        System.out.println("1. Cost: This is the base cost for the Joker without any vouchers.");
        System.out.println("2. Rarity: This is the rarity of the Joker (Common, Uncommon, Rare, Legendary).");
        System.out.println("3. Ability: This is what the Joker does (more on this in the next section).");
        System.out.println("4. Scaling: This is true where the value displayed on the Joker increases or decreases.");
        System.out.println("5. RNG: This is true for Jokers that have listed probabilities.");
        System.out.println();
        System.out.println("Abilities:");
        System.out.println("1. +Mult: Adds Mult");
        System.out.println("2. +Chips: Adds Chips");
        System.out.println("3. xMult: Multiplies Mult");
        System.out.println("4. +Mult & +Chips: Adds Mult and Chips");
        System.out.println("5. Creation: Creates a card of any type");
        System.out.println("6. Retrigger/Copy: Retriggers cards or copies effects");
        System.out.println("7. Economy: Earns money or modifies prices");
        System.out.println("8. Hands/Discards: Affects hands/discards amount or makes hands easier to play");
        System.out.println("9. Other: All other abilities");
        System.out.println();
        System.out.println("And that's it! Easy peasy! Ready to start a game?");
    }
}
