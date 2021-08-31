public class Recursion {
    public int count22NoOverlap(String str){
        return count22NoOverlapR(str);
    }

    public int count22Overlap(String str){
        return count22OverlapR(str);
    }

    public int factorsOf10(int[] array, int value){
        return factorsOf10R(array, value);
    }

    public void reverseArray(Object[] array, int index1, int index2){
        reverseArrayR(array, index1, index2);
    }

    private int count22NoOverlapR(String str){
        if(str.length()<2){
            return 0;
        }
        else if(str.substring(0,2).equals("22")){
            return count22NoOverlapR(str.substring(2))+1; 
        }
        else {
            return count22NoOverlapR(str.substring(1));
        }
    }

    private int count22OverlapR(String str){
        if(str.length()<2){
            return 0;
        }
        else if(str.substring(0,2).equals("22")){
            return count22OverlapR(str.substring(1))+1; 
        }
        else {
            return count22OverlapR(str.substring(1));
        }
    }

    private int factorsOf10R(int[] array, int value){
        if(value>array.length-2){
            return 0;
        }
        else if(array[value]/10==array[value+1]||array[value]*10==array[value+1]){
            return factorsOf10R(array, value+1)+1;
        }
        else{
            return factorsOf10R(array, value+1);
        }
    }
    
    public Object[] reverseArrayR(Object[] array, int index1, int index2){
        if(array.equals(null) || index1 > index2){
            return array;
        }
        else {
            Object temp = array[index2];
            array[index2]=array[index1];
            array[index1]=temp;
            return reverseArrayR(array, index1+1, index2-1);
        }
    }

}