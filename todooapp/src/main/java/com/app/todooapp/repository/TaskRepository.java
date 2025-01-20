package com.app.todooapp.repository;
import com.app.todooapp.models.Task;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {



}
