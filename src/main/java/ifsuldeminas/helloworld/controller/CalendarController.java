package ifsuldeminas.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@RestController
public class CalendarController {
    @GetMapping("/calendar/today")
    public String today(){
        Date today = new Date();
        return "Hoje é " + today;
    }

    @GetMapping("/calendar/tomorrow")
    public String tomorrow(){
        GregorianCalendar tomorrow =
                new GregorianCalendar();
        tomorrow.roll(Calendar.DAY_OF_MONTH,1);
        return "Amanhã será " + tomorrow;
    }
}
