# BankOfKennesawBackend

Open a terminal in the directory you want your project to be and run these commands 

git clone url

cd bankOfKennesawBackend


git pull



Open the project in a code editor and do a maven update -

Eclipse - Right click on the project > Select Maven > Update Project
IntelliJ - Right click on the project > Select Maven > Generate sources and update folders



Run the BankOfKennesawApplication.java file


After the program compiles, open a web browser and go to localhost:8080/h2-console


Paste this line into the JDBC URL line and hit connect - jdbc:h2:~/test2;AUTO_SERVER=true


In the backend there is a file called SQLMainScripts.sql - copy the contents of that file, paste it into the h2 console, and hit run.


If you are not already running the frontend code, follow the instructions on the frontend repository's readme file

When you get both the frontend and backend running at the same time, the application should be fully functional

