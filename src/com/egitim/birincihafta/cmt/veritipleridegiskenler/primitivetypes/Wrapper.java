package com.egitim.birincihafta.cmt.veritipleridegiskenler.primitivetypes;

import java.util.ArrayList;
import java.util.List;

public class Wrapper {

    /**
     * Primitive tiplerin farklı bir kullanımını sağlıyor.
     * primitive tipler üzerinde çeşitli işlemler yapmak istediğimiz zaman kullanılabilirler.
     */

    public static void main(String[] args) {

        Integer sayi = 100;
        int sayi2 = 100;

        double doubleValue = 0.3;
        Double doubleValue2= 0.5;

        /**
         * Autoboxing ve unboxing kavramları çıkar karşımıza.

         * Autoboxing: int tipinin Integer wrapper'ına çevrilmesidir.
         * Java static bir dil olmasına rağmen burada compile time hatası almaz.
         * çunku her bir i değeri için Integer olaacak şekilde bir obje üretilir.
         * Örnek:
         */
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i <10; i++) {
            integerList.add(i);
        }

        /**
         * unboxing örnek: Wrapper classtan primitive tipine dönüşümüdür.
         */
        sumEven(new ArrayList<>());

        Boolean booleanValue = true;
        boolean booleanValue2 = false;

        String stringValue = "10000";
        String stringValue2 = "20000";

        String toplam = stringValue + stringValue2;
        System.out.println(toplam);

        Integer integerValue = Integer.valueOf(stringValue);
        int parseInt = Integer.parseInt(stringValue2);

        int sonuc = integerValue + parseInt;
        System.out.println("sonuc" + sonuc);

        int min = Integer.min(2, 3);
        System.out.println(min);

    }

    public static int sumEven(List<Integer> li) {
        List<Integer> li2 = new ArrayList<>();
        int sum = 0;
        for (Integer i : li2)
                sum += i;
        return sum;
    }


}
