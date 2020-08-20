package lesson16_18ReverseString;

import lesson16_18ReverseString.conditions.LengthCondition;
import lesson16_18ReverseString.actions.ReverseStringAction;
import lesson16_18ReverseString.actions.ToUpperCaseAction;

/**
 * JavaAdvanced
 * 17/08/2020
 */
public class Main {
    public static void main(String[] args) {
/*
1. перебрать массив
2. выбрать нужные (условие)
3. реверс (действие) - выносим в интерфейс, в параметры
 */
        String[] strings = {"12", "qwerty", "123456", "14", ""};
        /*StringArrayHandler stringArrayHandler =
                new StringArrayHandler(strings,
                        new ReverseStringAction(),
                        new LengthMoreThanFourCondition());
        stringArrayHandler.stringsHandler();
        System.out.println(stringArrayHandler.toString());*/

        StringArrayHandler stringArrayHandler2 =
                new StringArrayHandler(strings,
                        new ReverseStringAction(),
                        new LengthCondition(1));
        stringArrayHandler2.stringsHandler();
        System.out.println(stringArrayHandler2.toString());

        StringArrayHandler stringArrayHandler3 =
                new StringArrayHandler(strings,
                        new ToUpperCaseAction(),
                        new LengthCondition(1));
        stringArrayHandler3.stringsHandler();
        System.out.println(stringArrayHandler3.toString());

        StringArrayHandler stringArrayHandler4 =
                new StringArrayHandler(strings,
                        new ReverseStringAction(),
                        null);
        stringArrayHandler4.stringsHandler();
        System.out.println(stringArrayHandler4.toString());


        ActionAndConditionExample actAndCond = new ActionAndConditionExample();
        StringArrayHandler stringArrayHandler5 =
                new StringArrayHandler(strings,
                        actAndCond,
                        actAndCond);
        stringArrayHandler5.stringsHandler();
        System.out.println(stringArrayHandler5.toString());
    }
}
