package lesson15RemuveElement;

/**
 * JavaAdvanced
 * 13/08/2020
 */
public class ArrayHandler {
    private String[] array;

    public ArrayHandler(String[] array) {
        this.array = array;
    }

    public String[] getArray() {
        return array;
    }

    public void remove(int index) {
        String[] res;
        if ((index >= 0) && (index < array.length)) {
            res = new String[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != index) {
                    //or res[j] = array[i];
                    //j++
                    res[j++] = array[i];

                }
            }
            array=res;
        }
    }

    public void remove2(int index) {
        String[] res;
        if ((index >= 0) && (index < array.length)) {
           res = new  String [array.length-1];
           if (index>0){
               System.arraycopy(array,0,res,0,index);
            }
            if (index <array.length-1){
                System.arraycopy(array,index+1,res,index,array.length-1-index);
            }
            array=res;
        }
    }

    public void remove3(int index) {//remove  with copy
        if ((index >= 0) && (index < array.length)) {
            System.arraycopy(array,index+1,array,index,array.length-1-index);
    }}
}