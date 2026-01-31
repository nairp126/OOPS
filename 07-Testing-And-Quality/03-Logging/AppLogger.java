// Package removed to match directory structure

// NOTE: Requires SLF4J API (org.slf4j:slf4j-api)
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Logging Example.
 * 
 * Why NOT System.out.println?
 * 1. Performance: Logging is faster and can be async.
 * 2. Levels: You can turn off DEBUG logs in production without changing code.
 * 3. Destinations: You can write to files, databases, or cloud services.
 */
public class AppLogger {

    // Define the logger for this class
    private static final Logger logger = LoggerFactory.getLogger(AppLogger.class);

    public void processPayment(int amount) {

        // DEBUG: Useful for developers, hidden in production
        logger.debug("Starting payment process for ${}", amount);

        try {
            if (amount < 0) {
                // WARN: Something fishy, but not a crash
                logger.warn("Negative payment attempt: {}", amount);
                throw new IllegalArgumentException("Invalid amount");
            }

            // INFO: High-level business events
            logger.info("Payment of ${} processed successfully", amount);

        } catch (Exception e) {
            // ERROR: Something broke
            logger.error("Payment failed", e);
        }
    }

    public static void main(String[] args) {
        AppLogger app = new AppLogger();
        app.processPayment(100);
        app.processPayment(-50);
    }
}
