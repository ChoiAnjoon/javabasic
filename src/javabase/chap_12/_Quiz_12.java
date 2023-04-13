package javabase.chap_12;

// A 상품 5개, B 상품 5개
class ProductA {
    public int productNum;
    public String productName;

    public ProductA() {
        this(1, "A");
    }

    public ProductA(int productNum, String productName) {
        this.productNum = productNum;
        this.productName = productName;
    }
    // 메소드 정의시 this를 쓰는 경우와 안쓰는 경우의 차이점을 확실하게는 모르겠다.
    // this는 부모 클래스에서 사용 --> 왜냐하면 자식클래스이 부모 클래스를 상속받았을때, 생성자는 새로 정의 함으로
    // 새로 정의된 자식클래스의 생성자를 반영하기 위해서
    // 하지만 this 안붙혀도 가능하네... 뭐지...
    public void pack() {
        System.out.println(this.productName + " 상품 준비 " + this.productNum + "/5");
        this.productNum++;
    }
}

class ProductB extends ProductA {
    public ProductB() {
        super(1, "B");
    }
}

public class _Quiz_12 {
    public static void main(String[] args) {
        ProductA productA = new ProductA();
        ProductB productB = new ProductB();

        // 상품 A 준비 Thread 만들기 (Runnable 인터페이스를 구현해서 Thread 만들기)
        Runnable pack1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    productA.pack();
                }
                System.out.println(" == A 상품 포장 준비 완료 == ");
            }
        };

        // 상품 B 준비 Thread 만들기 (람다식을 이용하여 Thread 구현)
        Runnable pack2 = () -> {
            for (int i = 1; i <= 5; i++) {
                productB.pack();
            }
            System.out.println(" == B 상품 포장 준비 완료 == ");
        };

        // 포장하는 스레드 만들기
//        Runnable packages = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1; i <= 5; i++) {
//                    System.out.println("세트 상품 포장" + i + "/5");
//                }
//                System.out.println("세트 상품 포장 완료");
//            }
//        };

        // 만든 스래드 지정
        Thread pack1Thread = new Thread(pack1);
        Thread pack2Thread = new Thread(pack2);
        // Thread packagesThread = new Thread(packages);

        pack1Thread.start();
        pack2Thread.start();

        try {
            pack1Thread.join();
            pack2Thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // packagesThread.start();
        packages();
    }

    public static void packages() {
        System.out.println(" == 세트 상품 포장 시작 == ");
        for (int i = 1; i <= 5; i++) {
            System.out.println("세트 상품 포장 " + i + "/5");
        }
        System.out.println(" == 세트 상품 포장 완료 == ");
    }

}
