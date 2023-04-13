package javabase.chap_08.camera;

public abstract class Camera {
    public void takePicture() {
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo() {
        System.out.println("동영상을 녹화합니다.");
    }

    // 추상클래스 에서 정의 하는 추상 메소드 선언 방법
    public abstract void showMainFeature();
}
