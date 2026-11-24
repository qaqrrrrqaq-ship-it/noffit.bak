
package notfit_backend.repository

import notfit_backend.entity.UserGoalEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface UserGoalRepository : JpaRepository<UserGoalEntity, UUID> {

    fun findAllByUser_Id(userId: UUID): List<UserGoalEntity>
}
