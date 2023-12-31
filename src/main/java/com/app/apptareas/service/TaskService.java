package com.app.apptareas.service;

import com.app.apptareas.model.Task;
import com.app.apptareas.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }
    public Task createTask(Task task){
        return taskRepository.save(task);
    }
    public Task updateTask(Task task){
        return taskRepository.save(task);
    }
    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
    public Task getTaskById(Long id){
        return taskRepository.findById(id).orElse(null);
    }
}
