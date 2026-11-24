package notfit_backend.repository

import notfit_backend.entity.AchievementEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface AchievementRepository : JpaRepository<AchievementEntity, UUID> {

    fun findAllByIsActiveTrue(): List<AchievementEntity>
}