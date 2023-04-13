package javabase.chap_08;

import javabase.chap_08.camera.SpeedCam;
import javabase.chap_08.detector.AccidentDetector;
import javabase.chap_08.reporter.VideoReporter;

public class _Quiz_08 {
    public static void main(String[] args) {
        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetector(new AccidentDetector());
        speedCam.setReporter(new VideoReporter());
        speedCam.detect();
        speedCam.report();
    }
}
