package lesson16_18ReverseString;

/**
 * JavaAdvanced
 * 19/08/2020
 */
public class ActionAndConditionExample implements Condition ,Action{
    @Override
    public String doAction(String str) {
        if(str==null){
            return null;
        }
        return str+"!" ;
    }

    @Override
    public boolean test(String str) {
        return str!=null ;
    }
}
