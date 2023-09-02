package TheEssenceOfJava;
// Youtube 65강 Ch6-29 메서드 간의 호출과 참조

// ▶ static 메서드는 인스턴스 메서드를 호출 할 수 없다.
public class TestClass {
    void iM(){ //인스턴스 메서드
    }
    static void sM(){ //static 메서드
    }

    void iM2(){ //인스턴스 메서드
        iM(); //다른 인스턴스 메서드 호출
        sM(); //다른 static 메서드 호출
    }

    static void sM2(){ //static 메서드
        //iM(); //에러! 인스턴스 메서드를 호출 할 수 없다.
        sM(); //static 메서드는 호출 할 수 있다.

    }
}
