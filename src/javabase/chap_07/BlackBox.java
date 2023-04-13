package javabase.chap_07;
// 클래스 이름을 만들때는 대문자로 시작
public class BlackBox {
    String modelName; // 모델명
    String resolution; // 해상도
    int price;
    String color;
    static boolean canAutoReport = false; // 클래스 변수
    int serialNumber; // 시리얼 번호
    static int count = 0; // 클래스 변수

    // 생성자
    BlackBox () {
//        System.out.println("기본생성자 호출");
//        this.serialNumber = ++count;
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);
    }
    // python의 init과 같은 것 속성 정의
    BlackBox (String modelName, String resolution, int price, String color) {
//        this(); // 앞의 생성자(기본 생성자)의 동작을 수행한 후 밑의 동작을 수행
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    void autoReport () {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고 합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) { // 일반 영상
            return 9;
        } else if (type == 2) { // 이벤트 영상
            return 1;
        }
        return 10;
    }

    // showDataTime : 날짜정보 표시여부
    // showSpeed : 속도정보 표시여부
    // min : 영상 기록 단위(분)
    void record(boolean showDataTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDataTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도 정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record() {
        record(true, true, 5);
    }

    static void callServiceCenter() { // 클래스 메소드
        System.out.println("서비스 센터(1588-0000)로 연결합니다.");
    }

    void appendModelName(String modelName) {
        this.modelName += modelName;
    }

    // Getter & Setter
    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        } else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

}
