import java.time.Duration;
import java.time.Instant;

public class Main {

    public static void main(String[] args) {
        Instant startTime = Instant.now();

        int n = 100000000;

        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        Instant endTime = Instant.now();
        System.out.println(String.format("Duration: %d ms", Duration.between(startTime, endTime).toMillis())); //Duration: 364701 ms
    }
}
