package taskclasses;

import enumes.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MonthlyTask extends Task {

    public MonthlyTask ( String title, Type type, int id, LocalDateTime dateTime, String description) {
        super( title, type, id, dateTime, description);
    }

    @Override
    public boolean appearsln(LocalDate localDate) {
        return localDate.equals(getDateTime().toLocalDate()) || localDate.getDayOfMonth() == getDateTime().getDayOfMonth() && localDate.isAfter(getDateTime().toLocalDate());
    }


}
