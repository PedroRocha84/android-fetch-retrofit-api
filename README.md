
# 🧮 Random Quote

This Android app fetches a random quote from an external API using the **Retrofit** library. Each time the **"Get Quote"** button is pressed, a new quote is retrieved from the web. The project was created to explore **networking concepts** and learn how to consume **public REST APIs** in Android.

## 📝 Releases
- v1.1.0 Release: Webview with loading error handling
- v1.0.0 Release: Open author URL with a WebView Widget

## 🚀 Features

- 🔁 Fetch a random quote from the https://api.quotable.kurokeita.dev/ public API
- 📱 Display the quote and author on the main activity;
- 🔍 Navigate to a **details screen**, another activity, with additional quote information that i chose without any logic behind. Only for testing data and navigation through both activities
- 🔗 **NEW FEATURE** a new activity that loads the url parsed from the API. - Release v1.0.0
- 🔗 **NEW FEATURE** webviewclient is able to handle and load a index.html file if an error occur with the url (404 ... )  - Release v1.1.0

## 📌 Backlog

- Use native C function to convert the quote text to uppercase, and display the transformed result below the original quote.
- Validate if the device have connectivity to internet prior any fetching data

## 🛠️ Built With

- **Android Studio**
- **Java**
- **XML Layouts**
- **Retrofit Library**

## 📁 Project Structure

```
background-services
app/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── pt/pedrorocha/android/androidretrofitapi/
│ │ │ ├── model/
│ │ │ │ └── Author.java
│ │ │ │ └── Quote.java
│ │ │ │ └── Response.java
│ │ │ │ └── Tag.java
│ │ │ ├── view/
│ │ │ │ └── MainActivity.java
│ │ │ │ └── DetailsActivity.java
│ │ │ │ └── WebviewActivity.java
│ │ │ ├── network/
│ │ │ │ └── JsonInterface.java
│ │ ├── res/
│ │ │ ├── layout/
│ │ │ │ └── activity_main.xml
│ │ │ └── values/
│ │ │ └── strings.xml
│ │ └── AndroidManifest.xml
```

## 📸 Screenshots

<img width="180" height="375" alt="image" src="https://github.com/user-attachments/assets/ce26c847-e2f4-4cdd-b0f8-3938acd2024b" />
<img width="180" height="375"  alt="image" src="https://github.com/user-attachments/assets/50910d08-7bf6-44c4-9130-1ded32a3fe58" />
<img width="180" height="375"  alt="image" src="https://github.com/user-attachments/assets/10ccfd1a-f0df-4934-a957-41e31e375ec2" />
<img width="180" height="375" alt="image" src="https://github.com/user-attachments/assets/82a57577-59a8-486b-975e-5f6dbbc3564d" />



## 🧠 Learning Goals

- Used **Retrofit**, a type-safe HTTP client for Android, to perform a `GET` request to a public API (e.g., JSONPlaceholder or Quotes API).
- **Defined a Retrofit service interface** (`JsonService`) to declare endpoint methods and their return types.
- Configured **Retrofit client** with a base URL and `GsonConverterFactory` to parse JSON responses automatically.
- **Performed asynchronous network calls** to retrieve data in the background, ensuring a responsive UI.
- Parsed complex nested **JSON structures** into strongly typed **Java model classes** (`Quote`, `Author`, `Tag`).
- Learned and apply how to use a simple Webview widget to load the url parsed from the API.
- Handle permissions on AndroidManifest.xml to allow access to the internet.

## 🔧 How to Run


1. Clone the repository:
```shell
git clone git@github.com:PedroRocha84/android-fetch-retrofit-api.git
```

2. Open the project in Android Studio
3. Launch an emulator or connect a device
4. Click Run (Shift + F10)
