package com.abhinav;

class singleton_class {
    private singleton_class() {

    }

    static private singleton_class instance;

    public static singleton_class getInstance() {
        if(instance == null) {
            instance = new singleton_class();
        }
        instance = new singleton_class();

        return instance;
    }
}


public class singleton {
    public static void main(String[] args) {
        singleton_class obj1 = singleton_class.getInstance();
        singleton_class obj2 = singleton_class.getInstance();
        singleton_class obj3 = singleton_class.getInstance();
        singleton_class obj4 = singleton_class.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
    }
}
