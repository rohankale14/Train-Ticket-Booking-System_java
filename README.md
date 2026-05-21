# Train-Ticket-Booking-System_java

A simple Java console-based railway reservation system inspired by the Indian Railway Catering and Tourism Corporation (IRCTC).  
This project allows users to register, log in, search trains, book tickets, view booked tickets, and cancel tickets using a command-line interface.

---

## 📌 Features

- 👤 User Registration & Login
- 🚆 Search Trains by Source and Destination
- 🎫 Book Train Tickets
- 📄 View Booked Tickets
- ❌ Cancel Tickets
- 📋 View All Available Trains
- 🔐 User Authentication System
- 💺 Seat Availability Management

---

## 🛠️ Technologies Used

- ☕ Java
- 📚 Object-Oriented Programming (OOP)
- 🖥️ Console/Terminal Based Interface

---

## 📂 Project Structure

```bash
IRCTC-Console-App/
│
├── IRCTCAPP.java
├── BookingService.java
├── Train.java
├── Ticket.java
├── User.java
└── UserService.java
```

---

## 📖 Class Description

### `IRCTCAPP.java`
Main application class that runs the console menu system.

### `BookingService.java`
Handles:
- Train searching
- Ticket booking
- Ticket cancellation
- Train listing

### `Train.java`
Stores train details like:
- Train ID
- Train Name
- Source & Destination
- Seat Availability
- Journey Date

### `Ticket.java`
Stores booked ticket information.

### `User.java`
Stores user details such as:
- Username
- Password
- Full Name
- Email
- Contact Number

### `UserService.java`
Handles user registration, login, logout, and authentication.

---

## 🚀 How to Run the Project

### 1️⃣ Clone Repository

```bash
git clone https://github.com/your-username/IRCTC-Console-App.git
```

---

### 2️⃣ Open Project

Open the project in:
- VS Code
- IntelliJ IDEA
- Eclipse

---

### 3️⃣ Compile Java Files

```bash
javac *.java
```

---

### 4️⃣ Run Application

```bash
java IRCTCAPP
```

---

## 🖥️ Sample Console Output

```bash
-------Welcome to IRCTC App-------

1.Register
2.Login
3.Exit

Enter Choice:
```

---

## 🚆 Available Trains

| Train ID | Train Name | Source | Destination |
|---|---|---|---|
| 101 | Shathabdi Express | Malkapur | Mumbai Central |
| 102 | Rajdhani Express | Malkapur | Bangalore |
| 103 | Vande Bharat | Malkapur | Nashik |
| 104 | Tejas Express | Malkapur | Pune |
| 105 | Humsafar Express | Malkapur | Chhatrapati Sambhaji Nagar |

---

## 📚 Concepts Used

- Classes & Objects
- Constructors
- Encapsulation
- ArrayList
- Iterators
- Conditional Statements
- Loops
- Scanner Class
- Method Overriding

---

## 🔮 Future Improvements

- 💾 Database Integration (MySQL)
- 🌐 GUI Version using Java Swing/JavaFX
- 🔑 Password Encryption
- 📧 Email Notifications
- 🧾 PNR Status System
- 🪑 Seat Selection Feature
- 🔄 Real-time Train Availability

---

## 👨‍💻 Author

Developed by **Rohan**

---

## ⭐ GitHub

If you like this project, give it a ⭐ on GitHub.
