# 🎉 EventPlukin

> An Android application designed to simplify event planning and management through a user-friendly mobile interface.

---

## 📱 About the Project

**EventPlukin** is an Android-based event management application developed to provide users with a convenient platform for exploring and managing different types of events.

The application includes dedicated sections for different event categories such as:

- 💍 Wedding
- 🎂 Birthday
- 💼 Business Events
- 💕 Engagement
- 🏛️ Reception
- 📝 Event Registration
- 🔔 Notifications
- 👤 User Login

The project focuses on creating a simple and interactive Android experience with multiple screens, event categories, navigation, images, and multimedia resources.

---

## ✨ Features

### 🔐 User Authentication
- User login interface
- Registration interface
- User-friendly input forms

### 🏠 Home & Dashboard
- Home screen for accessing major sections
- Dashboard interface
- Simple navigation between application modules

### 🎊 Event Categories
The application provides separate sections for different event types:

- Wedding
- Birthday
- Engagement
- Business
- Reception

### 📅 Event Booking
- Event booking interface
- Event-related information
- Dedicated booking activity

### 🔔 Notifications
- Notification section
- Notification-related UI and resources

### 🧭 Navigation
- Bottom navigation
- Multiple activities and fragments
- Structured Android navigation flow

### 🎨 User Interface
- Material Design components
- Custom layouts
- Custom icons and images
- Event-specific visual assets

---

## 🛠️ Technologies Used

| Technology | Usage |
|------------|-------|
| ☕ Java | Application development |
| 📱 Android | Mobile application platform |
| 🧩 XML | User interface layouts |
| 🎨 Material Components | UI components |
| 🧱 ConstraintLayout | Responsive layouts |
| 🔧 Gradle | Build automation |
| 🧪 JUnit | Unit testing |
| 🔍 Espresso | Android UI testing |

---

## 📂 Project Structure

```text
EventPlukin/
│
├── app/
│   ├── src/
│   │   ├── androidTest/
│   │   └── main/
│   │       ├── java/
│   │       │   └── com.example.eventplaneer/
│   │       │       ├── AboutusFragment.java
│   │       │       ├── Booking.java
│   │       │       ├── BottomNav.java
│   │       │       ├── DashboardFragment.java
│   │       │       ├── Engagement.java
│   │       │       ├── HomeFragment.java
│   │       │       ├── Login.java
│   │       │       ├── MainActivity.java
│   │       │       ├── NotificationFragment.java
│   │       │       ├── Reception.java
│   │       │       ├── Wedding.java
│   │       │       ├── birthday.java
│   │       │       ├── business.java
│   │       │       └── registration.java
│   │       │
│   │       └── res/
│   │           ├── drawable/
│   │           ├── layout/
│   │           ├── menu/
│   │           ├── mipmap/
│   │           ├── raw/
│   │           ├── values/
│   │           └── xml/
│   │
│   ├── build.gradle
│   └── proguard-rules.pro
│
├── gradle/
│   └── wrapper/
│
├── build.gradle
├── gradle.properties
├── gradlew
├── gradlew.bat
└── settings.gradle
