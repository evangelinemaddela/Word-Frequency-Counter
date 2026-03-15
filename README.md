# Word Frequency Counter

## Aim of the Project

The aim of this project is to build a simple command-line Java application that analyzes a sentence or paragraph and determines how many times each word appears. The program demonstrates how text processing and data structures can be used together to extract meaningful information from user input.

---

## Concepts Used

This project demonstrates several important Java programming concepts:

- String manipulation and preprocessing
- HashMap for storing word-frequency pairs
- Scanner for user input
- Regular expressions using `replaceAll()`
- Loops and conditional logic
- Menu-driven program design
- Array handling using `split()` method

---

## Features

- Menu-driven command-line interface
- Accepts both sentences and paragraphs as input
- Automatically converts text to lowercase for consistent counting
- Removes punctuation to ensure accurate word comparison
- Counts the frequency of each word using a HashMap
- Displays each word along with its frequency
- Allows users to analyze multiple inputs without restarting the program

---

## How It Works & What It Solves

The application begins by presenting a simple menu where the user can choose to analyze text or exit the program.

When the user enters text, the program performs the following steps:

1. Converts the entire text to lowercase to ensure case-insensitive comparison.
2. Removes punctuation and special characters using a regular expression.
3. Splits the cleaned text into individual words using the `split()` method.
4. Iterates through each word and stores it in a `HashMap` where:
   - The **key** represents the word.
   - The **value** represents how many times the word appears.
5. If the word already exists in the map, its count is incremented.
6. Finally, the program prints each word along with its frequency.

This project demonstrates how Java data structures can be used to perform basic text analysis, which is a common task in many real-world applications such as search engines, text processing tools, and data analytics systems.

---

## Challenges Faced

One of the main challenges was ensuring that words with different letter cases (such as "Java", "JAVA", and "java") were treated as the same word. This was solved by converting all text to lowercase before processing.

Another challenge involved removing punctuation marks so that words like "java," and "java" would not be counted as different words. This was handled using a regular expression to clean the text before splitting it into words.

Understanding how to update values inside a `HashMap` was also an important part of the project, particularly using methods such as `containsKey()`, `get()`, and `put()`.

---

## Author

Evangeline Maddela
