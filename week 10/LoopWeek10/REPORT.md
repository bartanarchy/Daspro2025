## QUESTION FOR MULTIPLES
1. There are 3 main components in FOR loop. Based on experiment 1 above, identify and
explain these 3 components!
2. Explain how the following code works!
3. Modify the existing code by adding a new variable to calculate the average of all the
specified multiples!

## ANSWER FOR MULTIPLES
1. the for loop has three main parts: initialization, condition, and update. The initialization int i = 1 starts the loop with the value 1. The condition i <= 50 checks if the loop should keep running. The update i++ adds 1 to i each time the loop repeats.
2. The loop goes from 1 to 50, finds every number that is a multiple of the user’s input, adds them all together, and counts how many multiples there are.

## QUESTION DISPLAY TWO
1. Do modification to make the program produce similar result but WITHOUT IF statement.
Please insert a screenshot of your code to the report.
2. Do modification to make the program print like this following result. Please insert a
screenshot of your code to the report
## ANSWER DISPLAY TWO
1 and 2. i put the screenshot on the file part  

## QUESTION THE TRIANGLE
1. Do a modification on the program therefore your program utilize FOR statement
rather than WHILE statement.
2. Explain the meaning of s += “ *” and why is it possible?

## ANSWER THE TRIANGLE
2. means that a space and a star are added to the string s each time the loop runs. It works because Java allows the += operator to join strings together. Each time the program repeats, a new " *" is added to the end of s

## QUESTION DO WHILE LEAVE ENTITLEMENT
1. What is the use of the BREAK within the loop syntax?
2. Modify the program so that if the number of leave days requested is greater than the
remaining entitlement, the program does not stop, allowing the user to enter the
number of days according to the entitlement.
3. Commit and push the program code to GitHub.
4. When typing "t" as the confirmation input, what happens? Why?
5. Modify the program code so that when the user enters "t" as the confirmation input, the
program will stop

## ANSWER DO WHILE LEAVE ENTITLEMENT
1. break is used when the user tries to take more leave days than they have. When that happens, the program shows a message — “You don’t have enough leave entitlement.” — and then break stops the loop right away, so the program doesn’t keep asking for more input
4. the program will keep asking or looping about your leave or not, because the program only check "y" and "n" theres no "t"
