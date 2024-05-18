package school.mjc.stage0.conditions.task3;

public class Seasons {
    public  void tellTheSeasonByMonthNumber(int month) {
      if(month >= 3  && month <6){
          System.out.println("Spring");
      }else if( month >=6 && month <10){
          System.out.println("Summer");
      }else if( month >=10 && month <12){
          System.out.println("Fall");
    } else  if( month == 12 || month == 1 || month == 2 ) {
            System.out.println("Winter");
        }else{
          System.out.println("wrong number!");

      }
    }
}
