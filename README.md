# Employee File Processing - Java Collections Demo

This project demonstrates various Java Collections (ArrayList, HashSet, TreeSet) for processing employee data from a text file.

## Project Structure

```
hometaskg/
├── employees.txt                  Input file with employee names (includes duplicates)
├── src/main/java/org/example/
│   ├── Main.java                  Main entry point that executes all tasks
│   ├── IO.java                    Helper class for I/O operations
│   ├── Task1.java                 ArrayList with 3 printing methods
│   ├── Task2.java                 HashSet to remove duplicates
│   ├── Task3.java                 TreeSet for alphabetical sorting
│   └── Task4.java                 ArrayList with Collections.sort()
└── build.gradle.kts               Gradle build configuration
```

## Tasks Overview

### Task 1: ArrayList with Multiple Printing Methods
- Reads employee names from `employees.txt` into an ArrayList
- Properly handles exceptions using try-with-resources
- Prints collection size
- Demonstrates three different printing methods:
  1. Standard for loop
  2. For-each loop
  3. Iterator interface

### Task 2: HashSet (Remove Duplicates)
- Uses HashSet to automatically remove duplicate employee names
- Demonstrates the `contains()` method to check if specific employees exist
- Shows how sets are useful for checking element existence

### Task 3: TreeSet (Alphabetical Sorting)
- Uses TreeSet to automatically sort employees alphabetically (A to Z)
- Also removes duplicates (TreeSet behavior)
- No manual sorting logic needed

### Task 4: ArrayList with Collections.sort()
- Uses ArrayList to keep duplicates
- Sorts employees A to Z using `Collections.sort()`
- Reverses sorting to Z to A using `Collections.sort()` with `Collections.reverseOrder()`

## How to Run

### Using Gradle:
```bash
./gradlew run
```

### Using Gradle Build:
```bash
./gradlew build
java -cp build/classes/java/main org.example.Main
```

## Sample Output

The program will:
1. Read the `employees.txt` file from the project root
2. Execute all 4 tasks sequentially
3. Display results for each task with clear formatting

## Key Learning Points

- **ArrayList**: Dynamic array, allows duplicates, maintains insertion order
- **HashSet**: No duplicates, no guaranteed order, fast `contains()` checks
- **TreeSet**: No duplicates, automatically sorted, slower than HashSet
- **Collections.sort()**: Manual sorting with duplicates preserved
- **Try-with-resources**: Automatic resource management for file I/O
- **Iterator**: Manual traversal of collections

## Requirements

- Java 11 or higher
- Gradle (wrapper included)

## Author

Created as part of Akademia Finansów i Biznesu Vistula coursework

