package com.task.track.service.impl;

import com.task.track.domain.CreateTaskRequest;
import com.task.track.domain.entity.Task;
import com.task.track.domain.entity.TaskStatus;
import com.task.track.repository.TaskRepository;
import com.task.track.service.TaskService;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(CreateTaskRequest request) {
        Task task = new Task(
                request.title(),
                request.description(),
                request.dueDate(),
                TaskStatus.OPEN,
                request.priority()
        );
        return taskRepository.save(task);
    }
}
