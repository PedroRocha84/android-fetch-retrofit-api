
# 🧮 Random Quote

This Android app fetches a random quote from an external API using the **Retrofit** library. Each time the **"Get Quote"** button is pressed, a new quote is retrieved from the web. The project was created to explore **networking concepts** and learn how to consume **public REST APIs** in Android.
## 🚀 Features

- 🔁 Fetch a random quote from the https://api.quotable.kurokeita.dev/ public API
- 📱 Display the quote and author on the main activity;
- 🔍 Navigate to a **details screen**, another activity, with additional quote information that i chose without any logic behind. Only for testing data and navigation through both activities
- 🔗 **NEW FEATURE** a new activity that loads the url parsed from the API.

## 📌 Backlog

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

<img width="150" height="320" alt="image" src="https://github.com/user-attachments/assets/b0ac38ed-8949-4d4f-8272-419af4fcdd69" />
<img width="150" height="320" alt="image" src="https://github.com/user-attachments/assets/89ce4a63-7785-4cc6-861e-cb158b9c6dce" />

## 🧠 Learning Goals

- Used **Retrofit**, a type-safe HTTP client for Android, to perform a `GET` request to a public API (e.g., JSONPlaceholder or Quotes API).
- **Defined a Retrofit service interface** (`JsonPlaceholderService`) to declare endpoint methods and their return types.
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
