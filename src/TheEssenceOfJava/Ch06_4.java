package TheEssenceOfJava;

public class Ch06_4 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();   // 2. 인스턴스 생성
        mm.printGugudan(12);    // 3. 메소드 호출 //변수.메소드명();
    }
}

class MyMath{     // 1.메서드 작성
    void printGugudan(int dan){
        if (!(2<=dan && dan <=9))
            return; //입력받은 dan이 2~9아니면, 메서드 종료하고 돌아가기

        for (int i=1; i<=9; i++){
            System.out.printf("%d * %d = %d\n",dan,i,dan*i);
        }
    }
}
