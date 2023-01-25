package taskclasses;


import enumes.Type;
import myexpetions.IncorrectArgumentExeption;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Task  {
    protected static int  idGenerator;
    protected String title;
    protected Type type;
    protected  int id;
    protected LocalDateTime dateTime;
    protected String description;

    public Task(String title, Type type, int id, LocalDateTime dateTime, String description) throws IncorrectArgumentExeption {
        idGenerator++;
        if (title == null || title.isBlank() || title.isEmpty()) {
            throw new IncorrectArgumentExeption("Заголовок отсуствует");
        } else {
            this.title = title;
        }
        this.type = type;
        this.id = id;
        this.dateTime = dateTime;
        if(description == null || description.isBlank() || description.isEmpty()) {
            throw new IncorrectArgumentExeption("Заголовок отсуствует");
        } else {
            this.description = description;
        }
    }

    public int getIdGenerator() {
        return idGenerator;
    }

    public String getTitle() {
        return title;
    }

    public Type getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) throws IncorrectArgumentExeption {
        if(title == null || title.isBlank() || title.isEmpty()) {
            throw new IncorrectArgumentExeption("Заголовок отсуствует");
        } else {
            this.title = title;
        }
    }

    public void setDescription(String description) {
        if(description == null || description.isBlank() || description.isEmpty()) {
            throw new IncorrectArgumentExeption("Заголовок отсуствует");
        } else {
            this.description = description;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(idGenerator, task.idGenerator) && Objects.equals(title, task.title) && type == task.type && Objects.equals(id, task.id) && Objects.equals(dateTime, task.dateTime) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGenerator, title, type, id, dateTime, description);
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public abstract boolean appearsln(LocalDate localDate);
}
