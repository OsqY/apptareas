package com.app.apptareas.controller;

import com.app.apptareas.model.Task;
import com.app.apptareas.repository.TaskRepository;
import com.app.apptareas.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    private final TaskService taskService;
    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @GetMapping("/listar")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping("/agregar")
    public Task addTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTaskById(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
   
}
