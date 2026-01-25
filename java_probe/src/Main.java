public class Main {
    public static void main(String[] args) {
        System.out.println("Java Probe: System Check Passed.");
        System.out.println("Running on: " + System.getProperty("os.name"));
        System.out.println("Memory Available: " + (Runtime.getRuntime().freeMemory() / 1024 / 1024) + "MB");
    }
}
