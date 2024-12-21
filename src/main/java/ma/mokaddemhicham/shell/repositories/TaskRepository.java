package ma.mokaddemhicham.shell.repositories;

import ma.mokaddemhicham.shell.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: Hicham Mokaddem
 * @Date: 2024-12-21
 * @Version: 1.0
 * @Description: This interface represents the Task Repository
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
