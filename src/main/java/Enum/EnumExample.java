package Enum;

public class EnumExample {

    public static void main(String args[]) {
//        for (Season s : Season.values())
//            System.out.println(s + " "+s.orderNumber);

    }

    enum Season {
        WINTER(5),
        SPRING(10),
        SUMMER(15),
        FALL(20);

        private int orderNumber;

        private Season(int orderNumber) {
            this.orderNumber = orderNumber;
        }
    }

}
