
package notfit_backend.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.Instant
import java.util.UUID

@Entity
@Table(name = "achievements")
open class AchievementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    open var id: UUID? = null

    @Column(name = "code", nullable = false, unique = true, length = 50)
    open var code: String = ""

    @Column(name = "name", nullable = false, length = 150)
    open var name: String = ""

    @Column(name = "description", length = 500)
    open var description: String? = null

    @Column(name = "icon_url", length = 2048)
    open var iconUrl: String? = null

    @Column(name = "points_reward", nullable = false)
    open var pointsReward: Int = 0

    @Column(name = "created_at", nullable = false, updatable = false)
    open var createdAt: Instant = Instant.now()
}
