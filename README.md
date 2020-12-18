# WebEngineering Module, Graded Exercise

## Commit Proposal

Matriculation Number: 19-487-388

Project idea short description:

#####Title: GetActiveTogether

The idea is to create an app which encourages people to get outside and do sports.
The app contains a List of predefined locations, where people can sign in to meet up to do sports together.
Each location contains different timeslots, for example people can meet up at 12 am or at 8 pm, with all signed users at these times shown.
The app should feature different activities like jogging, walking, cycling, mountain bike. The locations are activity specific.

#####Possible Workflow:
- CRUD locations, timeslots and users
- Assign users to timeslots
- Show locations sorted to amount of participants

#####Constraints:
- The selectable timeslots (dates) are limited to 2 weeks
- The predefined locations are only in and around my hometown, Oberwil (BL)

#####Possible Extensions:
- Security setup that only certain authorities can create, delete locations and timeslots
- Introducing time such that timeslots (dates) are per calendar week
- Showing locations on a map


## Project confirmation

I love the idea.

confirmed.

## Project delivery <to be filled by student>

How to start the project: (if other than `grailsw run-app`)

How to test the project:
Usually the app should be testable with `grailsw test-app`, but I get "test framework quit unexpectedly" error when running through the IDE.
Therefor, use `grailsw test-app -unit` and `grailsw test-app -integration` for testing if the same error appears.

Hand-written, static HTML 
project description:      (if other than `index.html` in project root directory)

External contributions:

Other comments: 
Username and password for Admin-Section: "admin". 

I'm particular proud of:
- I made an own template with a delete button for meetups, because otherwise users couldn't delete them.
- I made a custom login form so that it looks nicer and fits better to the rest of the app
- Every location shows it's coordinates on a small map

## Project grading 

<to be filled by lecturer>

