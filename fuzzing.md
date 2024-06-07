# Lab Assignment 3: Part B

## Task 1:

The intense (for my computer) fuzzing made me realise a few things:
    
1. Whenever **two sequential** digits are entered, the program (unfortunately?) crashes.
2. When a **null character** is given at the beginning or in the end, the program crashes.

## Task 2:

Now, fuzzing led me to this result:

If the last crew member has been dismissed and the number of crew members abroad turns negative, then an attempt to land will lead to a program crash.

## Task 3: 

Fuzzing observations led me to this:

> (Crew Count < 0)

from which I understand that the operation creates a program crash.

