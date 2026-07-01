class Outer {
    void show() {
        class LocalInner {
            void msg() {
                System.out.println("Inside Local Inner Class");
            }
        }
        LocalInner obj = new LocalInner();
        obj.msg();
    }
}

class Main{
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();
    }
}