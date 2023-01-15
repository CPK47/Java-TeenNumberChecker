import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Test Data");
        System.out.println(TeenNumberChecker.hasTeen(9, 99, 19));
        System.out.println(TeenNumberChecker.hasTeen(23, 15, 42));
        System.out.println(TeenNumberChecker.hasTeen(22, 33, 44));
        System.out.println(TeenNumberChecker.isTeen(9));
        System.out.println(TeenNumberChecker.isTeen(13));
    }

    public static class TeenNumberChecker
    {
        static int[] aTeen = {13, 14, 15, 16, 17, 18, 19};

        public static boolean hasTeen(int iNumber1, int iNumber2, int iNumber3)
        {
            for(int var : aTeen)
            {
                if(var == iNumber1 || var == iNumber2 || var == iNumber3) return true;
            }
            return false;
        }

        public static boolean isTeen(int iNumber1)
        {
            for(int var : aTeen)
            {
                if(var == iNumber1) return true;
            }
            return false;
        }
    }
}