public class DateTest{
    public static void main(String[] args) {
        Date date1=new Date(21,03,1997);
        Date date2=new Date(11,02,1995);
        System.out.println(date1);
        System.out.println(date2);
        boolean result=date1.isSmaller(date2);
        if(result==true){
            System.out.println("Smaller date");
        }
    }
}