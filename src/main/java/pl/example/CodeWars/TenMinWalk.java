package pl.example.CodeWars;

//        You live in the city of Cartesia where all roads are laid out in a perfect grid.
//        You arrived ten minutes too early to an appointment, so you decided to take
//        the opportunity to go for a short walk. The city provides its citizens with
//        a Walk Generating App on their phones -- everytime you press the button it
//        sends you an array of one-letter strings representing directions to walk
//        (eg. ['n', 's', 'w', 'e']). You always walk only a single block for each
//        letter (direction) and you know it takes you one minute to traverse one city
//        block, so create a function that will return true if the walk the app gives
//        you will take you exactly ten minutes (you don't want to be early or late!)
//        and will, of course, return you to your starting point. Return false otherwise.
//
//        Note: you will always receive a valid array containing a random assortment
//        of direction letters ('n', 's', 'e', or 'w' only). It will never give you an empty
//        array (that's not a walk, that's standing still!).

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10)
            return false;

        long nCount = new String(walk).chars().filter(n -> n == 'n').count();
        long sCount = new String(walk).chars().filter(s -> s == 's').count();
        long wCount = new String(walk).chars().filter(w -> w == 'w').count();
        long eCount = new String(walk).chars().filter(e -> e == 'e').count();

        return nCount == sCount && wCount == eCount;
    }

    public static void main(String[] args) {
        TenMinWalk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'});
        TenMinWalk.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'});
        TenMinWalk.isValid(new char[]{'w'});
        TenMinWalk.isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'});
    }
}
