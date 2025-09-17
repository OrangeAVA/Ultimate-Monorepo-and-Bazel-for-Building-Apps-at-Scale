package com.hellotest;

import java.util.logging.Logger;

/**
 * Main class for running the HelloTest application.
 * <p>
 * This class is a utility class and cannot be instantiated.
 * It provides a main method to run the application.
 */
public final class HelloTestMain {
    /**
     * Logger for the HelloTestMain class.
     */
    private static final Logger LOGGER = Logger.getLogger(HelloTestMain.class.getName());
    /**
     * Minimum number of arguments required.
     */
    private static final int MIN_ARGS = 1;

    /**
     * Private constructor to prevent instantiation.
     */
    private HelloTestMain() {
        // Utility class
    }

    /**
     * Main entry point for the application.
     *
     * @param args the command line arguments; expects at least one argument
     *             for the name
     */
    public static void main(final String[] args) {
        if (args.length < MIN_ARGS) {
            if (LOGGER.isLoggable(java.util.logging.Level.WARNING)) {
                LOGGER.warning("Please provide a name as an argument");
            }
            return;
        }
        final GreeterService service = new GreeterService();
        if (LOGGER.isLoggable(java.util.logging.Level.INFO)) {
            LOGGER.info(service.greet(args[0]));
        }
    }
}
