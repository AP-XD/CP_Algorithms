class leap_yr
{public static void year(int n)
    {
        String ans=(n%100==0)?((n%400==0)?"Leap Year":"Not a leap year"):((n%4==0)?"Leap year":"Not a leap year");
        System.out.println("The year "+n+" is "+ans);
    }}