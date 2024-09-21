# PersonalityMatch

This is a personality quiz written in Kotlin that helps users determine which field of programming best suits their interests and skills. The quiz asks a series of questions, each with multiple answer choices. Based on the user's answers, points are accumulated, and a field of programming is recommended, such as Backend Development, Frontend Development, Mobile Development, or AI/ML Engineering.

Features
---
- Console-based quiz: Simple and interactive quiz that works directly in the terminal or console.
- Personalized results: Based on the total points scored, the quiz recommends one of four programming fields.
- Easy to extend: You can easily add more questions, fields, or adjust point ranges to customize the quiz.

Project Structure
---
This project is organized using Kotlin's data classes to represent questions, choices, and results. The code follows a simple and easy-to-understand structure to facilitate future enhancements.

How It Works
---
- The quiz asks a series of 7 questions.
- Each question offers a set of choices. Each choice carries a different point value based on how well it aligns with a specific programming field.
- After the user answers all the questions, the program calculates the total points.
- The program then displays the field of programming most suitable for the user based on their total score.
