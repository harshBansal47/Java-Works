public class Enumeration{
    enum Months{
        JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE;
    } 
    public static void main(String[] args) {
        
    }
}

enum Days{
    MONDAY("Shiny"),
    TUESDAY("Cool Day"),
    WEDNESDAY("Bright Day"),
    THRUSDAY("Chill Day"),
    FRIDAY("Last Working day in banks"),
    SATURDAY("Weekend Starts"),
    SUNDAY("Last Day of week");
    String Value;
    Days(Value){
     this.Value = Value;
    }
    getDetail(Days){
        return Days.Value;
    }
}
