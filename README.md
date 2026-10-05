Add MissionControl for Java memory allocation and type casting

\
What this code does:
A terminal-based program that stores and prints a spaceship's flight data (engines, fuel, distance, rank, and launch status) by selecting the most precise data types available in Java.
Key Concepts Applied:
Strict Memory Efficiency: Instead of defaulting every number to an int, this code uses a byte for small numbers (4 engines) and a long for massive numbers (15 billion miles) to save RAM.
Manual Type Casting (Data Chopping): Demonstrates forcefully squeezing a double (99.9) into an int. It proves that Java does not round up to 100; it mathematically chops off the decimal, leaving 99.
String Concatenation: Uses the + operator to dynamically stitch raw variable data together with readable text labels in the terminal output.
 HOW THE CODE LOOK LIKE AFTER WE RUN THE CODE 

 
 === SPACESHIP DIAGNOSTICS ===
Engines: 4
Fuel: 98.5%
Distance: 15000000000 miles
Status: Launch Ready? true
Rank: A
Boosted Speed: 599
=============================
