# spring_phonebook

This is a simple Spring project, implementing a phonebook with REST services. OpenCSV library is used to store data into csv files.

Java 1.8 is required to startup the project.

Here is the list of available APIs along with a short description:

## Phonebook functionalities

- Get contact's details:
Type: GET
Endpoint: /rubrica/get?name={name}&surname={surname}

Get info about a contact stored in the csv file "rubrica.csv", searching it through its name and surname, supplied as parameters.

- Get all contacts:
Type: GET
Endpoint: /rubrica/getAll

Get info about all stored contacts in the csv file "rubrica.csv".

- Add a new contact:
Type: POST
Endpoint: /rubrica/add
Body: Contact object as JSON.

Add a new record into "rubrica.csv". Contact object has three string fields: name, surname and phoneNumber.
Refer to Contact.java for more details.

## User functionalities
These functionalities are here only for training purposes; not really needed for the phonebook. 

- Get all users:
Type: GET
Endpoint: /user/getAll

Get info about all stored users in the csv file "user.csv".

- Add a new user:
Type: POST
Endpoint: /user/add
Body: User object as JSON.

Add a new record into "user.csv". User object has two string fields: username, password.
Refer to User.java for more details.


PS: If one accidentaly deleted the csv files, they are recreated with an /add call, but not with /get or /getAll calls.


