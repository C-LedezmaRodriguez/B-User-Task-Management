package com.taskmanager.controller;

import com.taskmanager.model.Task;
import com.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tareas")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @PatchMapping("/{id}/estado")
    public Task updateTaskStatus(@PathVariable Long id, @RequestParam String estado) {
        return taskService.updateTaskStatus(id, estado);
    }

    @GetMapping("/{usuarioId}")
    public List<Task> getTasksByUser(@PathVariable Long usuarioId) {
        return taskService.getTasksByUser(usuarioId);
    }
}
