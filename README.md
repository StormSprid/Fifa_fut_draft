
# 🎮 FUT Draft Console Edition — Technical Specification

## 📌 General Information
**Project Name:** FUT Draft Console Edition  
**Type:** Console application (Java SE, no Spring)  
**Goal:** Create a mini-simulator of FIFA Ultimate Team draft. The player builds a team from random footballers and competes against an AI team.

---

## 🧱 Entities

### 👤 Player
- `name: String`
- `position: String` (GK, DF, MF, FW)
- `rating: int` (1–100)
- `club: String`
- `nationality: String`

### ⚽ Team
- `name: String`
- `List<Player> players`
- `getTotalRating()` — sum of ratings
- `getChemistry()` — optional bonus based on club/nationality
- `displayTeam()` — shows the lineup

### 🎲 DraftEngine
- `startDraft()` — runs 11-round draft, strictly by position
- Offers 3–5 random players per round

### 🤖 AIDrafter
- Automatically builds an opponent team

### 🏆 MatchSimulator
- Compares teams by total rating and optional chemistry
- Declares a winner

---

## 🔁 Game Flow
1. Welcome message
2. Step-by-step player draft (11 rounds: 1 GK, 4 DF, 3 MF, 3 FW)
3. Opponent team generation
4. Rating comparison
5. Match result announcement
6. Option to restart or exit

---

## 💻 Console Interface
Each round shows a selection of players to choose from (3–5).  
At the end of the draft:
- Display both teams
- Show total team strength
- Announce winner

---

## 🛠️ Requirements

### Required:
- Use of OOP: classes like Player, Team, DraftEngine, etc.
- Use of collections: List, Map
- Input validation and error handling
- Team structure based on positions
- Clean and modular code

### Optional:
- Chemistry system (bonus for same club/nation)
- Match history tracking
- Save/load favorite team
- Game modes (e.g., only Premier League)

---

## 🧪 Skills Practiced
| Skill | Application |
|-------|-------------|
| OOP | Class design and object management |
| Collections | Teams, player pools |
| Random | Generating player options |
| Input handling | Interactive menu |
| Logic | Draft rules, match simulation |
