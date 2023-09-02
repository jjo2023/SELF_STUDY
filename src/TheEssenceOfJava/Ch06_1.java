package TheEssenceOfJava;

public class Ch06_1 {
    public static void main(String[] args) {
        Tv t; // t라는 리모콘 생성 = 변수 t를 선언
        t = new Tv(); // new를 이용해서 Tv 객체 생성, 참조변수 t가 새 객체를 가르킴
        // ↑ 객체 생성


        //객체를 사용한다는 것은 객체가 가진 멤버를 사용한다는 것이고
        //멤버는 변수와 메소드를 말함

        // ↓ 객체 사용, 뭘로 사용 하냐...리모콘으로 사용할거야!!!
        t.channel =7; //참조변수 t를 이용한 객체 사용, 변수 사용
        t.channelDown(); //메소드 사용
        System.out.println(t.channel);
    }
}
class Tv{
    //Tv의 속성(멤버변수)
    String color; //색상
    boolean power; //전원상태(on/off)
    int channel; //채널

    //Tv의 기능(메서드)
    void power(){power = !power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}
}