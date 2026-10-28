package com.task.track.mapper;

import com.task.track.domain.CreateTaskRequest;
import com.task.track.domain.dto.CreateTaskRequestDto;
import com.task.track.domain.dto.TaskDto;
import com.task.track.domain.entity.Task;

public interface TaskMapper {
    CreateTaskRequest fromDto(CreateTaskRequestDto dto);

    TaskDto toDto(Task task);
}
