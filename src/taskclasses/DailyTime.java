package taskclasses;

import enumes.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DailyTime extends Task {

    public DailyTime ( String title, Type type, int id, LocalDateTime dateTime, String description) {
        super(title, type, id, dateTime, description);
    }

    @Override
    public boolean appearsln(LocalDate localDate) {
       return localDate.isAfter(getDateTime().toLocalDate()) || localDate.equals(getDateTime().toLocalDate());
    }


}
