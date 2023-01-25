package taskclasses;

import enumes.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class YearlyTask extends Task {

    public YearlyTask (String title, Type type, int id, LocalDateTime dateTime, String description) {
        super(title, type, id, dateTime, description);
    }

    @Override
    public boolean appearsln(LocalDate localDate) {
       return localDate.equals(getDateTime().toLocalDate()) || getDateTime().getDayOfYear() == getDateTime().getDayOfYear() && localDate.isAfter(getDateTime().toLocalDate());
    }


}
