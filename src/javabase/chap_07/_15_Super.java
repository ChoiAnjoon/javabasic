package javabase.chap_07;

import javabase.chap_07.camera.FactoryCam;
import javabase.chap_07.camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println("------------");
        speedCam.takePicture();

    }
}
