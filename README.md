# 👻 GhostBusters Asturias

A Java console-based ghost hunting game where players can capture, release, and filter ghosts by class and month. The project follows a MVC architecture with `model`, `controller`, and `view` packages.

---

## 📜 Features

✔ Capture ghosts with unique abilities.  
✔ Release ghosts from the player's collection.  
✔ Filter ghosts by class or the month they were captured.  
✔ Console-based interactive UI for easy management.  

---

## 🛠 Technologies Used

- Java  
- JUnit 5 (for testing)  
- Hamcrest (for assertions)  

---

## 📂 Project Structure

```plaintext
📦 ghostbusters
 ┣ 📂 src
 ┃ ┣ 📂 model
 ┃ ┃ ┣ 📜 Ghost.java
 ┃ ┃ ┣ 📜 Player.java
 ┃ ┣ 📂 controller
 ┃ ┃ ┣ 📜 Controller.java
 ┃ ┣ 📂 view
 ┃ ┃ ┣ 📜 ConsoleView.java
 ┃ ┣ 📂 test
 ┃ ┃ ┣ 📜 GhostTest.java
 ┃ ┃ ┣ 📜 PlayerTest.java
 ┗ 📜 Main.java
```

 ##🎮 How to Play
1. Capture a Ghost
- Enter a name, class, danger level, and ability.
- Example: "Phantom of the Lighthouse", CLASS_III, HIGH, "Haunts lost ships"

2. View Captured Ghosts
- Displays a list of all ghosts in your collection.

3. Release a Ghost
- Removes a ghost from your captured list.

4.Filter by Class
- Allows filtering ghosts by their assigned class.
- Example: Show only CLASS_IV ghosts.

5. Filter by Month
- View all ghosts captured in a specific month.
- Example: Show ghosts captured in March (3).

6. Exit the Game
- Quits the application.
