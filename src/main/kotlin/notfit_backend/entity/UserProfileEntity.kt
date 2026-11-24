
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
import java.time.LocalDate
import java.util.UUID

@Entity
@Table(name = "user_profiles")
open class UserProfileEntity {

    @Id
    open var id: UUID? = null

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "user_id")
    open var user: UserEntity? = null

    @Column(name = "first_name", length = 100)
    open var firstName: String? = null

    @Column(name = "last_name", length = 100)
    open var lastName: String? = null

    @Column(name = "birth_date")
    open var birthDate: LocalDate? = null

    @Column(name = "gender", length = 20)
    open var gender: String? = null

    @Column(name = "height_cm")
    open var heightCm: Int? = null

    @Column(name = "avatar_url", length = 2048)
    open var avatarUrl: String? = null

    @Column(name = "created_at", nullable = false, updatable = false)
    open var createdAt: Instant = Instant.now()

    @Column(name = "updated_at", nullable = false)
    open var updatedAt: Instant = Instant.now()

    @jakarta.persistence.PreUpdate
    fun updateTimestamp() {
        updatedAt = Instant.now()
    }
}
