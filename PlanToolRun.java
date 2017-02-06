import java.io.IOException;
import java.lang.ProcessBuilder;

public class PlanToolRun {
    public static void main(String[] args) throws IOException {

        String folder = "C:\\Users\\DrSMarkham\\Downloads\\ES-JavaDON-2014 (1)(1).zip\\JavaDON";
        String exe = "JavaDON.jar";

        // Create and start Process with ProcessBuilder.
        ProcessBuilder p = new ProcessBuilder();
        p.command(folder + exe);
        p.start();
    }
}