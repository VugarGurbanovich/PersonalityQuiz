package org.example


// Data class to represent a Question and its choices
data class Question(
    val questionText: String,
    val choices: List<Choice>
)

// Data class to represent each Choice with associated points
data class Choice(
    val text: String,
    val points: Int
)

// Data class to store Result based on total points
data class Result(
    val minPoints: Int,
    val maxPoints: Int,
    val resultText: String
)

fun main() {
    val questions = listOf(
        Question("What kind of problems do you enjoy solving the most?",
            listOf(Choice("Building systems that can handle millions of users at once",3),
                Choice("Creating intuitive, interactive user interfaces",2),
                Choice("Developing intelligent systems that can learn and adapt",3),
                Choice("Building apps that run smoothly on mobile devices",2)
            )),

        Question("How do you prefer to interact with technology?",
            listOf(Choice("Designing beautiful, responsive web interfaces",2),
                Choice("Understanding and managing servers and databases",3),
                Choice("Developing models for prediction and data analysis",3),
                Choice("Creating apps for Android/iOS platforms",2)
            )),
        Question("Which project excites you the most?",
            listOf(Choice("Building a scalable e-commerce platform",3),
                Choice("Building a scalable e-commerce platform",2),
                Choice("Building a scalable e-commerce platform",3),
                Choice("Building a scalable e-commerce platform",2)
            )),
        Question("How do you handle errors in your code?",
            listOf(Choice("I focus on server logs and data to understand the issue",3),
                Choice("I check the browser console and UI for clues",2),
                Choice("I debug the model’s performance using data metrics",3),
                Choice("I use device emulators and simulators to catch bugs",2)
            )),
        Question("What tools do you prefer to work with?",
            listOf(Choice("Frameworks like React or Vue for building user interfaces",3),
                Choice("Databases like MySQL, or tools like Docker and Kubernetes",2),
                Choice("Libraries like TensorFlow or PyTorch for machine learning",3),
                Choice("Platforms like Android Studio or Xcode for mobile development",2)
            )),
        Question("What would you like to improve most in your projects?",
            listOf(Choice("Making the interface look stunning and highly responsive",3),
                Choice("Ensuring the system can handle large amounts of traffic",2),
                Choice("Improving the accuracy and efficiency of algorithms",3),
                Choice("Enhancing the user experience on mobile devices",2)
            )),
        Question("What kind of projects interest you in the long run?",
            listOf(Choice("Working on user-facing websites and applications",3),
                Choice("Building large-scale systems that power apps and services",2),
                Choice("Solving complex problems using data and artificial intelligence",3),
                Choice("Creating mobile apps that people use every day",2)
            ))
    )

    val results = listOf(
        Result(10,12,"Mobile App Developer"),
        Result(13,15,"Frontend Developer"),
        Result(16,18,"AI/ML Engineer"),
        Result(19,21,"Backend Developer")
    )

    println("\nWhich Field of Programming is Suitable for You?\n")
    val totalScore = getResults(questions)
    val result = results.find { totalScore in it.minPoints..it.maxPoints }
    println("\nResult:${result?.resultText?:"No result found"}")



}
fun getResults(questions:List<Question>):Int{
    var score = 0
    for (question in questions){
        println(question.questionText)
        for ((index,choice) in question.choices.withIndex()){
            println("\t${index+1}.${choice.text}")
        }
        print("Your choice:")
        val choiceIndex = readLine()?.toInt()
        score += question.choices[choiceIndex!!.minus(1)].points
    }
    return score
}