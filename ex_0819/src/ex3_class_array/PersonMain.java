package ex3_class_array;

public class PersonMain {

    public static void main(String[] args) {

        Person[] p1 = new Person[2]; 
        //클레스를 배열로 만들었다면
        //반드시 각 index의 객체화를 해줘야 한다.
        //p1[0] = new Person();
        //p1[1] = new Person();

        for(int i = 0 ; 1< p1.length; i++);{
            p1[1] = new Person();
        }

        p1[0].setName("홍길동");
        p1[0].setAge(20);

        p1[1].setName("김길동");
        p1[1].setAge(25);

        for(int i= 0; i< p1.length; i++){
            System.out.printf("%s / %d\n",p1[i].getName(), p1[i].getAge());
        }

       

    }// main

}
