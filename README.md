# COMP2046 PA3 – Modern Art Board Game (Java)

This repository contains my complete solution for **Programming Assignment 3** of the course **COMP2046** (2024-25 Semester 1) at Hong Kong Baptist University.

The task was to implement a console-based digital version of the classic board game **Modern Art** by Reiner Knizia, building on PA2 with new features.

## Features Implemented

- **Game Core** (updated from PA2)
  - Painting cards with five artists and four auction types
  - Round-based gameplay with money management and scoring
  - End-of-round and end-of-game winner determination

- **Auction Types** (new in PA3)
  - Open Auction
  - Hidden Auction
  - Fixed Price Auction
  - One Offer Auction  
  *(Double Auction not required)*

- **Player Types** (new in PA3)
  - `HumanPlayer` – interactive input via console
  - `ComputerPlayer` – rational bidder:
    - Never bids more than the painting’s potential max value
    - Bids ≤ half potential value if already owns the painting
  - `AFKPlayer` – always bids 0, plays the first card when required

- **Object-Oriented Design**
  - Inheritance & polymorphism (Player hierarchy)
  - Abstract base classes
  - Encapsulated game logic in `ModernArt` class
  - Use of constants and clean package structure (`paintings`, `players`)

## Important Notes

- This is **coursework** submitted for grading.
- As per assignment rules: **No generative AI tools** were used during development.
- The program follows the behavior of the provided `demo.jar` as closely as possible.
- Output format and messages may differ slightly but preserve all required functionality.

## How to Run

```bash
# Compile (assuming you're in the project root)
javac *.java players/*.java paintings/*.java

# Run with 2 players (default)
java ModernArt

# Run with 4 players (e.g.)
java ModernArt 4
```

Or use the provided JAR (if you built one):

```bash
java -jar modern-art-pa3.jar 4
```

## Project Structure

```
├── ModernArt.java          # Main game logic & loop
├── players/
│   ├── Player.java         # Abstract base class
│   ├── HumanPlayer.java
│   ├── ComputerPlayer.java
│   └── AFKPlayer.java
├── paintings/
│   ├── Painting.java       # Abstract painting
│   ├── LiteralPainting.java
│   ├── ColorfulPainting.java
│   ├── PortraitPainting.java
│   └── (other painting types...)
└── README.md
```


## License
Built as part of COMP2046 coursework – for educational purposes only.

Coursewoek designed by: Dr. Kevin Wang: kevinw@comp.hkbu.edu.hk
