package ChristmasSong;

public class TwelveDaysOfChristmas {
    public void printSong(){
        for (int day = 1; day <= 12; day++){
            System.out.print("On the ");
            switch (day) {
                case 1 -> System.out.print("first ");
                case 2 -> System.out.print("second ");
                case 3 -> System.out.print("third ");
                case 4 -> System.out.print("fourth ");
                case 5 -> System.out.print("fifth ");
                case 6 -> System.out.print("sixth ");
                case 7 -> System.out.print("seventh ");
                case 8 -> System.out.print("eighth ");
                case 9 -> System.out.print("ninth ");
                case 10 -> System.out.print("tenth ");
                case 11 -> System.out.print("eleventh ");
                case 12 -> System.out.print("twelfth ");
            }
            System.out.println("day of Christmas my true love sent to me");
            switch (day){
                case 12:
                    System.out.println("Twelve lords a leaping,");
                case 11:
                    System.out.println("Eleven ladies dancing,");
                case 10:
                    System.out.println("Ten pipers piping,");
                case 9:
                    System.out.println("Nine drummers a drumming,");
                case 8:
                    System.out.println("Eight maids a milking,");
                case 7:
                    System.out.println("Seven swans a swimming,");
                case 6:
                    System.out.println("Six geese a laying,");
                case 5:
                    System.out.println("Five gold rings,");
                case 4:
                    System.out.println("Four colly birds,");
                case 3:
                    System.out.println("Three French hens,");
                case 2:
                    System.out.println("Two turtle doves, and");
                case 1:
                    System.out.println("a Partridge in a pear tree.");
            }
            System.out.println();
        }

    }
}

