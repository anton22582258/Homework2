public class Main {

    public static void main(String[] args) {
        // Задача  1
        var dog = 8.0;
        System.out.println( dog );
        var cat = 3.6;
        System.out.println( cat );
        var paper = 763789;
        System.out.println( paper );
        // Задача 2
        dog = dog + 4;
        System.out.println( dog );
        cat = cat + 4;
        System.out.println( cat );
        paper = paper + 4;
        System.out.println( paper );
        // Задача 3
        dog = dog - 3.5;
        System.out.println( dog );
        cat = cat - 1.6;
        System.out.println( cat );
        paper = paper - 7639;
        System.out.println( paper );
        // Задача 4
        var friend = 19;
        System.out.println( friend );
        friend = 19 + 2;
        System.out.println( friend );
        friend = friend / 7;
        System.out.println( friend );
        // Задача 5
        var frog = 3.5;
        System.out.println( frog );
        frog = frog * 10;
        System.out.println( frog );
        frog = frog / 3.5;
        System.out.println( frog );
        frog = frog + 4;
        System.out.println( frog );
        // Задача 6
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var result1 = boxerOne + boxerTwo;
        System.out.println( result1 );
        var result2 = boxerTwo - boxerOne;
        System.out.println( result2 );
        // Задача 7
        result2 = boxerTwo - boxerOne;
        System.out.println( result2 );
        var result3 = boxerTwo % boxerOne;
        System.out.println( result3 );
        // Задача 8
        var workingHours1 = 640;
        var workingHours2 = 8;
        var personal1 = workingHours1 / workingHours2;
        System.out.println( " Всего работников в компании - " + personal1 + " человек ." );
        var personal2 = personal1 + 94;
        var workingHours3 = personal2 * workingHours2;
        System.out.println( " Если в компании работает " + personal2 + " человека, то всего "
                + workingHours3 + " часов. "  );

    }
}