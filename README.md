# WebEngineering Module, Graded Exercise

## Commit Proposal

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
Therefore, use `grailsw test-app -unit` and `grailsw test-app -integration` for testing if the same error appears.

Hand-written, static HTML 
project description:      (if other than `index.html` in project root directory)

External contributions:

Other comments: 
Username and password for Admin-Section: "admin". 

I'm particular proud of:
- I made an own template with a delete button for meetups, because otherwise users couldn't delete them.
- I made a custom login form so that it looks nicer and fits better to the rest of the app
- Every location shows its coordinates on a small map

## Project grading 

index.html given and valid.

The application works.

Functionality is an information system with CRUD operations for 4 domain classes in 3 many-to-one
relations plus security, specialized views and controllers, declarative validation, data setup, and maps integration.

Git log is good.
Unit and integrations tests provided, incl. security.
HTML validity:  Element "a" is missing one or more of the following attributes: href, role.
(You are actually misusing the anchor element.)
Some comments in the tests, otherwise missing.

Since we hit the ceiling anyway, there are no extra points like for calling external services.
I very much like your work on the UI, though, and you make good use of the framework features.

Congratulations!
You created a fully functional, distributed, interactive, multi-user, security-enabled, database-backed, 
unit- and integration-tested web application
from scratch on your own in a rather tight time frame showing solid knowledge of WebMVC and engineering practices.
Many professional developers in the industry would have estimated more time for this feature set.
You can use this project as a work proof when applying for a job.

Grade: 6.0

