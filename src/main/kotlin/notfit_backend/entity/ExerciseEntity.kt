
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
@Table(name = "exercises")
open class ExerciseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    open var id: UUID? = null

    @Column(name = "name", nullable = false, length = 150)
    open var name: String = ""

    @Column(name = "description", length = 1000)
    open var description: String? = null

    @Column(name = "muscle_group", length = 50)
    open var muscleGroup: String? = null

    @Column(name = "equipment", length = 50)
    open var equipment: String? = null

    @Column(name = "created_at", nullable = false, updatable = false)
    open var createdAt: Instant = Instant.now()
}
