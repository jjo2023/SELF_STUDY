package TheEssenceOfJava;
// Youtube 65강 Ch6-29 메서드 간의 호출과 참조

// ▶ static 메서드는 인스턴스 변수를 사용 할 수 없다.

public class TestClass2 {
    int iv; //인스턴스 변수
    static int cv; //static 변수(=클래스 변수)

    void iM(){ //인스턴스 메서드
        System.out.println(iv); //인스턴스 변수 사용
        System.out.println(cv); //클래스 변수 사용
    }

    static void sM(){ //static 메서드
       //System.out.println(iv); //에러! 인스턴스 변수를 사용 할 수 없다.
        System.out.println(cv); //클래스 변수는 가능

    }
}
