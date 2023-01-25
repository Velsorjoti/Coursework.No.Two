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
        if(localDate.isAfter(getDateTime().toLocalDate()) && localDate.equals(getDateTime().toLocalDate()) || localDate.getDayOfMonth() == getDateTime().getDayOfMonth()) {
            return true;
        }else {
            return false;
        }
    }


}