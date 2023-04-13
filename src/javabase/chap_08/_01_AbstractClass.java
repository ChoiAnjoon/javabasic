package javabase.chap_08;

import javabase.chap_08.camera.Camera;
import javabase.chap_08.camera.FactoryCam;
import javabase.chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction)
        // abstract
        // 추상 클래스 (아직 완성되지 않은 클래스)
        // 추상 메소드 (추상 클래스에서만 사용 가능한, 껌데기만 있는 메소드)

        // Camera camera = new Camera();
        // 카메라는 객체를 만들 수 없음 추상클래스이기 때문에

        Camera factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        Camera speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }

}
