import java.io.IOException;
import java.lang.ProcessBuilder;

public class PlanToolRunA {
    public static void main(String[] args) throws IOException {

        String folder = "C:\\Users\\DrSMarkham\\Downloads\\Araucaria3_1-NoVM-setup";
        String exe = "Araucaria3_1-NoVM-setup.exe";

        // Create and start Process with ProcessBuilder.
        ProcessBuilder p = new ProcessBuilder();
        p.command(folder + exe);
        p.start();
    }
}