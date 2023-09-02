package TheEssenceOfJava;

public class Ch06_2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println(t1.channel);
        System.out.println(t2.channel);

        t1.channel = 7; //channel 값을 7로 변경
        System.out.println("t1의 값을 7로 변경");

        t2 = t1; //참조변수 t1의 값을 t2에 저장
        System.out.println(t1.channel);
        System.out.println(t2.channel);

    }

}
