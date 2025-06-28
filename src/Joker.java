public class Joker {

    private final String[] rarities = {
            "common",
            "uncommon",
            "rare",
            "legendary"
    };

    private final String[] abilities = {
            "+Mult",
            "+Chips",
            "xMult",
            "+Mult & +Chips",
            "Creation",
            "Retrigger/Copy",
            "Economy",
            "Hands/Discards",
            "Other"
    };

    String name, rarity, ability;
    boolean scaling, rng;
    int cost;

    public Joker() {
        this.name = "Default name";
        this.cost = -1;
        this.rarity = "No rarity";
        this.ability = "No ability";
        this.scaling = false;
        this.rng = false;
    }

    public Joker(String name, int cost,
                 String rarity, String ability,
                 boolean scaling, boolean rng) {
        this.name = name;
        this.cost = cost;
        this.rarity = rarity;
        this.ability = ability;
        this.scaling = scaling;
        this.rng = rng;
    }
}
