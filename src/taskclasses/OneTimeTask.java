package taskclasses;

import enumes.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OneTimeTask extends Task {

    public OneTimeTask (String title, Type type, int id, LocalDateTime dateTime, String description) {
        super(title, type, id, dateTime, description);
    }

    @Override
    public boolean appearsln(LocalDate localDate) {
        if(localDate.equals(getDateTime().toLocalDate())) {
            return true;
        } else {
            return false;
        }
    }


}
