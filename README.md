# 🆔 Java CLI Profile Card

This is my very first Java project! It is a simple command-line application that takes three pieces of personal information from the terminal and generates a formatted Engineer ID Card. 

I built this project to understand how Java interacts with the computer's terminal and how data is passed into a program before it even starts running.

## 🧠 What I Learned (The Core Concepts)
If you are looking at this code, here are the main concepts I used to build it:

* **Command-Line Arguments (`String[] args`):** In Java, `args` acts like a set of empty boxes. When a user types extra words in the terminal after running the program, Java automatically places those words into these boxes (`args[0]`, `args[1]`, `args[2]`). 
* **String Concatenation:** I learned how to use the `+` symbol to glue normal text (like `"Name: "`) together with the dynamic variables stored in the array boxes.
* **The Compilation Process:** I learned that computers cannot read `.java` files directly. I used the `javac` command to translate my human-readable code into a `.class` file (bytecode) so the computer's processor could understand it.

## 🚀 How to Run the Program

**Step 1: Open the terminal**
Make sure your terminal is navigated inside the `src` folder where the code lives.

**Step 2: Compile the code**
Type this command to translate the code into bytecode:
```bash
javac ProfileCard.java

java ProfileCard Prince 2027 Software_Engineer

expected output 
=============================
     ENGINEER PROFILE ID     
=============================
Name: Prince
Target Year: 2027
Primary Mission: Software_Engineer
=============================