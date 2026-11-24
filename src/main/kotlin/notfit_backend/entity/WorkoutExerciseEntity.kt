
package notfit_backend.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.math.BigDecimal
import java.util.UUID

@Entity
@Table(name = "workout_exercises")
open class WorkoutExerciseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    open var id: UUID? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workout_id", nullable = false)
    open var workout: WorkoutEntity? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "exercise_id")
    open var exercise: ExerciseEntity? = null

    @Column(name = "exercise_name", nullable = false, length = 150)
    open var exerciseName: String = ""

    @Column(name = "sets_count")
    open var setsCount: Int? = null

    @Column(name = "repetitions")
    open var repetitions: Int? = null

    @Column(name = "weight_kg", precision = 8, scale = 2)
    open var weightKg: BigDecimal? = null

    @Column(name = "duration_seconds")
    open var durationSeconds: Int? = null

    @Column(name = "distance_meters", precision = 10, scale = 2)
    open var distanceMeters: BigDecimal? = null

    @Column(name = "sort_order", nullable = false)
    open var sortOrder: Int = 0
}
