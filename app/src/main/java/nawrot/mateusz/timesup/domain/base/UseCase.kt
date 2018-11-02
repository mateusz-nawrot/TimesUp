package nawrot.mateusz.timesup.domain.base


abstract class UseCase<in P, R> {

    abstract fun execute(param: P): R

}