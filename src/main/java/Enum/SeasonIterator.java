package Enum;

public class SeasonIterator {
    public static void main(String[] args) {
        for (EnumExample.Season s : EnumExample.Season.values()) {
            System.out.println();
        }
        System.out.println(EnumExample.Season.SPRING);
    }
}
