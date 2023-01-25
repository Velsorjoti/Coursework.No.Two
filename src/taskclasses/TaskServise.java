package taskclasses;

import myexpetions.TaskNotFoundExeption;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class TaskServise {
    private Map<Integer,Task> taskMap = new HashMap<>();
    private Collection<Task> removedTask = new ArrayList<>();

    public void add(Task task) {
        taskMap.put(task.getId(), task);
    }

    public Task remove(int id) throws TaskNotFoundExeption {
        if (taskMap.containsKey(id)) {
            Collections.addAll(removedTask, taskMap.get(id));
            Task needReturne = taskMap.get(id);
            taskMap.remove(id);
            return needReturne;
        } else {
         throw new TaskNotFoundExeption();
        }
    }

    public Collection<Task> getAllByDate(LocalDate localDate) {
       return taskMap.values().stream().filter(x->x.equals(localDate)).collect(Collectors.toList());
    }


}
