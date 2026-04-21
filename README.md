# 🎬 Movie Booking System

### (Facade + Adapter Design Pattern Implementation)

---

## 📌 Project Overview

This project demonstrates the implementation of two important design patterns:

* **Facade Pattern** → Simplifies complex system interactions
* **Adapter Pattern** → Integrates multiple payment gateways seamlessly

The application simulates a **Movie Ticket Booking System**, where multiple services (payment, seat booking, notification, etc.) are combined into a single easy-to-use interface.

---

## 🎯 Objectives

* To understand and implement **Facade Design Pattern**
* To demonstrate real-world use of **Adapter Pattern**
* To reduce system complexity using abstraction
* To build a modular and extensible system

---

## 🧩 Design Patterns Used

### 1️⃣ Facade Pattern

Provides a unified interface to a set of subsystems.

👉 In this project:

* `MovieBookingFacade` acts as a single entry point
* Internally handles:

  * Payment
  * Seat Reservation
  * Ticket Generation
  * Loyalty Points
  * Notifications

---

### 2️⃣ Adapter Pattern

Allows incompatible interfaces to work together.

👉 In this project:

* `PaymentGateway` → Target interface
* `RazorpayAPI` → Existing incompatible system
* `RazorpayAdapter` → Converts interface to match system

✔ Enables switching between:

* PayU
* Razorpay

---

## 🏗️ System Architecture

```
Client (Main)
      ↓
MovieBookingFacade
      ↓
-----------------------------------
| PaymentService (Adapter used)   |
| SeatReservationService          |
| TicketService                   |
| LoyaltyPointsService            |
| NotificationService             |
-----------------------------------
```

---

## ⚙️ Features

* 🎟️ Book movie tickets
* 💳 Multiple payment gateway support
* 🪑 Multi-seat reservation
* 🎫 Ticket generation with Booking ID
* ⭐ Loyalty points system
* 📩 Email notification simulation
* 🔄 Easy switching of payment providers

---

## 🔄 Without Facade vs With Facade

### ❌ Without Facade

* Client manually calls multiple services
* Complex and tightly coupled

### ✅ With Facade

* Single method call:

```java
facade.bookMovieTicket(...)
```

* Clean and maintainable

---

## 🚀 How to Run

### 1️⃣ Compile

```bash
javac Main.java
```

### 2️⃣ Run

```bash
java Main
```

---

## 📊 Sample Output

```
========== MOVIE BOOKING STARTED ==========

Step 1: Processing Payment...
✔ Paid Rs.750 using Razorpay for invoice: ...
✔ Payment successful for account user123

Step 2: Reserving Seats...
✔ Seat A1 reserved
✔ Seat A2 reserved
✔ Seat A3 reserved

Step 3: Generating Ticket...
✔ Ticket generated...

Step 4: Adding Loyalty Points...
✔ 50 loyalty points added

Step 5: Sending Notification...
✔ Booking confirmation sent

🎉 Movie ticket booking completed successfully!
```

---

## 💡 Key Benefits

* ✔ Reduced complexity
* ✔ Loose coupling
* ✔ Easy maintenance
* ✔ Scalable design
* ✔ Real-world applicability

---

## 🧠 Learning Outcomes

* Understanding abstraction in system design
* Applying multiple design patterns together
* Writing modular and reusable code
* Handling real-world system integration problems

---

## 📌 Future Enhancements

* GUI (JavaFX / Web Interface)
* Database integration
* Real payment API integration
* User authentication system

---

## 👨‍💻 Authors

* **Rajat Parihar : C_17**
* **Sujal Hedau : C_47**
* **Tushar Dhakate : C_54**
* **Varun Singh : C_59**


---

## ⭐ Conclusion

This project effectively demonstrates how **Facade Pattern simplifies complex workflows** and how **Adapter Pattern enables flexible integration**, making the system robust and scalable.

---
