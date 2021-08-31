public class Main {
    public static void main(String[] args) {
        String noOverlap = "222abc222";
        String overlap = "222abc222";
        int[] arrayForFactorsOf10 = {10,100,2000,200};
        String[] reverseArray = {"One", "Two", "Three", "Four", "Five"};
        testnoOverlapString(noOverlap);
        testOverlapString(overlap);
        testFactorsOf10(arrayForFactorsOf10);
        testReverseArray(reverseArray);
    }
    private static void testnoOverlapString(String str){
        Recursion recursionTest= new Recursion();
        System.out.println("Result from testing count22NoOverlap: " + recursionTest.count22NoOverlap(str));
    }

    private static void testOverlapString(String str){
        Recursion recursionTest = new Recursion();
        System.out.println("Result from testing count22Overlap: " + recursionTest.count22Overlap(str));
    }

    private static void testFactorsOf10(int[] array){
        Recursion recursionTest = new Recursion();
        System.out.println("Result from testing factorsOf10: " + recursionTest.factorsOf10(array, 0));
    }

    private static void testReverseArray(Object[] array){
        Recursion recursionTest = new Recursion();
        int index1 = 0;
        int index2 = array.length-1;
        Object[] reverseArray = recursionTest.reverseArrayR(array, index1, index2);
        String result = "";
        for (Object obj : reverseArray) {
            result += obj + "  ";
        }
        System.out.println("Result from testing reverseArray: " + result);
    }    
}