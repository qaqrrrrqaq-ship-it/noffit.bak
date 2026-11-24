
package notfit_backend.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.PreUpdate
import jakarta.persistence.Table
import java.time.Instant
import java.util.UUID

@Entity
@Table(name = "users")
open class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    open var id: UUID? = null

    @Column(
        name = "email",
        nullable = false,
        unique = true,
        length = 254
    )
    open var email: String = ""

    @Column(
        name = "password_hash",
        nullable = false,
        length = 255
    )
    open var passwordHash: String = ""

    @Column(
        name = "is_active",
        nullable = false
    )
    open var isActive: Boolean = true

    @Column(
        name = "created_at",
        nullable = false,
        updatable = false
    )
    open var createdAt: Instant = Instant.now()

    @Column(
        name = "updated_at",
        nullable = false
    )
    open var updatedAt: Instant = Instant.now()

    @PreUpdate
    fun updateTimestamp() {
        updatedAt = Instant.now()
    }
}
