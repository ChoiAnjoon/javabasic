package javabase.chap_08;

import javabase.chap_08.camera.FactoryCam;
import javabase.chap_08.detector.AdvancedFireDetector;
import javabase.chap_08.detector.Detectable;
import javabase.chap_08.detector.FireDetector;
import javabase.chap_08.reporter.NormalReporter;
import javabase.chap_08.reporter.Reportable;
import javabase.chap_08.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("---------------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("---------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}
