package nawrot.mateusz.timesup.domain


abstract class UseCase<in P, R> {

    abstract fun execute(param: P): R

}