# War-Uno Card Game Simulator

## Project Overview

This is a Java-based card game simulation that combines elements of Uno and War. The project explores different AI strategies for playing the game and demonstrates object-oriented programming principles.

## Game Rules

- Played with a standard 52-card deck
- Each player starts with a 5-card hand
- Players take turns playing cards that match the suit or have an equal/higher rank
- First player to win 10 rounds wins the game

## AI Strategies

The project implements three AI strategies:
- Random Card AI: Plays the first valid card
- Smallest Card AI: Always plays the lowest-ranked valid card
- Biggest Card AI: Always plays the highest-ranked valid card

## Project Structure

Key classes:
- `Card`: Represents a single playing card
- `Deck`: Manages the card deck
- `Hand`: Manages a player's hand of cards
- `CardPile`: Tracks the cards played in each round
- `AI`: Base AI class with random strategy
- `SmallestCardAI`: AI that plays smallest valid card
- `BiggestCardAI`: AI that plays biggest valid card
- `UnoWarMatch`: Manages game rounds and win tracking
- `Tournament`: Runs simulations between different AI strategies

## Learning Goals

- Practice object-oriented design
- Implement data structures using arrays
- Explore polymorphism and inheritance
- Simulate game strategies through AI

## Development

Developed as part of an Introduction to Algorithms, Data Structures, and Program Development course.
