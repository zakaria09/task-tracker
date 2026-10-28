package com.task.track.service;

import com.task.track.domain.CreateTaskRequest;
import com.task.track.domain.entity.Task;

public interface TaskService {

    Task createTask(CreateTaskRequest request);
}
