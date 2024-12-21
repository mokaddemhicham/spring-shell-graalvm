package ma.mokaddemhicham.shell.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

/**
 * @Author: Hicham Mokaddem
 * @Date: 2024-12-21
 * @Version: 1.0
 * @Description: This class represents a Task
 */

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Builder
@ToString
public class Task {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private boolean done;
    private Date creationDate;
    private Date dueDate;
}
