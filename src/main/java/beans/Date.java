package beans;

public class Date {

    private String month;
    private String day;
    private String year;

    public Date(){
        this.month = "01";
        this.day = "01";
        this.year = "2020";
    }

    public Date(String date){
        String[] arr = date.split("/");
        this.month = arr[0];
        this.day = arr[1];
        this.year = arr[2];
    }

    public Date(String month, String day, String year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public Date(Date dates){
        this.month = dates.getMonth();
        this.day = dates.getDay();
        this.year = dates.getYear();
    }

    public String getMonth() {
        return month;
    }

    public String getMonth(String number) {
        String month = "";
        switch(number) {
            case "01":
                month = "Jan";
                break;
            case "02" :
                month = "Feb";
                break;
            case "03" :
                month = "Mar";
                break;
            case "04" :
                month = "Apr";
                break;
            case "05" :
                month = "May";
                break;
            case "06" :
                month = "Jun";
                break;
            case "07" :
                month = "Jul";
                break;
            case "08" :
                month = "Aug";
                break;
            case "09" :
                month = "Sep";
                break;
            case "10" :
                month = "Oct";
                break;
            case "11" :
                month = "Nov";
                break;
            case "12" :
                month = "Dec";
                break;
            default:
                System.out.println("Wrong month");
        }
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString(){
        return month + "/" + day + "/" + year;
    }


}
