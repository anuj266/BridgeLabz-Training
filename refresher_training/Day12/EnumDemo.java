public class EnumDemo {

    public enum Season {
        WINTER("Cold"),
        SPRING("Mild"),
        SUMMER("Hot"),
        FALL("Cool");
        private final String description;
        Season(String description) {
            this.description = description;
        }
        public String getDescription() {
            return description;
        }
    }

    public static void main(String[] args) {

        for (Season s : Season.values()) {
            System.out.println(s.name() + " -> " + s.getDescription());
        }

        System.out.println("----");

        // Switch statement: different message for SUMMER vs everything else
        for (Season s : Season.values()) {
            switch (s) {
                case SUMMER -> System.out.println(s + ": Time to hit the beach!");
                default -> System.out.println(s + ": Just another regular season.");
            }
        }
    }
}