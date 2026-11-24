
package notfit_backend.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.MapsId
import jakarta.persistence.OneToOne
import jakarta.persistence.Table
import java.time.Instant
import java.util.UUID

@Entity
@Table(name = "user_settings")
open class UserSettingsEntity {

    @Id
    open var id: UUID? = null

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "user_id")
    open var user: UserEntity? = null

    @Column(name = "weight_unit", nullable = false, length = 10)
    open var weightUnit: String = "KG"

    @Column(name = "height_unit", nullable = false, length = 10)
    open var heightUnit: String = "CM"

    @Column(name = "water_unit", nullable = false, length = 10)
    open var waterUnit: String = "ML"

    @Column(name = "notifications_enabled", nullable = false)
    open var notificationsEnabled: Boolean = true

    @Column(name = "email_notifications_enabled", nullable = false)
    open var emailNotificationsEnabled: Boolean = true

    @Column(name = "profile_public", nullable = false)
    open var profilePublic: Boolean = false

    @Column(name = "theme", nullable = false, length = 20)
    open var theme: String = "SYSTEM"

    @Column(name = "language", nullable = false, length = 10)
    open var language: String = "ru"

    @Column(name = "created_at", nullable = false, updatable = false)
    open var createdAt: Instant = Instant.now()

    @Column(name = "updated_at", nullable = false)
    open var updatedAt: Instant = Instant.now()

    @jakarta.persistence.PreUpdate
    fun updateTimestamp() {
        updatedAt = Instant.now()
    }
}
