# Automation Testing Project - OrangeHRM Login Page (Katalon Studio)

## Project Overview
This project contains UI automation tests for the **OrangeHRM Login Page**, built with Katalon Studio. The tests cover positive and negative login scenarios, input validation, and basic security checks (SQL injection and XSS).

- **Application under test:** https://opensource-demo.orangehrmlive.com
- **Project code:** LGP01 - Login Page
- **Test Lead:** Silmi
- **Project Manager:** Ahmad

## Tech Stack
- Katalon Studio
- Groovy

## Project Structure
```
├── Test Cases/
│   └── Login Page/
│       ├── LF-01 | Login with valid Username & Password
│       ├── LF-02 | Login with invalid Username & Password
│       ├── LF-03 | Login with invalid Username
│       ├── LF-04 | Login with empty Username and Password
│       ├── LF-05 | Login with valid Username & invalid Password
│       ├── LF-06 | Click 'Forgot your Password?' link opens reset password page
│       ├── LF-07 | Login with SQL injection in Username
│       ├── LF-08 | Login with XSS script in Username
│       ├── LF-09 | Login with very long Username (1000 characters)
│       ├── LF-10 | Login with SQL injection in Password field
│       ├── LF-11 | Login with added spaces in Username field
│       ├── LF-12 | Login with added spaces in Password field
│       ├── LF-13 | Login with Password in different letter case
│       └── LF-14 | Login with leading or trailing spaces in Username field
└── Keywords/
    └── (default package)
        ├── BasePage.groovy
        ├── LoginScreen.groovy
        └── dashboard.groovy
```

## Test Scenarios
**Scenario:** SCN-001-Login-Feature-Login

| ID | Test Case | Category | Priority |
|:--:|:----------|:--------:|:--------:|
| LF-01 | Login with valid Username & Password | Positive | Critical |
| LF-02 | Login with invalid Username & Password | Negative | Critical |
| LF-03 | Login with invalid Username | Negative | High |
| LF-04 | Login with empty Username and Password | Negative | Medium |
| LF-05 | Login with valid Username & invalid Password | Negative | High |
| LF-06 | Click 'Forgot your Password?' link opens reset password page | Positive | Low |
| LF-07 | Login with SQL injection in Username | Negative | High |
| LF-08 | Login with XSS script in Username | Negative | High |
| LF-09 | Login with very long Username (1000 characters) | Negative | High |
| LF-10 | Login with SQL injection in Password field | Negative | High |
| LF-11 | Login with added spaces in Username field | Negative | Medium |
| LF-12 | Login with added spaces in Password field | Negative | Medium |
| LF-13 | Login with Password in different letter case | Negative | Medium |
| LF-14 | Login with leading or trailing spaces in Username field | Negative | Medium |

## Expected Results Summary

| Condition | Expected Result |
|:----------|:----------------|
| Valid credentials | Redirected to the dashboard page |
| Invalid credentials (wrong username and/or password, extra spaces, wrong letter case) | Pop up **'Invalid credentials'** is displayed, user stays on the login page |
| Empty Username and Password | Error **'Required'** is displayed under both fields |
| SQL injection / XSS input | Pop up 'Invalid credentials', no SQL error, no stack trace, no JavaScript alert, and input is not rendered as HTML |
| Click 'Forgot your Password?' | Redirected to the Reset Password page (`/auth/requestPasswordResetCode`) |

## Test Data

| Field | Value used |
|:------|:-----------|
| Valid Username | `Admin` |
| Valid Password | `admin123` |
| Invalid Username | `Admina` |
| Invalid Password | `admina123`, `qwe123`, `ADMiN123` |
| Injection / special input | `' OR '1'='1`, `<script>alert(1)</script>`, 1000 x `a` |

## Test Results
All 14 test cases (LF-01 to LF-14) have status **Passed**.

Detailed test cases, results, and screenshots: https://docs.google.com/spreadsheets/d/1iYoe3HeEPzMC6tQOSPphBdZeRhBKeg1Tvq3-VyOXMDs/edit?usp=sharing
