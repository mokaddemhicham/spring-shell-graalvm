package ma.mokaddemhicham.shell.commands;

import lombok.RequiredArgsConstructor;
import ma.mokaddemhicham.shell.entities.Task;
import ma.mokaddemhicham.shell.repositories.TaskRepository;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @Author: Hicham Mokaddem
 * @Date: 2024-12-21
 * @Version: 1.0
 * @Description: This class is the main class of the Task Manager CLI
 */

@ShellComponent
@RequiredArgsConstructor
public class TaskMangerCli {

    private final TaskRepository taskRepository;

    @ShellMethod(key = "hello", value = "Prints 'Hello To Your Task Manager CLI'")
    public String hello() {
        return "Hello To Your Task Manager CLI";
    }

    @ShellMethod(key = "add", value = "Add a new task")
    public String add(@ShellOption(defaultValue = "None") String title,
                      @ShellOption(defaultValue = "None") String description) {
        Task task = taskRepository.save(Task.builder()
                .title(title)
                .description(description)
                .creationDate(new Date())
                .build());
        return task.toString();
    }

    @ShellMethod(key = "list", value = "List all tasks")
    public void list() {
        List<String> tasks = taskRepository.findAll().stream().map(Task::toString).toList();

        for(String task: tasks) {
            System.out.println(task);
        }
    }

    @ShellMethod(key = "find", value = "Find a task by id")
    public String find(@ShellOption(defaultValue = "0") Long id) {
        Optional<Task> optionalTask = taskRepository.findById(id);
        if (optionalTask.isPresent()) {
            return optionalTask.get().toString();
        } else {
            return "Task with id " + id + " not found";
        }
    }

    @ShellMethod(key = "done", value = "Mark a task as done")
    public String done(@ShellOption(defaultValue = "0") Long id) {
        Optional<Task> optionalTask = taskRepository.findById(id);
        if(optionalTask.isPresent()) {
            Task task = optionalTask.get();
            task.setDone(true);
            task.setDueDate(new Date());
            taskRepository.save(task);
            return "Task with id " + id + " marked as done";
        } else {
            return "Task with id " + id + " not found";
        }
    }

    @ShellMethod(key = "delete", value = "Delete a task")
    public String delete(@ShellOption(defaultValue = "0") Long id) {
        taskRepository.deleteById(id);
        return "Task with id " + id + " deleted successfully";
    }

}
