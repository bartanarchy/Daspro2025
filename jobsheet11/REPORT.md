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


