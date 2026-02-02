# Modern Art – Java Implementation

A console-based Java simulation of **Modern Art**, the classic auction board game by Reiner Knizia.

This project was developed as part of the COMP2046 course assignments (HKBU, 2024-25 Semester 1). It simulates core gameplay mechanics including multiple auction types and computer-controlled players.

## Features

- **Auction types**:
  - Open Auction
  - Hidden Auction
  - Fixed Price Auction
  - One Offer Auction
- **Player types**:
  - Human player – interactive bidding and card selection via console
  - `ComputerPlayer` – rational AI that never bids above a painting's potential round-end value; bids conservatively (≤ half value) when already owning the painting
  - `AFKPlayer` – always bids 0 (forfeits) and plays the first available card
- Full game flow: 4 rounds, hand management, painting ownership, end-of-round & end-of-game scoring
- Modular design using packages (`players`, `paintings`, etc.)

## Project Structure

```
src/
├── ModernArt.java              # Main game logic and loop
├── paintings/
│   ├── Painting.java               # Abstract base class for all paintings
│   ├── OpenAuctionPainting.java
│   ├── HiddenAuctionPainting.java
│   ├── FixedPriceAuctionPainting.java
│   └── OneOfferAuctionPainting.java
└── players/
    ├── Player.java             # human player
    ├── ComputerPlayer.java     # Rational AI player
    └── AFKPlayer.java          # Non-bidding player
```

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA or another Java IDE.
3. Ensure JDK 8+ is configured.
4. Compile and run the main class `ModernArt.java`.

Follow console instructions:
- Enter painting index to play
- Enter bid amount (0 to forfeit/pass)
- Computer and AFK players act automatically


## Rules Reference
This implementation follows the official **Modern Art** rules with the following simplifications/adaptations made in the assignment:
- Only the four auction types listed above (no double auction)
- Scoring and tie-breaking as per the rulebook

Full official rules: [Modern Art Rulebook](./modern-art-rulebook.pdf)
Video tutorials:  
- [English](https://www.youtube.com/watch?v=CrwHrstvA0k)  
- [Putonghua](https://www.youtube.com/watch?v=9PGt1krM7Ww)


## Learning Objectives Demonstrated

- Advanced OOP: inheritance (painting & player hierarchies), polymorphism, abstract classes
- Package organization and modular code
- Collections (ArrayList) for hands, ownership, bids
- Game state management, input validation, turn loop
- Simple but effective AI decision logic

## Academic Context & License

Developed for **COMP2046** Programming Assignments (PA2 + PA3), Hong Kong Baptist University, 2024-25 Semester 1.  
Assignment references:  
- [PA2 GitHub](https://github.com/khwang0/COMP2046-2425PA2)  
- [PA3 GitHub](https://github.com/khwang0/COMP2046-2425PA3)
