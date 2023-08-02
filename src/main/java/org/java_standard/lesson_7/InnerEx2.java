package org.java_standard.lesson_7;

public class InnerEx2 {
    class InstanceInner {}
    static class StaticInner {}

    InstanceInner iv = new InstanceInner();
    static StaticInner cv = new StaticInner();

    static void staticMethod(){
        // static 멤버는 인스턴스 멤버에 직접 접근할 수 없다.
        // InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        InnerEx2 outer = new InnerEx2();
        InstanceInner obj1 = outer.new InstanceInner();
    }

    void instanceMethod(){
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
        // LocalInner lv = new LocalInner();
    }

    void myMethod(){
        class LocalInner {}
        LocalInner lv = new LocalInner();
    }
}
