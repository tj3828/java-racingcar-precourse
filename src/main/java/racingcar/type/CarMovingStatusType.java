package racingcar.type;

public enum CarMovingStatusType {

    NONE(0),
    MOVING(1);

    private final int code;

    CarMovingStatusType(int code) {
        this.code = code;
    }

}
