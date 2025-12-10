# ✈ Travel and Tourism Management System (TTMS)

## Overview

The Travel and Tourism Management System (TTMS) is a desktop application developed using *Java Swing* for the frontend GUI and *JDBC* for integration with a *MySQL* database. This project was developed as a requirement for the Advanced Computer Programming (ACP) course, focusing on implementing a robust, event-driven user interface and backend persistence.

### Key Features

* *User Authentication:* Secure Login, Signup, and Forgot Password functionalities.
* *Event-Driven Dashboard:* A central dashboard with 15 functional modules leveraging Java's Event Delegation Model.
* *CRUD Operations:* Functionality to Add, View, Update, and Delete customer details.
* *Booking Management:* Dedicated screens for booking and viewing packages and hotels.
* *Dynamic UI Elements:* Use of Multi-threading for hotel and destination slideshows (Runnable).
* *External Utility Integration:* Launching system utilities like Calculator and Notepad.

## 👥 Team & Supervision

| Role | Name | SAP ID | Contact Email |
| :--- | :--- | :--- | :--- |
| *Supervisor* | Sir Usman | N/A | N/A |
| *Group Member* | Shahroz Khalid | 53531 | 53531@students.riphah.edu.pk |
| *Group Member* | Basit Ali | 54596 | 54596@students.riphah.edu.pk |

## 🛠 Technology Stack

| Component | Technology | Role |
| :--- | :--- | :--- |
| *Frontend/GUI* | Java Swing, AWT | Creating platform-independent graphical user interfaces. |
| *GUI Layout* | BorderLayout, GridLayout, FlowLayout | Structured, responsive, and scalable component arrangement. |
| *Event Handling* | ActionListener, Runnable, Thread | Managing user interaction and multi-threading for dynamic content. |
| *Database* | MySQL | Backend storage for user accounts and booking data. |
| *Connectivity* | JDBC (MySQL Connector/J) | Facilitating Java-to-Database communication. |

## 🏗 Project Architecture & Layout

The project strategically uses various layout managers to achieve a professional design:

### 1. Layout Manager Implementation

* **BorderLayout:** Used on the main **Dashboard.java** frame to divide the screen into clear *NORTH* (Header), *WEST* (Menu Sidebar), and *CENTER* (Main Content/Image) regions.
* **GridLayout:** Used inside the dashboard's West Panel to arrange all menu buttons into a uniform, clean column structure.
* **FlowLayout:** Used in the Dashboard's North panel to arrange components (Icon and "Dashboard" text) in a simple left-to-right flow.
* **null Layout:** Used extensively across forms (Login.java, Signup.java, AddCustomer.java) for precise, pixel-perfect placement of components.

### 2. Event Handling Model

All user interactions adhere to the *Event Delegation Model*:

* **ActionListener:** Implemented in all forms and buttons (Login, Signup, Dashboard menu, BookHotel).
* **Runnable & Thread:** Implemented in Loading.java, CheckHotels.java, and Destinations.java for asynchronous operations like progress bar loading and smooth image slideshows.

## ⚙ Setup and Execution

### Prerequisites

1.  *Java JDK (8 or newer)* installed.
2.  *MySQL Server* installed.
3.  *MySQL JDBC Connector/J* library added to the project's classpath.

### Database Setup

1.  Create a new database named tms (or similar) in MySQL.
2.  Execute the necessary SQL commands to create the required tables (account, customer, bookpackage, bookhotel, etc.).

### Running the Application

1.  Compile all .java files located in the travel.management.system package.
2.  Execute the main class, which is **Splash.java**:
    bash
    java travel.management.system.Splash
    

---

## 👨‍💻 Group Contribution (Final Submission)

This project was developed by two members. The work was divided and documented across the final commits to ensure equal contribution credit:

| Contributor | Focus Area |
| :--- | :--- |
| *Shahroz Khalid (53531)* | Base Navigation Flow, GUI Layout Merge, Utility Classes (Splash, Loading, Dashboard, External Tools). |
| *Basit Ali (54596)* | Form and Data Management (CRUD Forms, Booking/Viewing Packages and Hotels, Database Logic). |

---

*Thank you for reviewing the Travel and Tourism Management System project.*
