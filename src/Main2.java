import java.time.Duration;
import java.time.Instant;

public class Main2 {
    public static void main(String[] args) {
        Instant startTime = Instant.now();

        long elapsedTime = 0;
        int count = 0;

        do {
            elapsedTime = Duration.between(startTime, Instant.now()).toMillis();
            count++;
        } while (elapsedTime <= 1000);
        System.out.println(count); // 18,082,270
    }

}
