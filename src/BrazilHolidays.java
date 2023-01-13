import java.util.*;

public class BrazilHolidays {
  List<Holiday> holidays = new ArrayList<Holiday>() {
    {
      add(new Holiday("Confraternização mundial", "01/01/2023"));
      add(new Holiday("Carnaval", "21/02/2023"));
      add(new Holiday("Páscoa", "17/04/2023"));
      add(new Holiday("Tiradentes", "21/04/2023"));
      add(new Holiday("Dia do trabalho", "01/05/2023"));
      add(new Holiday("Corpus Christi", "08/06/2023"));
      add(new Holiday("Independência do Brasil", "07/09/2023"));
      add(new Holiday("Nossa Senhora Aparecida", "12/10/2023"));
      add(new Holiday("Finados", "02/11/2023"));
      add(new Holiday("Proclamação da República", "15/11/2023"));
      add(new Holiday("Natal", "25/12/2023"));
    }
  };

  public List<Holiday> getHolidays() {
    return holidays;
  }

  public void printHolidays() {
    for (Holiday holiday : holidays)
      System.out.println(holiday.getDate() + " => " + holiday.getName());
  }
  
  public void isHolidayMessage() {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter a date: ");
    String askedDate = reader.nextLine();
    reader.close();

    for (Holiday holiday : holidays) {
      if (holiday.getDate().equals(askedDate)) {
        System.out.println(askedDate + " => " + holiday.getName());
        return;
      }
    }

    System.out.println(askedDate + " is not a brazil's holiday ");
  }
}
