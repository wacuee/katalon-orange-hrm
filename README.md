# Automation testing project using Katalon Studio for UI testing.
## Project Overview
This project is an automation testing for the OrangeHRM Login feature & forgot password feature, built using Katalon Studio.
### Tech Stack
- Katalon Studio
- Groovy

### Project Structure
```
├── TestCase/
│ └── Forget Password Page/
│      	└── FP-01 | Visit forgot password page |
|      	└── FP-02 | Leave the input field and then click Reset Password button |
| 	└── FP-03 | Input username that will be reseted and then click  Reset Password Button |
|	└── FP-04 | Click Cancel button |
|└── Login Page
| 	└──LF-01 | Login with right Username & Password |
| 	└──LF-02 | Login with wrong Username & Password |
| 	└──LF-03 | Login with wrong Username   |
| 	└──LF-04 | Inputing Empty Username and Password  |
├── Keywords/
│ └── (default package)
│      	└── BasePage.groovy
|      	└── ForgetPassword.groovy
| 	└── LoginScreen.groovy
|	└── dashboard.groovy
```

# Test Scenarios
### Login page functionals tests
| Test cases | Description |
|:----:|:----:|
| LF-01 | Login with right Username & Password |
| LF-02 | Login with wrong Username & Password |
| LF-03 | Login with wrong Username   |
| LF-04 | Inputing Empty Username and Password  |


### Forgot password page functionals tests
| Test cases | Description |
|:----:|:----:|
| FP-01 | Visit forgot password page |
| FP-02 | Leave the input field and then click Reset Password button |
| FP-03 | Input username that will be reseted and then click  Reset Password Button |
| FP-04 | Click Cancel button |
