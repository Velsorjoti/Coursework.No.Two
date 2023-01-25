package taskclasses;

import enumes.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class WeeklyTask extends Task{

    public WeeklyTask (String title, Type type, int id, LocalDateTime dateTime, String description) {
        super(title, type, id, dateTime, description);
    }

    @Override
    public boolean appearsln(LocalDate localDate) {
        return localDate.equals(getDateTime().toLocalDate()) || localDate.getDayOfWeek() == getDateTime().getDayOfWeek() && localDate.isAfter(getDateTime().toLocalDate());
    }
}
