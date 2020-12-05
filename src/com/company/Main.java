package com.company;

class Yaz {
    public static void main(String[] args) {
        signal();
        wash();
        System.out.println(engine());
        System.out.println(start());
        System.out.println(km());
    }


    static void signal () {
        String signal = "ту ту ту";
        System.out.println(signal);
    }

    static void wash () {
        String wash = "мою окно";
        System.out.println(wash);
    }

    static String engine () {
        String engine = "модель двигателя";
        return engine;

    }

    static String start () {
        String start = "Врумммм";
        return start;
    }

    static double km () {
        double km = 111;
        return km;
    }
}

