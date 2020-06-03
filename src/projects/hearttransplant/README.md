# Overview
A heart transplant is a surgical procedure that replaces the person’s heart with a donor heart. A person may require a heart transplant for several reasons including congenital, arterial and muscle diseases or for unforeseen reasons such as accidents or viral infections.

The donor heart is matched to the recipient by blood type. Additional variables are also used to decide which recipient receives a heart if there are not enough hearts available for all recipients waiting for a transplant. The variables included in the decision may include the recipient state of health, cause of the heart condition and the urgency of the transplant.

The primary goal of this project is to write a matching function that receives as a parameter the number of available hearts for transplant and will output all the recipients ranked in order of precedence.

## Project Classes
This project includes several classes. 
Following is a high level description of each class (more information available in the respective .java file):

**Person** defines a person waiting for a heart transplant.

**SurvivabilityByAge** defines the rate of survivability by age after a certain number of years after the transplant.

**SurvivabilityByCause** defines the rate of survivability by heart condition cause after a certain number of years after the transplant. 

**HeartTransplant** is the driver of the heart transplant program.

## Data File and Execution
The data file contains information on 21 people of the same blood type, 24 survivability by age rates, and 15 survivability by heart condition cause rates.

Execute the program as follows: java HeartTransplant < data.txt

The file data.txt is redirected as the input for the program HeartTransplant and can be read using the StdIn library functions StdIn.readInt() and StdIn.readDouble().
