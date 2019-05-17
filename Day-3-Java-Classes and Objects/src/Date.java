public class Date{
    private int day;
    private int month;
    private int year;

    public Date(){

    }
    public Date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public String toString(){
        return day+"/"+month+"/"+year;
    }

    public Boolean isSmaller(Date d){
        if(d.year<this.year){
            return true;
        }
        else if(d.year==this.year){
            if(d.month<this.month){
                return true;
            }
            else if(d.month==this.month){
                if(d.day<this.day){
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        else{
            return false;
        }
    } 
    

}