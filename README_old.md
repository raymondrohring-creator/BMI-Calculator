# BMI Calculator (U.S. Customary Units – Adult)

A simple Java console application that calculates an adult’s Body Mass Index (BMI) using U.S. customary units (feet, inches, and pounds). The program prompts the user for height and weight, computes the BMI, and displays the corresponding BMI category.

## 📌 Features

* Accepts height in feet and inches

* Accepts weight in pounds

* Calculates BMI using the U.S. customary formula

* Displays BMI value and its interpreted category

* Straightforward console input/output

## 🧮 BMI Formula (U.S. Customary Units)

The calculation uses the standard formula:

```java
BMI = (weight_in_pounds / (height_in_inches²)) × 703
```

Where:

* 703 is the conversion factor for U.S. customary units

* Height is converted from feet and inches to total inches

## 📝 How the Program Works

1. The user is prompted to enter:

   * Height in feet

   * Height in inches

   * Weight in pounds

2. The program converts the height to total inches:

```java
totalInches = (feet × 12) + inches
```

3. BMI is calculated and printed.

4. Based on the BMI value, the program displays one of four standard categories:

| BMI Range	   | Category       |
| ------------ | -------------- |
| Below 18.5	 | Underweight    |
| 18.5 – 24.9	 | Healthy Weight |
| 25 – 29.9	   | Overweight     |
| 30 and above | Obesity        |

## ▶️ Running the Program

1. Ensure you have Java 8 or later installed.

2. Save the file as:

```java
BMI_Calculator_U_S_Customary_Units_Adult.java
```

3. Compile the program:

```java
javac BMI_Calculator_U_S_Customary_Units_Adult.java
```

4. Run it:

```java
java BMI_Calculator_U_S_Customary_Units_Adult
```

5. Follow the on-screen prompts to enter height and weight.

## 📁 Project Structure
```java
writeAJavaProject/
└── BMI_Calculator_U_S_Customary_Units_Adult.java
```
## 💡 Possible Enhancements

* Input validation for non-numeric or negative values

* Rounding BMI to 1–2 decimal places

* Support for metric units (cm, kg)

* Graphical user interface (GUI)

* Integration with a health-tracking app or database
