package nextstep.courses.domain.field;


import java.util.stream.Stream;

public enum SessionType {
    FREE("free"),
    PAID("paid");

    private String type;

    SessionType(String type) {
        this.type = type;
    }

    public static SessionType of (String type) {
        return Stream.of(valueOf(type))
                .filter(sessionType ->
                        sessionType.type.equals(type))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("없는 타입입니다."));
    }
}
