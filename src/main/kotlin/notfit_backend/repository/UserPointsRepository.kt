package notfit_backend.repository

import notfit_backend.entity.UserPointsEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface UserPointsRepository : JpaRepository<UserPointsEntity, UUID> {

    fun findByUser_Id(userId: UUID): UserPointsEntity?
}