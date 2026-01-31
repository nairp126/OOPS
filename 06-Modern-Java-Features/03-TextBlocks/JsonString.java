// Package removed to match directory structure

/**
 * Modern Java (Java 15+): Text Blocks.
 * 
 * Problem: Writing JSON, HTML, or SQL in Java strings was a nightmare of
 * escapng quotes (\") and newlines (\n).
 * Solution: Triple quotes (""").
 */
public class JsonString {
        public static void main(String[] args) {

                // 1. The Old Way
                String jsonOld = "{\n" +
                                "  \"name\": \"Alice\",\n" +
                                "  \"role\": \"Admin\"\n" +
                                "}";

                // 2. The New Way
                // Preserves formatting perfectly. No need to escape double quotes.
                String jsonNew = """
                                {
                                  "name": "Alice",
                                  "role": "Admin"
                                }
                                """;

                System.out.println("--- Old JSON ---");
                System.out.println(jsonOld);

                System.out.println("\n--- New JSON (Text Block) ---");
                System.out.println(jsonNew);

                // Usage for SQL
                String query = """
                                SELECT * FROM users
                                WHERE age > 18
                                ORDER BY name
                                """;
                System.out.println("\n--- SQL Query ---");
                System.out.println(query);
        }
}
