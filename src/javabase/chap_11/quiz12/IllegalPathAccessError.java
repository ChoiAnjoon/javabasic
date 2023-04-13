package javabase.chap_11.quiz12;

public class IllegalPathAccessError extends Error{
    private String path;

    public IllegalPathAccessError(String path) {
        super();
        this.path = path;
    }

    @Override
    public String getMessage() {
        return path + " 파일은 존재하지 않는다." + super.getMessage();
    }
}
