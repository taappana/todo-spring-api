package com.taappana.todo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;  
import lombok.Data;  
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Document(collection = "todos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
	@Id
    private String id;

    @NotBlank
    @Size(max=100)
    private String title;
    
    private LocalDateTime createdAt = LocalDateTime.now();
}
