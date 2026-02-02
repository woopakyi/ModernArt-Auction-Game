# Modern Art – Java Implementation

A faithful Java implementation of **Modern Art**, the classic auction board game designed by Reiner Knizia.

This project was developed as part of the COMP2046 course assignments (HKBU, 2024-25 Semester 1). It simulates core gameplay mechanics including multiple auction types and computer-controlled players.

## Features

- **Auction types**:
  - Open Auction
  - Hidden Auction
  - Fixed Price Auction
  - One Offer Auction
- **Player types**:
  - Human player (interactive input)
  - `ComputerPlayer` – rational bidding (never overbids potential value, protective bidding when owning the painting)
  - `AFKPlayer` – always passes / plays first card
- Full game flow: 4 rounds, hand management, painting ownership, end-of-round & end-of-game scoring
- Modular design using packages (`players`, `paintings`, etc.)
- Compatible with provided demo.jar behavior for reference

## Project Structure

```
src/
├── ModernArt.java              # Main game logic and loop
├── paintings/
│   └── Painting.java           # Painting card + artist & value logic
└── players/
    ├── Player.java             # Abstract base player
    ├── HumanPlayer.java        # (assumed) interactive player
    ├── ComputerPlayer.java     # Rational AI player
    └── AFKPlayer.java          # Non-bidding / auto-play player
```

## How to Run

1. Clone the src of the project.

2. Build a project in IntelliJ IDEA with the scr.

3. Run  `ModernArt.java`.

Follow console prompts to play as human. Computer and AFK players act automatically.

## Rules Reference

This implementation follows the official **Modern Art** rules with the following simplifications/adaptations made in the assignment:
- Only the four auction types listed above (no double auction)
- Scoring and tie-breaking as per the rulebook

Full rules: [Modern Art Rulebook](./modern-art-rulebook.pdf)  
Video tutorial: [English](https://www.youtube.com/watch?v=CrwHrstvA0k) | [English](https://www.youtube.com/watch?v=9PGt1krM7Ww)


## Learning Objectives Demonstrated

- Object-oriented programming (inheritance, polymorphism, abstract classes)
- Packages and proper class organization
- ArrayList / collections usage
- Game loop, state management, and input validation
- Basic AI decision-making logic

## License

This project was created for COMP2045 / COMP2046 in academic purposes.  
Assignment Website: [PA2](https://github.com/khwang0/COMP2046-2425PA2) | [PA3](https://github.com/khwang0/COMP2046-2425PA3) 
