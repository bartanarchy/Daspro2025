## QUESTION STAR
1. If in for loop, the initialization i = 1 is changed to i = 0, what is the result? How can It
be like that?
2. If in for loop, condition i <= N is changed to i > N, what is the result? How can It be
like that?
3. If in for loop, the condition for step i++ is changed to i-- what is the result? How can
It be like that?

##  ANSWER STAR
1. It will print one more star than before. Because now the loop starts from 0 and ends at N.
So, for example, if N = 5, it prints stars for i = 0, 1, 2, 3, 4, 5 — that’s 6 times instead of 5
2. It prints nothing at all. Because from the start, i is 1, and 1 > N is false (for most positive numbers).
Since the condition is false right away, the loop never runs
3. The program will run forever. When i goes down (i--), it becomes smaller (0, -1, -2, …), so i <= N is always true it never stops

## QUESTION SQUARE
1. Pay attention to outer loop. If in for syntax, the initialization iOuter = 1 is changed to
iOuter = 0, what is the result? How can it be like that?
2. Return the program to normal with initialization iOuter = 1. Then pay attention to the
inner loop. If in for syntax, the initialization i = 1 is changed to i = 0, what is the result?
How can it be like that?
3. What is the difference between outer loop and inner loop?
4. Why is it necessary to add the syntax System.out.println(); under inner loop? What
will happen if the syntax is omitted?
5. Commit and push the changes to GitHub

## ANSWER SQUARE
1. The program will print one extra row of stars. Because the outer loop starts from 0 and goes up to N.
That means it runs (N + 1) times instead of N times.
2. Each row will have one extra star.The inner loop controls how many stars are printed per row.
Starting from 0 means the loop runs (N + 1) times.
So instead of printing 5 stars, it prints 6 stars per line.
3. - The outer loop controls how many rows of stars are printed
   - The inner loop controls how many stars appear in each row.
4. Its needed to move to the next line after printing one full row of stars.
If you remove it, all the stars will be printed in one single long line, without line breaks

## QUESTION TRIANGLE
1. Look at the results, does the output produced with a value of N = 5 match the following
display?
2. If not, which parts should be improved or added? Describe any parts that need to be
improved or added!

## ASNWER TRIANGLE
1. No
2. The program needs to add the line System.out.println(); after the inner loop.
This is needed to move the cursor to a new line after each row of stars, so the triangle shape appears correctly.

## QUESTION NESTED LOOP
1. Explain the program flow in Experiment 5!
2. Modify the program to display an array using foreach!
3. Modify the program so that it can display the average value for each city!
4. Commit and push the changes to GitHub

## ANSWER NESTED LOOP
1.The first nested loop -> takes input for each city and day.
The second nested loop  -> displays the inputted data.
