# 📱 EventPlukin

> An Android application designed to simplify event planning and management through a user-friendly mobile interface.

## 📌 About the Project

**EventPlukin** is an Android-based event management application developed to provide users with a convenient platform for exploring and managing different types of events.

The application provides dedicated sections for different event categories and includes features such as user login, registration, event booking, notifications, and navigation between different sections of the application.

The project was developed using **Java and XML in Android Studio**, with AndroidX and Material Design components for building the user interface.

---

## ✨ Features

### 🔐 Authentication

* User login
* New user registration

### 🏠 Home & Dashboard

* User-friendly home screen
* Organized event sections
* Easy navigation throughout the application

### 🎉 Event Categories

* 💍 Wedding Events
* 🎂 Birthday Events
* 💼 Business Events
* 💑 Engagement Events
* 🎊 Reception Events

### 📅 Event Booking

* Event booking interface
* User-friendly booking flow

### 🔔 Notifications

* Dedicated notification section
* Notification service integration

### 🧭 Navigation

* Bottom navigation
* Fragment-based navigation
* Easy access to major application sections

### 🎨 User Interface

* Material Design components
* XML-based layouts
* ConstraintLayout
* User-friendly mobile interface

---

## 🛠️ Technologies Used

| Technology             | Purpose                         |
| ---------------------- | ------------------------------- |
| ☕ Java                 | Android application development |
| 📱 Android             | Mobile application platform     |
| 🎨 XML                 | User interface design           |
| 🧩 AndroidX            | Android support libraries       |
| 🎨 Material Components | UI components and design        |
| 📐 ConstraintLayout    | Responsive UI layouts           |
| 🔧 Gradle              | Build and dependency management |
| 🧪 JUnit               | Unit testing                    |
| 🔍 Espresso            | Android UI testing              |

---

## ⚙️ Project Configuration

| Configuration       | Version |
| ------------------- | ------- |
| Compile SDK         | 33      |
| Target SDK          | 33      |
| Minimum SDK         | 21      |
| Java Compatibility  | Java 8  |
| Application Version | 1.0     |

---

## 📂 Project Structure

```text
EventPlukin/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com.example.eventplaneer/
│           │       ├── AboutusFragment.java
│           │       ├── birthday.java
│           │       ├── Booking.java
│           │       ├── BottomNav.java
│           │       ├── business.java
│           │       ├── DashboardFragment.java
│           │       ├── Engagement.java
│           │       ├── HomeFragment.java
│           │       ├── Login.java
│           │       ├── MainActivity.java
│           │       ├── MyService.java
│           │       ├── NotificationFragment.java
│           │       ├── Reception.java
│           │       ├── registration.java
│           │       └── Wedding.java
│           │
│           └── res/
│               ├── drawable/
│               ├── layout/
│               ├── mipmap/
│               ├── raw/
│               └── values/
│
├── gradle/
│   └── wrapper/
│
├── .gitignore
├── build.gradle
├── gradle.properties
├── gradlew
├── gradlew.bat
├── settings.gradle
└── README.md
```

---

## 🔄 Application Workflow

```text
                 ┌──────────────────┐
                 │    EventPlukin   │
                 └────────┬─────────┘
                          │
                          ▼
                 ┌──────────────────┐
                 │ Login / Register │
                 └────────┬─────────┘
                          │
                          ▼
                 ┌──────────────────┐
                 │ Home / Dashboard │
                 └────────┬─────────┘
                          │
            ┌─────────────┼─────────────┐
            │             │             │
            ▼             ▼             ▼
         Wedding       Birthday      Business
            │             │             │
            └─────────────┼─────────────┘
                          │
             ┌────────────┴────────────┐
             │                         │
             ▼                         ▼
       Other Events              Event Booking
             │                         │
             └────────────┬────────────┘
                          │
                          ▼
                    Notifications
```

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/rutujapatil445/EventPlukin.git
```

### 2. Open in Android Studio

Open **Android Studio** and select:

```text
File → Open → EventPlukin
```

### 3. Sync Gradle

Allow Android Studio to sync the Gradle files and download the required dependencies.

### 4. Connect a Device or Start an Emulator

You can either:

* Connect an Android smartphone with USB debugging enabled
* Start an Android Emulator

### 5. Run the Application

Click the **Run ▶** button in Android Studio.

---

## 🎯 Project Objectives

The main objectives of EventPlukin are:

* Develop a user-friendly Android application for event management
* Provide different event categories in a single application
* Simplify event exploration and booking
* Provide organized application navigation
* Create an attractive and intuitive mobile interface
* Gain practical experience in Android application development

---

## 📚 Learning Outcomes

Through this project, the following concepts were practiced:

* Android application development
* Java programming
* XML-based UI development
* Activities and Fragments
* Bottom navigation
* Material Design
* ConstraintLayout
* Android project structure
* Gradle configuration
* Android testing
* Git and GitHub

---

## 🔮 Future Enhancements

Possible future improvements include:

* ☁️ Cloud-based data storage
* 🔐 Secure authentication
* 💳 Online payment integration
* 📍 Location-based event discovery
* 📅 Calendar integration
* 🔔 Advanced event notifications
* 👤 User profile management
* ⭐ Event ratings and reviews
* 📸 Event image uploads
* 🗓️ Advanced event scheduling

---

## 📸 Screenshots

Add screenshots of the application here to make the repository more attractive to recruiters.

### 🏠 Home Screen

*Add screenshot here*

### 🔐 Login Screen

*Add screenshot here*

### 🎉 Event Categories

*Add screenshot here*

### 📅 Booking Screen

*Add screenshot here*

### 🔔 Notification Screen

*Add screenshot here*

---

## 👩‍💻 Developer

### Rutuja Patil

Computer Engineering Student

**GitHub:**
https://github.com/rutujapatil445

**Project Repository:**
https://github.com/rutujapatil445/EventPlukin

---

## 📌 Project Information

|                  |                |
| ---------------- | -------------- |
| **Project Name** | EventPlukin    |
| **Platform**     | Android        |
| **Language**     | Java           |
| **UI**           | XML            |
| **IDE**          | Android Studio |
| **Build System** | Gradle         |
| **Minimum SDK**  | 21             |
| **Target SDK**   | 33             |
| **Version**      | 1.0            |

---

## 📄 License

This project was developed for **educational and academic purposes**.
