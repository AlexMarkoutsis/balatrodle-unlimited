import java.io.*;
import java.util.*;

public class JokerLoader {

    public static List<Joker> loadFromCSV(String path) {
        List<Joker> jokers = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length != 6) continue;

                String name = parts[0].trim();
                int cost = Integer.parseInt(parts[1].trim());
                String rarity = parts[2].trim();
                String ability = parts[3].trim();
                boolean scaling = Boolean.parseBoolean(parts[4].trim());
                boolean rng = Boolean.parseBoolean(parts[5].trim());

                jokers.add(new Joker(name, cost, rarity, ability, scaling, rng));
            }
        } catch (IOException e) {
            System.err.println("Error loading joker data: " + e.getMessage());
        }

        return jokers;
    }
}
