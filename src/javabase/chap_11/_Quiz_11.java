package javabase.chap_11;


// 에러코드
// 0 (에러 없음), 1 (판매 시간 아님), 2 (매진)

// 0 인 경우? 상품 구매를 완료하였습니다.
// 1 인 경우? 상품 구매 가능 시간이 아닙니다. / 상품 구매는 20시부터 가능합니다.
// 2 인 경우? 해당 상품은 매진되었습니다. / 다음 기회에 이용해주세요.


// 사용자 정의 예외 클래스 만들기

public class _Quiz_11 {
    public static void main(String[] args) {

        class time extends Exception {
            public time(String message) {
                super(message);
            }
        }

        class product extends Exception {
            public product(String message) {
                super(message);
            }
        }

        int errorCode = 1;

        try {
            if (errorCode == 0) {
                System.out.println("상품 구매를 완료하였습니다.");
            } else if (errorCode == 1) {
                throw new time("상품 구매 가능 시간이 아닙니다.");
            } else if (errorCode == 2) {
                throw new product("해당 상품은 매진되었습니다.");
            }
        } catch (time e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다.");
        } catch (product e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요.");
        }


    }
}
