package exceptionsTreatment

fun main() {

    throw Exception("Hi There")

    /*
    - throw -> translation -> throw
    - We are throwing an exception whose message is "Hi There"
    - When running, we will see the exception message
    - java.lang.Exception -> exception type
    - Hi There - Exception message
    - at treatmentExceptions.IntroductionAndObjectivesExceptionsKt.main(introductionAndObjectivesExceptions.kt:5)
        - Error occurred on line 5 (throw Exception("Hi There"))
        - From main
    - Address: at treatmentExceptions.IntroductionAndObjectivesExceptionsKt.main(introductionAndObjectivesExceptions.kt.kt)
        - treatmentExceptions.IntroductionAndObjectivesExceptionsKt.main
            - packageName.filename+format.exceptionScope
        - (introductionAndObjectivesExceptions.kt)
            - filename.format
        - Remainder of the exception message (if there are more) are the consequences (exception hierarchy)
     */

}