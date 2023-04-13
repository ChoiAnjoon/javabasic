package javabase.chap_07;

import javabase.chap_07.camera.Camera;
import javabase.chap_07.camera.FactoryCam;
import javabase.chap_07.camera.SpeedCam;

import java.util.Calendar;
import java.util.Objects;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성
        // 즉 형태가 다향하다..

        // class Person : 사람
        // class Student extends Person : 학생 (학생은 사람이다. Student is a Person)
        // class Teacher extends Person : 선생 (선생은 사함이다. Teacher is a Person)

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("---------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam: cameras) {
            cam.showMainFeature();
        }

        System.out.println("------------------");
        // factoryCam.detectFire();
        // speedCam.checkSpeed();
        // speedCam.recognizeLicensePlate();
        // 다형성을 이용했음으로 자식객체의 고유 함수를 쓸 수 없다.

        if (camera instanceof Camera) {
            System.out.println("카메라 입니다.");
        }

        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam) factoryCam).detectFire();
        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam) speedCam).recognizeLicensePlate();
        }

//        Object[] objs = new Object[];
//        objs[0] = new Camera();
//        objs[1] = new FactoryCam();
//        objs[2] = new SpeedCam();
        // object 객체를 가져와서 한꺼번엔 어떠한 클래스든 관리 할 수 있다는 것을 참고로 알아 두자
    }
}
