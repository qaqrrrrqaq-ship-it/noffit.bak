
package notfit_backend.repository

import notfit_backend.entity.UserProfileEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface UserProfileRepository : JpaRepository<UserProfileEntity, UUID>
