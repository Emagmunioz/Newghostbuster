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
