package racingcar.view;

public class SystemOutputErrorView {

    private static String ERROR_PREFIX = "[ERROR] ";

    public static void printError(String message) {
        System.out.println(ERROR_PREFIX + message);
    }

}
