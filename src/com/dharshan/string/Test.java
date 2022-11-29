package com.dharshan.string;

class Test {
    public static void main(String[] args)
    {
//        String str1="ratan";
//        str1.concat("soft");
//        String str2=str1.concat("soft");;
//        String str3=str2;
//        String str4="ratan".concat("durga");
//        String str5=str4;
//        System.out.println(str2==str3);
//        System.out.println(str1==str2);
//        System.out.println(str1==str3);
//        System.out.println(str1.toString());




//        String str1="durga";
//        String str2=40+50+str1+"ratan"+60+70;
//        System.out.println(str2);
//        String str = str1.concat(str2);
//        System.out.println(str);

        String str="hirattaiah how r u";
        String[] str1=str.split(" ");
        for (int i=0;i<str1.length ;i++ )
        {
            System.out.println(str1[i]);
        }


        String str2 = "Pavan";
        String str3 = "Dharshasn";

        System.out.println(str2.compareTo(str3)); //12
        System.out.println(str3.compareTo(str2)); // -12
        str2 = str2.replace('a', 'b');
        System.out.println(str2);
        System.out.println(str2.toUpperCase());
        System.out.println(str2.toLowerCase());
        System.out.println(str3.endsWith("asn"));
        System.out.println(str3.startsWith("asn"));

        System.out.println(str3.substring(2));
        System.out.println(str3.substring(2, 6));

//        StringBuilder sb = new StringBuilder(str3);
//        System.out.println(sb.reverse());

        StringBuffer sb=new StringBuffer("hi ratan hi");
        int i;
        i=sb.indexOf("hi");
        System.out.println(i);
        i=sb.lastIndexOf("hi");
        System.out.println(i);


    }
}