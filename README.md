# Maintenance-and-Evo-Assignment-3
Assignment 3 Repository

# ADDING THE REFACTORING
Please make a seperate branch with your refactoring, validate the changes first. Then merge into main (In this case MovieStoreSystem_RefactorPhase3.java)

# TEST CASES
When making refactoring, please make sure your code did not change the behaviour of the system. Feel free to use the following test cases to verify and validate the case.

## Success Cases - Add and Sort
**1. Verify if the system can allow for a new movie title to be added and that it will return a sorted list:**
- Showman
- Geostorm
- Apex

***Expected Results***
- Apex
- Geostorm
- Showman

**2. Verify if the system can allow for a new name to be added and that it will return a sorted list:**
- Leo
- Zong
- Jonas

***Expected Results***
- Jonas
- Leo
- Zong

## Search - Success
**1. Verify if can find a title:**
- Geostorm

***Expected Results***
- "The movie title is found"

**2. Verify if can find a member:**
- Jonas

***Expected Results***
- "The member is found"

## Search - Fail
**1. Verify if can find a title:**
- Star

***Expected Results***
- "The movie title is not found"

**2. Verify if can find a member:**
- Owen

***Expected Results***
- "The member is not found"

## Blank or Single Value handling
**1. Verify if the system can allow for a blank entry for titles and member names and not fail:**
- Literally enter a blank value for both

***Expected Results***
- No lists returned, but the system should not fail
- Should result in "not found" always

**2. Verify if the system can allow for one entry for titles and member names and not fail:**
- Literally one value for both

***Expected Results***
- Two lists returned and the system should not fail
- Searches should return either $item found (if entered valid entry) or $item not found (if invalid)




