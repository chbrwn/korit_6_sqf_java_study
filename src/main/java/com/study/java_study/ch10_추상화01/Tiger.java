package com.study.java_study.ch10_추상화01;

public class Tiger extends Animal{

    private int power;

    public Tiger() {
        super(); // Animal객체 생성자 호출. super();는 기본으로 생략되어있고 무조건 제일 위에 위치.
        System.out.println("호랑이 객체 생성");
    }

    public Tiger(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }

    // 재정의 -> 상속관계에서만 가능
    @Override // @ 어노테이션. @Override는 재정의 표시. 단축키 Ctrl + o
    public void move() {
        System.out.println("호랑이가 네발로 뛰어갑니다.");
        super.move();
    }

    public void hunt() {
        System.out.println("호랑이가" + power + "의 힘으로 사냥을 합니다.");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "power=" + power +
                "} " + super.toString();
    }

}
