package com.task.track.mapper.impl;

import com.task.track.domain.CreateTaskRequest;
import com.task.track.domain.dto.CreateTaskRequestDto;
import com.task.track.domain.dto.TaskDto;
import com.task.track.domain.entity.Task;
import com.task.track.mapper.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {
    @Override
    public CreateTaskRequest fromDto(CreateTaskRequestDto dto) {
        return new CreateTaskRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.priority()
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getPriority(),
                task.getStatus()
        );
    }
}
