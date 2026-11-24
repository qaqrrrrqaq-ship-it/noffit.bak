
package notfit_backend.repository

import notfit_backend.entity.UserSettingsEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface UserSettingsRepository : JpaRepository<UserSettingsEntity, UUID>
