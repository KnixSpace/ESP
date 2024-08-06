# E-Healthcare Management System

Welcome to the E-Healthcare Management System repository! This console-based Java application allows for the management of healthcare records using CSV files.
  
## Features

- **CRUD Operations:** Perform Create, Read, Update, and Delete operations for healthcare records.

- **CSV Data Storage:** Utilizes CSV files for data storage, making it easy to manage and transfer data.

- **Buffered Reader:** Implements a buffered reader for efficient reading of CSV files, enhancing performance.

## How to Use

1. **Clone the Repository:**

    ```bash
    git clone https://github.com/your-username/your-ehealthcare-repo.git
    cd your-ehealthcare-repo
    ```

2. **Compile and Run:**

    Compile the Java files and run the application.

    ```bash
    javac Main.java
    java Main
    ```

3. **Follow Console Prompts:**

    The application will guide you through the process of managing healthcare records.

## CSV File Structure

The CSV file follows a specific structure for healthcare records. Ensure the CSV file adheres to the following format:

```csv
PatientID,FirstName,LastName,DOB,Gender,Condition
1,John,Doe,1990-01-15,Male,Diabetes
2,Jane,Smith,1985-08-22,Female,Hypertension
3,Bob,Johnson,1972-03-10,Male,Asthma
